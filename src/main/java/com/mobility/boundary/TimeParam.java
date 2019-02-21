package com.mobility.boundary;


public class TimeParam {

	private int day;
	private String time;
	
	public TimeParam(String day, String time) {
		setDay(day);
		this.time = time;
	}
	private void setDay(String day) {
		this.day =  Integer.valueOf(day);
	}
	public int getDay() {
		return day;
	}
	public String getTime() {
		return time;
	}	
}
