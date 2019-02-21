package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for fileTypeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="fileTypeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Medical Report"/>
 *     &lt;enumeration value="X-Ray result"/>
 *     &lt;enumeration value="Lab Result"/>
 *     &lt;enumeration value="Iqama/ID copy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fileTypeST")
@XmlEnum
public enum FileTypeST {

	@XmlEnumValue("Medical Report")
	MEDICAL_REPORT("Medical Report"), @XmlEnumValue("X-Ray result")
	X_RAY_RESULT("X-Ray result"), @XmlEnumValue("Lab Result")
	LAB_RESULT("Lab Result"), @XmlEnumValue("Iqama/ID copy")
	IQAMA_ID_COPY("Iqama/ID copy");
	private final String value;

	FileTypeST(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static FileTypeST fromValue(String v) {
		for (FileTypeST c : FileTypeST.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
