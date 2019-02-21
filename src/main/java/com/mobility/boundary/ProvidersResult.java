package com.mobility.boundary;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.proxy.HibernateProxy;

import com.mobility.DateTimeUtil;
import com.mobility.boundary.ProvidersResult.Lists.ProviderViewTransformer;
import com.mobility.boundary.ProvidersResult.ProviderViewShort.Address.City;
import com.mobility.boundary.ProvidersResult.ProviderViewShort.Address.Country;
import com.mobility.entity.Provider;

@XmlRootElement
public class ProvidersResult extends Result {

	public ProvidersResult() {
		super(Result.Outcome.SUCCESS, "");
	}

	public ProvidersResult(List<?> results, int nextPageToken,
			int maxFetchSize, ProviderViewTransformer transformer, UriInfo uri) {
		super(Result.Outcome.SUCCESS, "");
		this.uri = uri;
		this.results = Lists.transform(results, transformer);
		int factor = (size() / maxFetchSize);
		this.nextPageToken = factor * (nextPageToken + maxFetchSize);
	}

	private UriInfo uri;
	private List<Link> links = new LinkedList<>();
	private int nextPageToken;
	private Object results;
	private Map<String, String> networks;
	private Map<String, String> categories;
	private Map<String, String> cities;

	public List<Link> getLinks() {
		if (nextPageToken > 0) {
			links.add(new Link(UriBuilder.fromUri((uri.getRequestUri()))
					.replaceQueryParam("nextPageToken", nextPageToken).build(),
					RelativePath.NEXT_PAGE.name()));
		}
		return links;
	}

	public Object getResults() {
		return results;
	}

	@SuppressWarnings("unchecked")
	private int size() {
		int size = 0;
		if (results instanceof Collection) {
			size = ((Collection<?>) results).size();
		} else if (results instanceof Map) {
			for (Collection<?> c : ((Map<?, List<?>>) results).values()) {
				size += c.size();
			}
		}
		return size;
	}

	public Map<String, String> getNetworks() {
		networks = new HashMap<>();
		networks.put("102", "Tawuniya".concat("|").concat("التعاونية"));
		//networks.put("200", "UCA".concat("|").concat(" "));
		networks.put("201", "Malath".concat("|").concat("ملاذ للتامين"));
		//networks.put("202", "SGI".concat("|").concat(" "));
		//networks.put("203", "GCI".concat("|").concat(" "));
		networks.put("204", "AXA".concat("|").concat("اكسا للتأمين"));
		networks.put("205", "SAICO".concat("|").concat("الشركة العربية السعودية للتأمين التعاوني"));
		//networks.put("206", "Weqaya".concat("|").concat(" "));
		networks.put("207", "Rajhi".concat("|").concat("تكافل الراجحي"));
		networks.put("208", "SAGR".concat("|").concat("شركة الصقر للتأمين التعاوني"));
		networks.put("209", "Walaa".concat("|").concat("الشركة السعودية المتحدة للتأمين التعاوني"));
		networks.put("300", "MedGulf".concat("|").concat("شركة المتوسط والخليج للتأمين وإعادة التأمين التعاوني"));
		networks.put("301", "ArabianShield".concat("|").concat("الدرع العربي للتأمين"));
		networks.put("302", "ASF".concat("|").concat("شركة أليانز السعودي الفرنسي للتأمين التعاوني"));
		//networks.put("303", "Weqaya".concat("|").concat(" "));
		//networks.put("305", "SACB".concat("|").concat(" "));
		return networks;
	}

	public Map<String, String> getCategories() {
		categories = new HashMap<>();
		categories.put("1", "Hospital/Clinic");
		categories.put("5", "Pharmacy");
		return categories;
	}

