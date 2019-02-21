package com.mobility.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-12-06T20:30:37.193+0300")
@StaticMetamodel(Photo.class)
public class Photo_ {
	public static volatile SingularAttribute<Photo, String> place;
	public static volatile SingularAttribute<Photo, byte[]> image;
	public static volatile SingularAttribute<Photo, Provider> provider;
}
