package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for visitTypeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="visitTypeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="FOLLOWUP"/>
 *     &lt;enumeration value="REFERRAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "visitTypeST")
@XmlEnum
public enum VisitTypeST {

	NEW, FOLLOWUP, REFERRAL;

	public String value() {
		return name();
	}

	public static VisitTypeST fromValue(String v) {
		return valueOf(v);
	}

}
