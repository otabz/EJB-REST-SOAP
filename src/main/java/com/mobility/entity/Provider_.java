package com.mobility.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-12-13T21:12:06.008+0300")
@StaticMetamodel(Provider.class)
public class Provider_ {
	public static volatile SingularAttribute<Provider, String> id;
	public static volatile SingularAttribute<Provider, String> enName;
	public static volatile SingularAttribute<Provider, String> arName;
	public static volatile SingularAttribute<Provider, Category> category;
	public static volatile SingularAttribute<Provider, Location> place;
	public static volatile SetAttribute<Provider, Association> associations;
	public static volatile SingularAttribute<Provider, Photo> photo;
	public static volatile SingularAttribute<Provider, String> phone;
}
