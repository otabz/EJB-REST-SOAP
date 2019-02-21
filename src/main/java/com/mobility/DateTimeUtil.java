package com.mobility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {

	public static String todayDayOfWeek() {
		Calendar c = Calendar.getInstance();
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return String.valueOf(dayOfWeek);
	}

	public static String nowTime24Hour() {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		return df.format(date);
	}
}
