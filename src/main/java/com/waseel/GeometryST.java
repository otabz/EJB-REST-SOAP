package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for geometryST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="geometryST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SPHERE"/>
 *     &lt;enumeration value="CYLINDER"/>
 *     &lt;enumeration value="AXIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "geometryST")
@XmlEnum
public enum GeometryST {

	SPHERE, CYLINDER, AXIS;

	public String value() {
		return name();
	}

	public static GeometryST fromValue(String v) {
		return valueOf(v);
	}

}
