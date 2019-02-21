package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for memberTypeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="memberTypeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRINCIPAL"/>
 *     &lt;enumeration value="WIFE"/>
 *     &lt;enumeration value="DEPENDENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "memberTypeST")
@XmlEnum
public enum MemberTypeST {

	PRINCIPAL, WIFE, DEPENDENT;

	public String value() {
		return name();
	}

	public static MemberTypeST fromValue(String v) {
		return valueOf(v);
	}

}
