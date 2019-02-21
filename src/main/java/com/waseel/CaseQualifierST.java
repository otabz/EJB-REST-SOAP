package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for caseQualifierST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="caseQualifierST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INPATIENT"/>
 *     &lt;enumeration value="OUTPATIENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "caseQualifierST")
@XmlEnum
public enum CaseQualifierST {

	INPATIENT, OUTPATIENT;

	public String value() {
		return name();
	}

	public static CaseQualifierST fromValue(String v) {
		return valueOf(v);
	}

}
