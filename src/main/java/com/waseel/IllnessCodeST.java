package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for illnessCodeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="illnessCodeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AMBULANCE"/>
 *     &lt;enumeration value="DIALYSIS"/>
 *     &lt;enumeration value="CHECKUP"/>
 *     &lt;enumeration value="CHRONIC"/>
 *     &lt;enumeration value="CIRCUMCISION"/>
 *     &lt;enumeration value="CLEANING"/>
 *     &lt;enumeration value="CONGENITAL"/>
 *     &lt;enumeration value="INFERTILITY"/>
 *     &lt;enumeration value="MATERNITY COMPLICATIONS"/>
 *     &lt;enumeration value="PREEXISTING"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="ORTHODONTICS"/>
 *     &lt;enumeration value="PREGNANCY"/>
 *     &lt;enumeration value="PSYCHIATRY"/>
 *     &lt;enumeration value="RTA"/>
 *     &lt;enumeration value="SPORTS"/>
 *     &lt;enumeration value="VACCINATION"/>
 *     &lt;enumeration value="WRA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "illnessCodeST")
@XmlEnum
public enum IllnessCodeST {

	AMBULANCE("AMBULANCE"), DIALYSIS("DIALYSIS"), CHECKUP("CHECKUP"), CHRONIC(
			"CHRONIC"), CIRCUMCISION("CIRCUMCISION"), CLEANING("CLEANING"), CONGENITAL(
			"CONGENITAL"), INFERTILITY("INFERTILITY"), @XmlEnumValue("MATERNITY COMPLICATIONS")
	MATERNITY_COMPLICATIONS("MATERNITY COMPLICATIONS"), PREEXISTING(
			"PREEXISTING"), NA("NA"), ORTHODONTICS("ORTHODONTICS"), PREGNANCY(
			"PREGNANCY"), PSYCHIATRY("PSYCHIATRY"), RTA("RTA"), SPORTS("SPORTS"), VACCINATION(
			"VACCINATION"), WRA("WRA");
	private final String value;

	IllnessCodeST(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static IllnessCodeST fromValue(String v) {
		for (IllnessCodeST c : IllnessCodeST.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
