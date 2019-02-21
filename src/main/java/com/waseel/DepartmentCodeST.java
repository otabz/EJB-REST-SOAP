package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for departmentCodeST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="departmentCodeST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *     &lt;enumeration value="4"/>
 *     &lt;enumeration value="5"/>
 *     &lt;enumeration value="6"/>
 *     &lt;enumeration value="7"/>
 *     &lt;enumeration value="8"/>
 *     &lt;enumeration value="9"/>
 *     &lt;enumeration value="10"/>
 *     &lt;enumeration value="11"/>
 *     &lt;enumeration value="12"/>
 *     &lt;enumeration value="13"/>
 *     &lt;enumeration value="14"/>
 *     &lt;enumeration value="15"/>
 *     &lt;enumeration value="16"/>
 *     &lt;enumeration value="17"/>
 *     &lt;enumeration value="18"/>
 *     &lt;enumeration value="19"/>
 *     &lt;enumeration value="20"/>
 *     &lt;enumeration value="21"/>
 *     &lt;enumeration value="22"/>
 *     &lt;enumeration value="23"/>
 *     &lt;enumeration value="24"/>
 *     &lt;enumeration value="25"/>
 *     &lt;enumeration value="26"/>
 *     &lt;enumeration value="27"/>
 *     &lt;enumeration value="28"/>
 *     &lt;enumeration value="29"/>
 *     &lt;enumeration value="30"/>
 *     &lt;enumeration value="31"/>
 *     &lt;enumeration value="32"/>
 *     &lt;enumeration value="33"/>
 *     &lt;enumeration value="34"/>
 *     &lt;enumeration value="35"/>
 *     &lt;enumeration value="50"/>
 *     &lt;enumeration value="51"/>
 *     &lt;enumeration value="52"/>
 *     &lt;enumeration value="53"/>
 *     &lt;enumeration value="54"/>
 *     &lt;enumeration value="55"/>
 *     &lt;enumeration value="56"/>
 *     &lt;enumeration value="57"/>
 *     &lt;enumeration value="58"/>
 *     &lt;enumeration value="59"/>
 *     &lt;enumeration value="60"/>
 *     &lt;enumeration value="61"/>
 *     &lt;enumeration value="62"/>
 *     &lt;enumeration value="63"/>
 *     &lt;enumeration value="64"/>
 *     &lt;enumeration value="65"/>
 *     &lt;enumeration value="66"/>
 *     &lt;enumeration value="67"/>
 *     &lt;enumeration value="68"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "departmentCodeST")
@XmlEnum
public enum DepartmentCodeST {

	@XmlEnumValue("1")
	VALUE_1("1"), @XmlEnumValue("2")
	VALUE_2("2"), @XmlEnumValue("3")
	VALUE_3("3"), @XmlEnumValue("4")
	VALUE_4("4"), @XmlEnumValue("5")
	VALUE_5("5"), @XmlEnumValue("6")
	VALUE_6("6"), @XmlEnumValue("7")
	VALUE_7("7"), @XmlEnumValue("8")
	VALUE_8("8"), @XmlEnumValue("9")
	VALUE_9("9"), @XmlEnumValue("10")
	VALUE_10("10"), @XmlEnumValue("11")
	VALUE_11("11"), @XmlEnumValue("12")
	VALUE_12("12"), @XmlEnumValue("13")
	VALUE_13("13"), @XmlEnumValue("14")
	VALUE_14("14"), @XmlEnumValue("15")
	VALUE_15("15"), @XmlEnumValue("16")
	VALUE_16("16"), @XmlEnumValue("17")
	VALUE_17("17"), @XmlEnumValue("18")
	VALUE_18("18"), @XmlEnumValue("19")
	VALUE_19("19"), @XmlEnumValue("20")
	VALUE_20("20"), @XmlEnumValue("21")
	VALUE_21("21"), @XmlEnumValue("22")
	VALUE_22("22"), @XmlEnumValue("23")
	VALUE_23("23"), @XmlEnumValue("24")
	VALUE_24("24"), @XmlEnumValue("25")
	VALUE_25("25"), @XmlEnumValue("26")
	VALUE_26("26"), @XmlEnumValue("27")
	VALUE_27("27"), @XmlEnumValue("28")
	VALUE_28("28"), @XmlEnumValue("29")
	VALUE_29("29"), @XmlEnumValue("30")
	VALUE_30("30"), @XmlEnumValue("31")
	VALUE_31("31"), @XmlEnumValue("32")
	VALUE_32("32"), @XmlEnumValue("33")
	VALUE_33("33"), @XmlEnumValue("34")
	VALUE_34("34"), @XmlEnumValue("35")
	VALUE_35("35"), @XmlEnumValue("50")
	VALUE_36("50"), @XmlEnumValue("51")
	VALUE_37("51"), @XmlEnumValue("52")
	VALUE_38("52"), @XmlEnumValue("53")
	VALUE_39("53"), @XmlEnumValue("54")
	VALUE_40("54"), @XmlEnumValue("55")
	VALUE_41("55"), @XmlEnumValue("56")
	VALUE_42("56"), @XmlEnumValue("57")
	VALUE_43("57"), @XmlEnumValue("58")
	VALUE_44("58"), @XmlEnumValue("59")
	VALUE_45("59"), @XmlEnumValue("60")
	VALUE_46("60"), @XmlEnumValue("61")
	VALUE_47("61"), @XmlEnumValue("62")
	VALUE_48("62"), @XmlEnumValue("63")
	VALUE_49("63"), @XmlEnumValue("64")
	VALUE_50("64"), @XmlEnumValue("65")
	VALUE_51("65"), @XmlEnumValue("66")
	VALUE_52("66"), @XmlEnumValue("67")
	VALUE_53("67"), @XmlEnumValue("68")
	VALUE_54("68");
	private final String value;

	DepartmentCodeST(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static DepartmentCodeST fromValue(String v) {
		for (DepartmentCodeST c : DepartmentCodeST.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
