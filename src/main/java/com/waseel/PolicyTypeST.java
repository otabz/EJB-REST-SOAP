package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for policyTypeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="policyTypeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CORPORATE"/>
 *     &lt;enumeration value="INDIVIDUAL"/>
 *     &lt;enumeration value="PLAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "policyTypeST")
@XmlEnum
public enum PolicyTypeST {

	CORPORATE, INDIVIDUAL, PLAN;

	public String value() {
		return name();
	}

	public static PolicyTypeST fromValue(String v) {
		return valueOf(v);
	}

}
