package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for endorsementTypeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="endorsementTypeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="RENEWAL"/>
 *     &lt;enumeration value="EXTENSION"/>
 *     &lt;enumeration value="MODIFICATION"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="CANCELLATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "endorsementTypeST")
@XmlEnum
public enum EndorsementTypeST {

	NEW, RENEWAL, EXTENSION, MODIFICATION, UPDATE, CANCELLATION;

	public String value() {
		return name();
	}

	public static EndorsementTypeST fromValue(String v) {
		return valueOf(v);
	}

}
