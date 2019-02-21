package com.waseel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for toothNumberST.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="toothNumberST">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="0"/>
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
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="J"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="Q"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "toothNumberST")
@XmlEnum
public enum ToothNumberST {

	@XmlEnumValue("0")
	VALUE_1("0"), @XmlEnumValue("1")
	VALUE_2("1"), @XmlEnumValue("2")
	VALUE_3("2"), @XmlEnumValue("3")
	VALUE_4("3"), @XmlEnumValue("4")
	VALUE_5("4"), @XmlEnumValue("5")
	VALUE_6("5"), @XmlEnumValue("6")
	VALUE_7("6"), @XmlEnumValue("7")
	VALUE_8("7"), @XmlEnumValue("8")
	VALUE_9("8"), @XmlEnumValue("9")
	VALUE_10("9"), @XmlEnumValue("10")
	VALUE_11("10"), @XmlEnumValue("11")
	VALUE_12("11"), @XmlEnumValue("12")
	VALUE_13("12"), @XmlEnumValue("13")
	VALUE_14("13"), @XmlEnumValue("14")
	VALUE_15("14"), @XmlEnumValue("15")
	VALUE_16("15"), @XmlEnumValue("16")
	VALUE_17("16"), @XmlEnumValue("17")
	VALUE_18("17"), @XmlEnumValue("18")
	VALUE_19("18"), @XmlEnumValue("19")
	VALUE_20("19"), @XmlEnumValue("20")
	VALUE_21("20"), @XmlEnumValue("21")
	VALUE_22("21"), @XmlEnumValue("22")
	VALUE_23("22"), @XmlEnumValue("23")
	VALUE_24("23"), @XmlEnumValue("24")
	VALUE_25("24"), @XmlEnumValue("25")
	VALUE_26("25"), @XmlEnumValue("26")
	VALUE_27("26"), @XmlEnumValue("27")
	VALUE_28("27"), @XmlEnumValue("28")
	VALUE_29("28"), @XmlEnumValue("29")
	VALUE_30("29"), @XmlEnumValue("30")
	VALUE_31("30"), @XmlEnumValue("31")
	VALUE_32("31"), @XmlEnumValue("32")
	VALUE_33("32"), @XmlEnumValue("A")
	VALUE_34("A"), @XmlEnumValue("B")
	VALUE_35("B"), @XmlEnumValue("C")
	VALUE_36("C"), @XmlEnumValue("D")
	VALUE_37("D"), @XmlEnumValue("E")
	VALUE_38("E"), @XmlEnumValue("F")
	VALUE_39("F"), @XmlEnumValue("G")
	VALUE_40("G"), @XmlEnumValue("H")
	VALUE_41("H"), @XmlEnumValue("I")
	VALUE_42("I"), @XmlEnumValue("J")
	VALUE_43("J"), @XmlEnumValue("K")
	VALUE_44("K"), @XmlEnumValue("L")
	VALUE_45("L"), @XmlEnumValue("M")
	VALUE_46("M"), @XmlEnumValue("N")
	VALUE_47("N"), @XmlEnumValue("O")
	VALUE_48("O"), @XmlEnumValue("P")
	VALUE_49("P"), @XmlEnumValue("Q")
	VALUE_50("Q"), @XmlEnumValue("R")
	VALUE_51("R"), @XmlEnumValue("S")
	VALUE_52("S"), @XmlEnumValue("T")
	VALUE_53("T");
	private final String value;

	ToothNumberST(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static ToothNumberST fromValue(String v) {
		for (ToothNumberST c : ToothNumberST.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
