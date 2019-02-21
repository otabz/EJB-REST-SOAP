package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for transactionTypeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="transactionTypeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="1.1"/>
 *     &lt;enumeration value="2.1"/>
 *     &lt;enumeration value="2.2"/>
 *     &lt;enumeration value="2.3"/>
 *     &lt;enumeration value="3.1"/>
 *     &lt;enumeration value="3.2"/>
 *     &lt;enumeration value="3.3"/>
 *     &lt;enumeration value="3.4"/>
 *     &lt;enumeration value="3.5"/>
 *     &lt;enumeration value="4.2"/>
 *     &lt;enumeration value="4.3"/>
 *     &lt;enumeration value="5.1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transactionTypeST")
@XmlEnum
public enum TransactionTypeST {

	@XmlEnumValue("1.1")
	VALUE_1("1.1"), @XmlEnumValue("2.1")
	VALUE_2("2.1"), @XmlEnumValue("2.2")
	VALUE_3("2.2"), @XmlEnumValue("2.3")
	VALUE_4("2.3"), @XmlEnumValue("3.1")
	VALUE_5("3.1"), @XmlEnumValue("3.2")
	VALUE_6("3.2"), @XmlEnumValue("3.3")
	VALUE_7("3.3"), @XmlEnumValue("3.4")
	VALUE_8("3.4"), @XmlEnumValue("3.5")
	VALUE_9("3.5"), @XmlEnumValue("4.2")
	VALUE_10("4.2"), @XmlEnumValue("4.3")
	VALUE_11("4.3"), @XmlEnumValue("5.1")
	VALUE_12("5.1");
	private final String value;

	TransactionTypeST(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static TransactionTypeST fromValue(String v) {
		for (TransactionTypeST c : TransactionTypeST.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
