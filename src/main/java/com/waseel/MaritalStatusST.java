package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for maritalStatusST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="maritalStatusST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SINGLE"/>
 *     &lt;enumeration value="MARRIED"/>
 *     &lt;enumeration value="UNMARRIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "maritalStatusST")
@XmlEnum
public enum MaritalStatusST {

	SINGLE, MARRIED, UNMARRIED;

	public String value() {
		return name();
	}

	public static MaritalStatusST fromValue(String v) {
		return valueOf(v);
	}

}
