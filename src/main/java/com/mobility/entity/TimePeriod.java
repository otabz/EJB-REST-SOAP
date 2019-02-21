package com.mobility.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormatSymbols;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.DateBridge;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Resolution;


@Entity(name = "opening_hour")
public class TimePeriod implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2661260492439947928L;

	@Id
	private int day;

	@Id
	@Column(name = "provider_id")
	private String provider;

	@Column(name = "open_time")
	@Field(analyze=Analyze.NO)
	@DateBridge(resolution=Resolution.MINUTE)
	private Time open;

	@Column(name = "close_time")
	@Field(analyze=Analyze.NO)
	@DateBridge(resolution=Resolution.MINUTE)
	private Time close;

	public Time getOpen() {
		return this.open;
	}

	public Time getClose() {
		return this.close;
	}

	public String toString() {
		return this.getDay() + " opens at " + this.getOpen() + " close at "
				+ this.getClose();
	}

	public void setOpen(Time time) {
		this.open = time;
	}

	public void setClose(Time time) {
		this.close = time;
	}

	public String getLocalizedDay() {
		DateFormatSymbols symbols = new DateFormatSymbols();
		return symbols.getWeekdays()[this.getDay() + 1];
	}

	public String getShortLocalizedDay() {
		DateFormatSymbols symbols = new DateFormatSymbols();
		return symbols.getShortWeekdays()[this.getDay() + 1];
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

}
