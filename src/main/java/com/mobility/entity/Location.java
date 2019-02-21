package com.mobility.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import org.hibernate.search.annotations.IndexedEmbedded;


@Embeddable
public class Location {

	@Embeddable
	public static class Geometry {

		private double lat;

		private double lng;
		
		public Geometry() {
		}
		
		public Geometry(double lat, double lng) {
			this.lat = lat;
			this.lng = lng;
		}

		public double getLat() {
			return lat;
		}

		public void setLat(double lat) {
			this.lat = lat;
		}

		public double getLng() {
			return lng;
		}

		public void setLng(double lng) {
			this.lng = lng;
		}

		@Override
		public String toString() {
			return this.getLat() + ", " + this.getLng();
		}
	}

	@Entity(name="city")
	//@FilterDef(name="cityFilter", parameters={
	//	@ParamDef(name="cityId", type="integer" )
	//})
	public static class City {

		@Id
		private String id;

		@Column(name="name_en")
		private String EnName;
		
		@Column(name="name_ar")
		private String ArName;
		
		//@OneToOne(fetch = FetchType.EAGER)
		//private Provider provider;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
		
		@Override
		public String toString() {
			return this.getId() + ", " + this.getEnName();
		}

		public String getEnName() {
			return EnName;
		}

		public void setEnName(String enName) {
			EnName = enName;
		}

		public String getArName() {
			return ArName;
		}

		public void setArName(String arName) {
			ArName = arName;
		}

	}

	@Entity(name="district")
	public static class District {

		@Id
		private String id;

		@Column(name="name_en")
		private String EnName;
		
		@Column(name="name_ar")
		private String ArName;
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
		
		@Override
		public String toString() {
			return this.getId() + ", " + this.getEnName();
		}

		public String getEnName() {
			return EnName;
		}

		public void setEnName(String enName) {
			EnName = enName;
		}

		public String getArName() {
			return ArName;
		}

		public void setArName(String arName) {
			ArName = arName;
		}
	}
	
	public static class Country {
		
		private String id;

		private String name;
		

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return this.getId() + ", " + this.getName();
		}
	}

	@Column(name="street_en")
	private String EnStreet;
	
	@Column(name="street_ar")
	private String ArStreet;

	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="city")
	@IndexedEmbedded
	//@FilterJoinTable(name="cityFilter", condition=":cityId <> id")
	private City city;

	//@OneToOne
	//@JoinColumn(name="district")
	@Transient
	private District district;

	@Transient
	private Country country;

	@Column(name="postal_code")
	private String postalCode;

	@Embedded
	private Geometry geometry;
	
	@Transient
	private Double distance;

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	
	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getEnStreet() {
		return EnStreet;
	}

	public void setEnStreet(String enStreet) {
		EnStreet = enStreet;
	}

	public String getArStreet() {
		return ArStreet;
	}

	public void setArStreet(String arStreet) {
		ArStreet = arStreet;
	}

}

