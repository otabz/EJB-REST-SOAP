package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for benefitCodeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="benefitCodeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DENTAL"/>
 *     &lt;enumeration value="MATERNITY"/>
 *     &lt;enumeration value="OUTPATIENT"/>
 *     &lt;enumeration value="ALLERGIES"/>
 *     &lt;enumeration value="INPATIENT"/>
 *     &lt;enumeration value="OPTICAL"/>
 *     &lt;enumeration value="PREEXISTING"/>
 *     &lt;enumeration value="CHRONIC"/>
 *     &lt;enumeration value="REPATRIATION"/>
 *     &lt;enumeration value="OUTPATIENT"/>
 *     &lt;enumeration value="PSYCHIATRY"/>
 *     &lt;enumeration value="CIRCUMCISION"/>
 *     &lt;enumeration value="TERRORISM"/>
 *     &lt;enumeration value="PREVENTIVE"/>
 *     &lt;enumeration value="AMBULANCE"/>
 *     &lt;enumeration value="DIALYSIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "benefitCodeST")
@XmlEnum
public enum BenefitCodeST {

	DENTAL, MATERNITY, OUTPATIENT, ALLERGIES, INPATIENT, OPTICAL, PREEXISTING, CHRONIC, REPATRIATION, PSYCHIATRY, CIRCUMCISION, TERRORISM, PREVENTIVE, AMBULANCE, DIALYSIS;

	public String value() {
		return name();
	}

	public static BenefitCodeST fromValue(String v) {
		return valueOf(v);
	}

}
