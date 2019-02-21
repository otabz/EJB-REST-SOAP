package com.mobility.boundary;

import java.sql.Time;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.ws.rs.core.UriInfo;

import org.apache.lucene.search.Sort;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.search.FullTextQuery;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.hibernate.search.query.dsl.Unit;
import org.hibernate.search.spatial.DistanceSortField;

import com.mobility.boundary.Providers.QueryParamFilters.ParamCriteria;
import com.mobility.boundary.Providers.QueryParamFilters.ParamCriteria.CriteriaName;
import com.mobility.boundary.Providers.QueryParamFilters.ParamFilter;
import com.mobility.boundary.Providers.QueryParamFilters.ParamFilter.FilterName;
import com.mobility.boundary.ProvidersResult.Lists.ProviderViewTransformer;
import com.mobility.entity.Provider;

@Stateless
public class Providers {

	public static final int MAX_FETCH_SIZE_NEARBY = 10;
	public static final int MAX_FETCH_SIZE_TEXT = 40;
	public static final int MAX_FETCH_SIZE_COVERAGE = 2;
	
	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Provider> all(int nextPageToken, QueryParamFilters filters, int fetchSize) {
		final CriteriaQuery<Provider> criteriaQuery = em.getCriteriaBuilder()
				.createQuery(Provider.class);
		final Root<Provider> providerRoot = criteriaQuery.from(Provider.class);

		if(filters.getParamFilter(FilterName.CITY).apply()) {
			Predicate cityFilter = em
			.getCriteriaBuilder().equal(
					providerRoot.get("place").get("city").get("id"),
					filters.getFilterValue(FilterName.CITY));
			criteriaQuery.where(cityFilter);
		}
		criteriaQuery.orderBy(
				em.getCriteriaBuilder().asc(providerRoot.get("enName")));
		Query q = em.createQuery(criteriaQuery).setFirstResult(nextPageToken)
				.setMaxResults(fetchSize);
		List<Provider> list = q.getResultList();
		return list;
	}
	
	public ProvidersResult allAsResult(int nextPageToken, String city,
			boolean coverage, UriInfo uri) {
		QueryParamFilters filters = new QueryParamFilters.Builder().city(city)
				.build();

		int fetchSize = coverage ? MAX_FETCH_SIZE_COVERAGE
				: MAX_FETCH_SIZE_TEXT;
		ProviderViewTransformer view = ProviderViewTransformer.PROVIDER_SECTION_VIEW;
		//coverage ? ProviderViewTransformer.PROVIDER_SHORT_VIEW
				//: ProviderViewTransformer.PROVIDER_SECTION_VIEW;
		ProvidersResult result = new ProvidersResult(all(nextPageToken,
				filters, fetchSize), nextPageToken, fetchSize, view, uri);
		return result;
	}
	
	public ProviderDetailsResult providerAsResult(String id, UriInfo uri) {
		Provider details = find(id);
		ProviderDetailsResult result = new ProviderDetailsResult(details, uri);
		return result;
	}
	
	public Provider find(String id) {
		return em.find(Provider.class, id);
	}
	
	public ProvidersResult searchNearByAsResult(int nextPageToken,
			double latitude, double longitude, String rankedBy, String payer,
			String type, boolean openNow, String day, String time,
			boolean coverage, UriInfo uri) {

		QueryParamFilters filters = new QueryParamFilters.Builder()
				.payer(payer).category(type).opneNow(openNow).day(day)
				.time(time).build();

		int fetchSize = coverage ? MAX_FETCH_SIZE_COVERAGE
				: MAX_FETCH_SIZE_NEARBY;
		ProvidersResult result = new ProvidersResult(searchNearBySorted(
				nextPageToken, latitude, longitude, fetchSize, filters),
				nextPageToken, fetchSize,
				ProviderViewTransformer.PROVIDER_MEDIUM_VIEW, uri);
		return result;
	}
	
