package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for focusST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="focusST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEAR"/>
 *     &lt;enumeration value="DISTANCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "focusST")
@XmlEnum
public enum FocusST {

	NEAR, DISTANCE;

	public String value() {
		return name();
	}

	public static FocusST fromValue(String v) {
		return valueOf(v);
	}

}
