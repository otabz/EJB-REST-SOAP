package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for serviceTypeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="serviceTypeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N/A"/>
 *     &lt;enumeration value="LABORATORY"/>
 *     &lt;enumeration value="MEDICATION"/>
 *     &lt;enumeration value="RADIOLOGY"/>
 *     &lt;enumeration value="CONSULTATION"/>
 *     &lt;enumeration value="PROCEDURE"/>
 *     &lt;enumeration value="HOSPITLIZATION"/>
 *     &lt;enumeration value="DENTAL"/>
 *     &lt;enumeration value="SUPPLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceTypeST")
@XmlEnum
public enum ServiceTypeST {

	@XmlEnumValue("N/A")
	N_A("N/A"), LABORATORY("LABORATORY"), MEDICATION("MEDICATION"), RADIOLOGY(
			"RADIOLOGY"), CONSULTATION("CONSULTATION"), PROCEDURE("PROCEDURE"), HOSPITLIZATION(
			"HOSPITLIZATION"), DENTAL("DENTAL"), SUPPLY("SUPPLY");
	private final String value;

	ServiceTypeST(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static ServiceTypeST fromValue(String v) {
		for (ServiceTypeST c : ServiceTypeST.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
