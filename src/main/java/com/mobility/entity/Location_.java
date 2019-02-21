package com.mobility.entity;

import com.mobility.entity.Location.City;
import com.mobility.entity.Location.District;
import com.mobility.entity.Location.Geometry;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-11-29T20:41:49.190+0300")
@StaticMetamodel(Location.class)
public class Location_ {
	public static volatile SingularAttribute<Location, String> EnStreet;
	public static volatile SingularAttribute<Location, String> ArStreet;
	public static volatile SingularAttribute<Location, City> city;
	public static volatile SingularAttribute<Location, String> postalCode;
	public static volatile SingularAttribute<Location, Geometry> geometry;

	@StaticMetamodel(City.class)
	public static class City_ {
		public static volatile SingularAttribute<City, String> id;
		public static volatile SingularAttribute<City, String> EnName;
		public static volatile SingularAttribute<City, String> ArName;
	}

	@StaticMetamodel(District.class)
	public static class District_ {
		public static volatile SingularAttribute<District, String> id;
		public static volatile SingularAttribute<District, String> EnName;
		public static volatile SingularAttribute<District, String> ArName;
	}

	@StaticMetamodel(Geometry.class)
	public static class Geometry_ {
		public static volatile SingularAttribute<Geometry, Double> lat;
		public static volatile SingularAttribute<Geometry, Double> lng;
	}
}