	public Map<String, String> getCities() {
		cities = new HashMap<>();
		cities.put("1", "Riyadh".concat("|").concat("الرياض"));
		cities.put("2", "Jeddah".concat("|").concat("جدة"));
		cities.put("3", "Dammam".concat("|").concat("الدمام"));
		cities.put("4", "Khobar".concat("|").concat("الخبر‎‎"));
		cities.put("5", "Dhahran".concat("|").concat("الظهران"));
		cities.put("6", "Makkah".concat("|").concat("مكة"));
		cities.put("7", "Madinah Munawwarah".concat("|").concat("المدينة المنورة"));
		cities.put("8", "Al Taif".concat("|").concat("الطائف"));
		cities.put("9", "Abha".concat("|").concat("أبها"));
		cities.put("17", "Ahsa".concat("|").concat("الأحساء‎‎"));
		cities.put("19", "Al Baha".concat("|").concat("الباحة"));
		cities.put("22", "Al Kharj".concat("|").concat("الخرج"));
		cities.put("26", "Al Qateef".concat("|").concat("القطيف"));
		cities.put("44", "Bisha".concat("|").concat("بيشة"));
		cities.put("46", "Buraidah".concat("|").concat("بريدة"));
		cities.put("50", "Hafouf".concat("|").concat("الهفوف"));
		cities.put("13", "Yanbu".concat("|").concat("ينبع البحر"));
		return cities;
	}

	@Override
	public String getOutcome() {
		if (size() <= 0) {
			return Result.Outcome.FAILURE.value();
		}
		return outcome;
	}

	@Override
	public String getMessage() {
		if (size() <= 0) {
			return "Sorry! Found provider(s) 0.";
		}
		return message;
	}

	static class Lists {

		public static Object transform(List<?> src,
				ProviderViewTransformer transformer) {
			Object dest = null;

			switch (transformer) {
			case PROVIDER_MEDIUM_VIEW:
				dest = toProviderMediumView(src);
				break;
			case PROVIDER_SHORT_VIEW:
				dest = toProviderShortView(src);
				break;
			case PROVIDER_SECTION_VIEW:
				Map<Character, List<?>> map = new HashMap<>(0);
				toProviderSectionView(src, map, '\u0000', 0, null == src ? 0
						: src.size());
				map.remove('\u0000');
				dest = map;
				break;
			case PROVIDER_BLOCK_VIEW:
				dest = toProviderBlockView(src);
				break;
			}
			return dest;
		}

		@SuppressWarnings("unchecked")
		private static List<ProviderViewShort> toProviderShortView(List<?> src) {
			List<ProviderViewShort> results = new LinkedList<>();
			for (Provider entity : (List<Provider>) src) {
				if (!(entity instanceof HibernateProxy)) {
					results.add(toShort(entity));
				}
			}
			return results;
		}

		@SuppressWarnings("unchecked")
		private static void toProviderSectionView(List<?> src,
				Map<Character, List<?>> dest, char header, int from, int to) {
			if (from >= to) {
				return;
			}
			List<ProviderViewShort> views = new LinkedList<>();
			int length = 0;
			char footer = '\u0000';
			for (Provider entity : (List<Provider>) src.subList(from, to)) {
				if (header != entity.getEnName().charAt(0)) {
					footer = entity.getEnName().charAt(0);
					break;
				}
				length++;
				if (!(entity instanceof HibernateProxy)) {
					views.add(toShort(entity));
				}
			}
			dest.put(header, views);
			toProviderSectionView(src, dest, footer, from + length++,
					src.size());
		}

		@SuppressWarnings("unchecked")
		private static Map<?, ?> toProviderBlockView(List<?> src) {
			char block = ' ';
			List<ProviderViewShort> views = new LinkedList<>();
			Map<Character, List<?>> dest = new HashMap<>();
			for (Provider entity : (List<Provider>) src) {
				if (!(entity instanceof HibernateProxy)) {
					views.add(toShort(entity));
				}
			}
			dest.put(block, views);
			return dest;
		}

