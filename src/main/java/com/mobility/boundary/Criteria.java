package com.mobility.boundary;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import com.mobility.boundary.Credentials.Card;

public class Criteria {

	private Card card;
	private Payload payload;
	
	public Criteria() {
		
	}
	
	public Criteria(Card card, Payload payload) {
		this.card = card;
		this.payload = payload;
	}

	static public class Payload {
		
		public Payload() {
			
		}
		
		public Payload(String start, String end) {
			this.start = start;
			this.end = end;
		}

		private String start;
		private String end;

		public GregorianCalendar getStart() throws ParseException {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(df.parse(start));
			return cal;
		}

		public GregorianCalendar getEnd() throws ParseException {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(df.parse(end));
			return cal;
		}
	}

	public Card getCard() {
		return card;
	}

	public Payload getPayload() {
		return payload;
	}
}
