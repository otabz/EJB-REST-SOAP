package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for genderST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="genderST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="F"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "genderST")
@XmlEnum
public enum GenderST {

	M, F;

	public String value() {
		return name();
	}

	public static GenderST fromValue(String v) {
		return valueOf(v);
	}

}
