package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for caseTypeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="caseTypeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INPATIENT"/>
 *     &lt;enumeration value="OUTPATIENT"/>
 *     &lt;enumeration value="DENTAL"/>
 *     &lt;enumeration value="DELIVERY"/>
 *     &lt;enumeration value="OPTICAL"/>
 *     &lt;enumeration value="PHARMACY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "caseTypeST")
@XmlEnum
public enum CaseTypeST {

	INPATIENT, OUTPATIENT, DENTAL, DELIVERY, OPTICAL, PHARMACY;

	public String value() {
		return name();
	}

	public static CaseTypeST fromValue(String v) {
		return valueOf(v);
	}

}
