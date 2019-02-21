package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for admissionTypeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="admissionTypeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ELECTIVE"/>
 *     &lt;enumeration value="EMERGENCY"/>
 *     &lt;enumeration value="REFERRAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "admissionTypeST")
@XmlEnum
public enum AdmissionTypeST {

	ELECTIVE, EMERGENCY, REFERRAL;

	public String value() {
		return name();
	}

	public static AdmissionTypeST fromValue(String v) {
		return valueOf(v);
	}

}
