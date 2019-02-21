package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for commentTypeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="commentTypeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAYER"/>
 *     &lt;enumeration value="PROVIDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "commentTypeST")
@XmlEnum
public enum CommentTypeST {

	PAYER, PROVIDER;

	public String value() {
		return name();
	}

	public static CommentTypeST fromValue(String v) {
		return valueOf(v);
	}

}
