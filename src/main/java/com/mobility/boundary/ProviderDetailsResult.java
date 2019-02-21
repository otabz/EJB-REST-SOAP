package com.mobility.boundary;

import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.EntityNotFoundException;
import javax.ws.rs.core.UriInfo;
import com.mobility.boundary.ProvidersResult.ProviderViewMedium;
import com.mobility.entity.Provider;
import com.mobility.entity.TimePeriod;
import com.waseel.DepartmentCodeST;


public class ProviderDetailsResult extends Result {

	private List<Link> links = new LinkedList<>();

	private ProviderViewFull details;

	public ProviderDetailsResult(Provider details, UriInfo uri) {
		super(Result.Outcome.SUCCESS, "");
		this.details = Object.transform(details);
		addLinks(uri);
	}

	public void addLinks(UriInfo uri) {
		String check = uri.getPath().concat(
				RelativePath.ELIGIBILITY_CHECK.value());
		String inquiry = uri.getPath().concat(
				RelativePath.APPROVAL_INQUIRY.value());
		links.add(new Link(uri.getBaseUriBuilder().path(check).build(),
				RelativePath.ELIGIBILITY_CHECK.name()));
		links.add(new Link(uri.getBaseUriBuilder().path(inquiry).build(),
				RelativePath.APPROVAL_INQUIRY.name()));

	}

	public ProviderViewFull getDetails() {
		return this.details;
	}

	public List<Link> getLinks() {
		return links;
	}

	static class Object {

		public static ProviderViewFull transform(Provider src) {
			ProviderViewFull view = new ProviderViewFull(src.getId(),
					src.getEnName(), src.getArName(), Double.NaN, false, null,
					null, src.getPhone());
			view.setAddress(src.getPlace().getEnStreet(), src.getPlace()
					.getCity().getId(), src.getPlace().getCity().getEnName(),
					"1", "Saudi Arabia");
			if(src.getPlace() != null && src.getPlace().getGeometry() != null) {
				view.setGeometry(src.getPlace().getGeometry().getLat(), src.getPlace().getGeometry().getLng());
			}
			view.setTimings(new HashSet<TimePeriod>(1));
			view.setLazyPhoto(src);
			return view;
		}
	}

	static class ProviderViewFull extends ProviderViewMedium {
		private Set<TimePeriod> periods;
		private Double lat;
		private Double lng;
		private URL url;
		private String phone;
		private byte[] photo;
		private Map<String, String> departments;

		public ProviderViewFull(String id, String name, String nameAr, Double distance,
				Boolean openNow, byte[] icon, URL url, String phone) {
			super(id, name, nameAr, null, null, distance, openNow, icon);
			this.url = url;
			this.phone = phone;
		}

		public void setTimings(Set<TimePeriod> periods) {
			for (TimePeriod period : periods) {
				TimePeriod timing = new TimePeriod();
				timing.setDay(period.getDay());
				timing.setOpen(period.getOpen());
				timing.setClose(period.getClose());
				timing.setProvider(period.getProvider());
				getTimings().add(timing);
			}
		}

		public Set<TimePeriod> getTimings() {
			if (null == periods) {
				periods = new HashSet<>();
			}
			return this.periods;
		}

		public void setGeometry(Double lat, Double lng) {
			this.lat = lat;
			this.lng = lng;
		}

		public void setLazyPhoto(Provider src) {
			try {
				this.photo = src.getPhoto().getImage();
			} catch (EntityNotFoundException enfe) {
			}
		}

		public Double getLat() {
			return this.lat;
		}

		public Double getLng() {
			return this.lng;
		}

		public URL getUrl() {
			return this.url;
		}

		public String getPhone() {
			return this.phone;
		}

		public byte[] getPhoto() {
			return this.photo;
		}

		public Map<String, String> getDepartments() {
			departments = new HashMap<String, String>();
			departments.put(DepartmentCodeST.VALUE_36.value(), "Optical");
			departments.put(DepartmentCodeST.VALUE_10.value(), "General Practice");
			departments.put(DepartmentCodeST.VALUE_7.value(), "Ear Nose Throat");
			departments.put(DepartmentCodeST.VALUE_13.value(), "Gynecology");
			departments.put(DepartmentCodeST.VALUE_28.value(), "Paediatrics");
			departments.put(DepartmentCodeST.VALUE_40.value(), "Maternity");
			departments.put(DepartmentCodeST.VALUE_4.value(), "Dental");
			return departments;
		}
	}
}

