package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for transactionSubTypeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="transactionSubTypeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="FOLLOWUP"/>
 *     &lt;enumeration value="CANCELLATION"/>
 *     &lt;enumeration value="SUMMARY"/>
 *     &lt;enumeration value="DETAIL"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transactionSubTypeST")
@XmlEnum
public enum TransactionSubTypeST {

	NEW, FOLLOWUP, CANCELLATION, SUMMARY, DETAIL, NONE;

	public String value() {
		return name();
	}

	public static TransactionSubTypeST fromValue(String v) {
		return valueOf(v);
	}

}
