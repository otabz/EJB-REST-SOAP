package com.mobility.entity;

import java.sql.Time;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-12-06T20:23:27.570+0300")
@StaticMetamodel(TimePeriod.class)
public class TimePeriod_ {
	public static volatile SingularAttribute<TimePeriod, Integer> day;
	public static volatile SingularAttribute<TimePeriod, String> provider;
	public static volatile SingularAttribute<TimePeriod, Time> open;
	public static volatile SingularAttribute<TimePeriod, Time> close;
}