		@SuppressWarnings("unchecked")
		private static List<ProviderViewMedium> toProviderMediumView(List<?> src) {
			List<ProviderViewMedium> results = new LinkedList<>();
			for (Object[] obj : (List<Object[]>) src) {
				Provider entity = (Provider) obj[0];
				Double dist = (Double) obj[1];
				if (!(entity instanceof HibernateProxy)) {
					entity.getPlace().setDistance(dist);
					results.add(toMedium(entity));
				}
			}
			return results;
		}

		private static <S extends Provider> ProviderViewMedium toMedium(S src) {
			ProviderViewMedium view = new ProviderViewMedium(src.getId(),
					src.getEnName(), src.getArName(), src.getGeometry().getLatitude(), src
							.getGeometry().getLongitude(), src.getPlace()
							.getDistance(), false, null);
			view.setAddress(src.getPlace().getEnStreet(), src.getPlace()
					.getCity().getId(), src.getPlace().getCity().getEnName(),
					"1", "Saudi Arabia");
			return view;
		}

		private static <S extends Provider> ProviderViewShort toShort(S src) {
			ProviderViewShort view = new ProviderViewShort(src.getId(),
					src.getEnName(), src.getArName(), null);
			view.setAddress(src.getPlace().getEnStreet(), src.getPlace()
					.getCity().getId(), src.getPlace().getCity().getEnName(),
					"1", "Saudi Arabia");
			return view;
		}

		public enum ProviderViewTransformer {
			PROVIDER_SHORT_VIEW, PROVIDER_MEDIUM_VIEW, PROVIDER_SECTION_VIEW, PROVIDER_BLOCK_VIEW;
		}
	}

	static class ProviderViewShort {
		private String id;
		private String name;
		private String nameAr;
		private byte[] icon;
		private Address address;
		private String coverageResult="";

		public ProviderViewShort(String id, String name, String nameAr, byte[] icon) {
			this.id = id;
			this.name = name;
			this.nameAr = nameAr;
			this.icon = icon;
		}

		public void setAddress(String street, String cityId, String cityName,
				String countryId, String countryName) {
			address = new Address();
			address.street = street;
			address.city = new City(cityId, cityName);
			address.country = new Country(countryId, countryName);
		}
		
		public String getCoverageResult() {
			return coverageResult;
		}

		public void setCoverageResult(String coverageResult) {
			this.coverageResult = coverageResult;
		}

		public String getId() {
			return id;
		}

		public String getName() {
			return name;
		}
		
		public String getNameAr() {
			return nameAr;
		}

		public byte[] getIcon() {
			return icon;
		}

		public Address getAddress() {
			return address;
		}

		static class Address {
			public String street;
			public City city;
			public Country country;

			static class City {
				public String id;
				public String name;

				public City(String id, String name) {
					this.id = id;
					this.name = name;
				}
			}

			static class District {
				public String id;
				public String name;

				public District(String id, String name) {
					this.id = id;
					this.name = name;
				}
			}

			static class Country {
				public String id;
				public String name;

				public Country(String id, String name) {
					this.id = id;
					this.name = name;
				}
			}
		}
	}

	static class ProviderViewSection {
		private Map<Character, List<?>> block;

		public ProviderViewSection(Character section, List<?> views) {
			if (!section.equals('\u0000')) {
				block = new HashMap<>(1);
				block.put(section, views);
			}
		}

		public Map<Character, List<?>> getBlock() {
			return block;
		}
	}

	static class ProviderViewMedium extends ProviderViewShort {
		private Double distance;
		private boolean openNow;
		private Double lat;
		private Double lng;

		public ProviderViewMedium(String id, String name, String nameAr, Double lat,
				Double lng, Double distance, Boolean openNow, byte[] icon) {
			super(id, name, nameAr, icon);
			this.lat = lat;
			this.lng = lng;
			this.distance = distance;
			this.openNow = openNow;
		}

		public Double getDistance() {
			return distance;
		}

		public boolean isOpenNow() {
			return openNow;
		}

		public Double getLat() {
			return lat;
		}

		public Double getLng() {
			return lng;
		}
	}
}

