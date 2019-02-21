package com.mobility.boundary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

public class ApprovalResult extends Result {
	//@JsonProperty
	private String status = "";
	//@JsonProperty
	private String desc = "";
	//@JsonProperty
	private String reference = "";
	
	private XMLGregorianCalendar date;
	
	public ApprovalResult(String status, String desc, String reference, XMLGregorianCalendar date) {
		super(Result.Outcome.SUCCESS, "");
		this.status = status;
		this.desc = desc;
		this.reference = reference;
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public String getReference() {
		return reference;
	}

	public String getDesc() {
		return desc;
	}

	public String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy");
		try {
			 return sdf.format(date.toGregorianCalendar().getTime());
		} catch(Exception e) {
			return sdf.format(Calendar.getInstance().getTime());
		}
	}
}