	public List<Provider> searchNearBySorted(int nextPageToken,
			double latitude, double longitude, int fetchSize, QueryParamFilters filters) {

		FullTextSession fullTextSession = createFullTextSession();
		QueryBuilder builder = createBuilder(fullTextSession, Provider.class);

		org.apache.lucene.search.Query luceneQuery = builder.spatial().onField("geometry").within(80, Unit.KM)
				.ofLatitude(latitude).andLongitude(longitude).createQuery();

		FullTextQuery hibQuery = createFullTextQuery(fullTextSession,
				luceneQuery, filters);

		hibQuery.setProjection(FullTextQuery.THIS,
				FullTextQuery.SPATIAL_DISTANCE)
				.setSpatialParameters(latitude, longitude, "geometry")
				.setFirstResult(nextPageToken)
				.setMaxResults(fetchSize)
				.setCriteriaQuery(createCriteria(fullTextSession, filters));

		/* rankedBy distance */
	
		Sort distanceSort = new Sort(new DistanceSortField(latitude, longitude,
				"geometry"));
		hibQuery.setSort(distanceSort);
		/*                  */
		@SuppressWarnings("unchecked")
		List<Provider> results = hibQuery.list();
		return results;
	}
	
	private FullTextSession createFullTextSession() {
		Session session = em.unwrap(Session.class);
		FullTextSession fullTextSession = Search.getFullTextSession(session);
		return fullTextSession;
	}

	private QueryBuilder createBuilder(FullTextSession session,
			Class<?> forEntity) {
		QueryBuilder builder = session.getSearchFactory().buildQueryBuilder()
				.forEntity(forEntity).get();
		return builder;
	}

	private FullTextQuery createFullTextQuery(FullTextSession session,
			org.apache.lucene.search.Query luceneQuery,
			QueryParamFilters filters) {
		FullTextQuery hibQuery = session.createFullTextQuery(luceneQuery,
				Provider.class);
		for (ParamFilter filter : filters.getFilters()) {
			if (filter.apply()) {
				String value = filters.getFilterValue(filter);
				hibQuery.enableFullTextFilter(filter.name().value())
						.setParameter("value", value);
			}
		}
		return hibQuery;
	}

	private Criteria createCriteria(FullTextSession session,
			QueryParamFilters filters) {
		Criteria criteria = null;
		for (ParamCriteria key : filters.getCriterias()) {
			if (!key.apply()) {
				return criteria;
			}
			switch (key.name()) {
			case TIME:
				String time = filters.getCriteriaValue(key);
				Criterion conj = Restrictions.and(
						Restrictions.le("periods.open", Time.valueOf(time)),
						Restrictions.ge("periods.close", Time.valueOf(time)));
				criteria = session.createCriteria(Provider.class, "provider")
						.setFetchMode("provider.periods", FetchMode.JOIN)
						.createAlias("provider.periods", "periods").add(conj);
				break;
			}
		}
		return criteria;
	}
	
	public List<Provider> searchByText(int nextPageToken, String q,
			QueryParamFilters filters) {
		FullTextSession fullTextSession = createFullTextSession();
		QueryBuilder builder = createBuilder(fullTextSession, Provider.class);

				org.apache.lucene.search.Query query = builder.phrase().withSlop(2).onField("nGramName")
				   .andField("edgeNGramName").boostedTo(5)
				   .sentence(q.toLowerCase()).createQuery();

				 FullTextQuery hibQuery = fullTextSession.createFullTextQuery(
				    query, Provider.class);
				 
		hibQuery.setFirstResult(nextPageToken).setMaxResults(
				MAX_FETCH_SIZE_TEXT);

		@SuppressWarnings("unchecked")
		List<Provider> results = hibQuery.list();
		return results;
	}

	public ProvidersResult searchByTextAsResult(int nextPageToken,
			String query, String city, UriInfo uri) {
		QueryParamFilters filters = new QueryParamFilters.Builder().city(city)
				.build();

		ProvidersResult result = new ProvidersResult(searchByText(
				nextPageToken, query, filters), nextPageToken,
				MAX_FETCH_SIZE_TEXT,
				ProviderViewTransformer.PROVIDER_BLOCK_VIEW, uri);
		return result;
	}

	
	static class QueryParamFilters {
		Map<ParamFilter, String> filters;
		Map<ParamCriteria, String> criterias;

