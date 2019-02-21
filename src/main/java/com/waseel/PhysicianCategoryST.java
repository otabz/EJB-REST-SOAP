package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for physicianCategoryST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="physicianCategoryST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GENERAL PRACTICE"/>
 *     &lt;enumeration value="SPECIALIST"/>
 *     &lt;enumeration value="CONSULTANT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "physicianCategoryST")
@XmlEnum
public enum PhysicianCategoryST {

	@XmlEnumValue("GENERAL PRACTICE")
	GENERAL_PRACTICE("GENERAL PRACTICE"), SPECIALIST("SPECIALIST"), CONSULTANT(
			"CONSULTANT");
	private final String value;

	PhysicianCategoryST(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static PhysicianCategoryST fromValue(String v) {
		for (PhysicianCategoryST c : PhysicianCategoryST.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
