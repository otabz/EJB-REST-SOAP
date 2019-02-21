package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for roomTypeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="roomTypeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHARED ROOM"/>
 *     &lt;enumeration value="PRIVATE"/>
 *     &lt;enumeration value="SUITE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "roomTypeST")
@XmlEnum
public enum RoomTypeST {

	@XmlEnumValue("SHARED ROOM")
	SHARED_ROOM("SHARED ROOM"), PRIVATE("PRIVATE"), SUITE("SUITE");
	private final String value;

	RoomTypeST(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static RoomTypeST fromValue(String v) {
		for (RoomTypeST c : RoomTypeST.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
