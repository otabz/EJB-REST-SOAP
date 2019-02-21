package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for diagnosisTypeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="diagnosisTypeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRINCIPAL"/>
 *     &lt;enumeration value="SCONDARY"/>
 *     &lt;enumeration value="ADMITTING"/>
 *     &lt;enumeration value="DISCHARGE"/>
 *     &lt;enumeration value="CAUSEOFDEATH"/>
 *     &lt;enumeration value="PROVISIONAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "diagnosisTypeST")
@XmlEnum
public enum DiagnosisTypeST {

	PRINCIPAL, SCONDARY, ADMITTING, DISCHARGE, CAUSEOFDEATH, PROVISIONAL;

	public String value() {
		return name();
	}

	public static DiagnosisTypeST fromValue(String v) {
		return valueOf(v);
	}

}