		static class ParamCriteria {

			private final boolean apply;
			private final CriteriaName name;

			ParamCriteria(CriteriaName name, boolean apply) {
				this.name = name;
				this.apply = apply;
			}

			public CriteriaName name() {
				return this.name;
			}

			public boolean apply() {
				return this.apply;
			}

			enum CriteriaName {
				TIME;
			}

		}

		static class ParamFilter {

			private final boolean apply;
			private final FilterName name;

			public ParamFilter(FilterName name, boolean apply) {
				this.name = name;
				this.apply = apply;
			}

			public FilterName name() {
				return this.name;
			}

			public boolean apply() {
				return this.apply;
			}

			enum FilterName {
				NETWORK("payerFilter"), CATEGORY("categoryFilter"), DAY(
						"openFilter"), CITY("cityFilter");

				private final String value;

				private FilterName(String value) {
					this.value = value;
				}

				public String value() {
					return this.value;
				}
			}
		}

		public QueryParamFilters() {
			this.filters = new HashMap<>(2);
			this.criterias = new HashMap<>(1);
		}

		public void put(FilterName filterName, boolean apply, String value) {
			ParamFilter filter = new ParamFilter(filterName, apply
					&& (null != value));
			filters.put(filter, value);
		}

		public void put(CriteriaName name, boolean apply, String value) {
			ParamCriteria criteria = new ParamCriteria(name, apply);
			criterias.put(criteria, value);
		}

		public Set<ParamFilter> getFilters() {
			return filters.keySet();
		}

		// public Set<String> getFilters() {
		// return filters.keySet();
		// }

		public String getFilterValue(ParamFilter key) {
			return filters.get(key);
		}

		public String getFilterValue(FilterName key) {
			for (ParamFilter filter : filters.keySet()) {
				if (filter.name().equals(key)) {
					return filters.get(filter);
				}
			}
			return null;
		}
		
		public ParamFilter getParamFilter(FilterName key) {
			for (ParamFilter filter : filters.keySet()) {
				if (filter.name().equals(key)) {
					return filter;
				}
			}
			return null;
		}

		public Set<ParamCriteria> getCriterias() {
			return criterias.keySet();
		}

		/*
		 * public boolean containsCriteria(CriteriaName key) { for
		 * (ParamCriteria criteria : criterias.keySet()) { if
		 * (criteria.name().equals(key)) { return true; } } return false; }
		 */

		public String getCriteriaValue(ParamCriteria key) {
			return criterias.get(key);
		}

		public String getCriteriaValue(CriteriaName key) {
			for (ParamCriteria criteria : criterias.keySet()) {
				if (criteria.name().equals(key)) {
					return criterias.get(criteria);
				}
			}
			return null;
		}

		public boolean contains(FilterName filterName) {
			boolean found = false;
			for (ParamFilter filter : filters.keySet()) {
				if (filter.name().equals(filterName)) {
					found = true;
					break;
				}
			}
			return found;
		}

		static class Builder {
			private String payer;
			private String category;
			private String day;
			private String time;
			private boolean openNow;
			private String city;

			public Builder payer(String payer) {
				this.payer = payer;
				return this;
			}

			public Builder category(String cat) {
				this.category = cat;
				return this;
			}

			public Builder opneNow(boolean openNow) {
				this.openNow = openNow;
				return this;
			}

			public Builder day(String day) {
				this.day = day;
				return this;
			}

			public Builder time(String time) {
				this.time = time;
				return this;
			}

			public Builder city(String city) {
				this.city = city;
				return this;
			}

			public QueryParamFilters build() {
				QueryParamFilters filters = new QueryParamFilters();
				filters.put(FilterName.NETWORK, true, payer);
				filters.put(FilterName.CATEGORY, true, category);
				filters.put(FilterName.DAY, openNow, day);
				filters.put(CriteriaName.TIME, openNow, time);
				filters.put(FilterName.CITY, true, city);
				return filters;
			}
		}
	}
}
