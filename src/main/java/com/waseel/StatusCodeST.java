package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for statusCodeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="statusCodeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VALID"/>
 *     &lt;enumeration value="INVALID"/>
 *     &lt;enumeration value="ELIGIBLE"/>
 *     &lt;enumeration value="INELIGIBLE"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="PARTIALLY APPROVED"/>
 *     &lt;enumeration value="LIMIT APPROVED"/>
 *     &lt;enumeration value="CONDITIONALLY APPROVED"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="REFERRED"/>
 *     &lt;enumeration value="FURTHER DETAILS REQUIRED"/>
 *     &lt;enumeration value="UNDER PROCESS"/>
 *     &lt;enumeration value="SETTLED"/>
 *     &lt;enumeration value="PAID"/>
 *     &lt;enumeration value="PARTIALLY PAID"/>
 *     &lt;enumeration value="OUTSTANDING"/>
 *     &lt;enumeration value="RETURNED"/>
 *     &lt;enumeration value="DUPLICATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusCodeST")
@XmlEnum
public enum StatusCodeST {

	VALID("VALID"), INVALID("INVALID"), ELIGIBLE("ELIGIBLE"), INELIGIBLE(
			"INELIGIBLE"), APPROVED("APPROVED"), REJECTED("REJECTED"), @XmlEnumValue("PARTIALLY APPROVED")
	PARTIALLY_APPROVED("PARTIALLY APPROVED"), @XmlEnumValue("LIMIT APPROVED")
	LIMIT_APPROVED("LIMIT APPROVED"), @XmlEnumValue("CONDITIONALLY APPROVED")
	CONDITIONALLY_APPROVED("CONDITIONALLY APPROVED"), PENDING("PENDING"), CANCELLED(
			"CANCELLED"), REFERRED("REFERRED"), @XmlEnumValue("FURTHER DETAILS REQUIRED")
	FURTHER_DETAILS_REQUIRED("FURTHER DETAILS REQUIRED"), @XmlEnumValue("UNDER PROCESS")
	UNDER_PROCESS("UNDER PROCESS"), SETTLED("SETTLED"), PAID("PAID"), @XmlEnumValue("PARTIALLY PAID")
	PARTIALLY_PAID("PARTIALLY PAID"), OUTSTANDING("OUTSTANDING"), RETURNED(
			"RETURNED"), DUPLICATE("DUPLICATE");
	private final String value;

	StatusCodeST(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static StatusCodeST fromValue(String v) {
		for (StatusCodeST c : StatusCodeST.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
