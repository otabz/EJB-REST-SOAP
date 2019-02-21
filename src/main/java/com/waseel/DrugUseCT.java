package com.waseel;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.Duration;

/**
 * <p>
 * Java class for DrugUseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DrugUseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dosage">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attribute name="unit" default="TAB">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="GM"/>
 *                       &lt;enumeration value="MG"/>
 *                       &lt;enumeration value="MCG"/>
 *                       &lt;enumeration value="CC"/>
 *                       &lt;enumeration value="ML"/>
 *                       &lt;enumeration value="TSP"/>
 *                       &lt;enumeration value="TBSP"/>
 *                       &lt;enumeration value="GTT"/>
 *                       &lt;enumeration value="TAB"/>
 *                       &lt;enumeration value="CAP"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="doseTimes">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attribute name="qualifier" default="QD">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="QD"/>
 *                       &lt;enumeration value="QH"/>
 *                       &lt;enumeration value="PC"/>
 *                       &lt;enumeration value="AC"/>
 *                       &lt;enumeration value="PRN"/>
 *                       &lt;enumeration value="QOD"/>
 *                       &lt;enumeration value="STAT"/>
 *                       &lt;enumeration value="QHS"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="durationOfTreatment" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrugUseCT", propOrder = { "dosage", "doseTimes",
		"durationOfTreatment" })
public class DrugUseCT {

	@XmlElement(required = true)
	protected DrugUseCT.Dosage dosage;
	@XmlElement(required = true)
	protected DrugUseCT.DoseTimes doseTimes;
	@XmlElement(required = true)
	protected Duration durationOfTreatment;

	/**
	 * Gets the value of the dosage property.
	 * 
	 * @return possible object is {@link DrugUseCT.Dosage }
	 * 
	 */
	public DrugUseCT.Dosage getDosage() {
		return dosage;
	}

	/**
	 * Sets the value of the dosage property.
	 * 
	 * @param value
	 *            allowed object is {@link DrugUseCT.Dosage }
	 * 
	 */
	public void setDosage(DrugUseCT.Dosage value) {
		this.dosage = value;
	}

	/**
	 * Gets the value of the doseTimes property.
	 * 
	 * @return possible object is {@link DrugUseCT.DoseTimes }
	 * 
	 */
	public DrugUseCT.DoseTimes getDoseTimes() {
		return doseTimes;
	}

	/**
	 * Sets the value of the doseTimes property.
	 * 
	 * @param value
	 *            allowed object is {@link DrugUseCT.DoseTimes }
	 * 
	 */
	public void setDoseTimes(DrugUseCT.DoseTimes value) {
		this.doseTimes = value;
	}

	/**
	 * Gets the value of the durationOfTreatment property.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getDurationOfTreatment() {
		return durationOfTreatment;
	}

	/**
	 * Sets the value of the durationOfTreatment property.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setDurationOfTreatment(Duration value) {
		this.durationOfTreatment = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;simpleContent>
	 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
	 *       &lt;attribute name="unit" default="TAB">
	 *         &lt;simpleType>
	 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *             &lt;enumeration value="GM"/>
	 *             &lt;enumeration value="MG"/>
	 *             &lt;enumeration value="MCG"/>
	 *             &lt;enumeration value="CC"/>
	 *             &lt;enumeration value="ML"/>
	 *             &lt;enumeration value="TSP"/>
	 *             &lt;enumeration value="TBSP"/>
	 *             &lt;enumeration value="GTT"/>
	 *             &lt;enumeration value="TAB"/>
	 *             &lt;enumeration value="CAP"/>
	 *           &lt;/restriction>
	 *         &lt;/simpleType>
	 *       &lt;/attribute>
	 *     &lt;/extension>
	 *   &lt;/simpleContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "value" })
	public static class Dosage {

		@XmlValue
		protected BigDecimal value;
		@XmlAttribute
		protected String unit;

		/**
		 * Gets the value of the value property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getValue() {
			return value;
		}

		/**
		 * Sets the value of the value property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setValue(BigDecimal value) {
			this.value = value;
		}

		/**
		 * Gets the value of the unit property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getUnit() {
			if (unit == null) {
				return "TAB";
			} else {
				return unit;
			}
		}

		/**
		 * Sets the value of the unit property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setUnit(String value) {
			this.unit = value;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;simpleContent>
	 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
	 *       &lt;attribute name="qualifier" default="QD">
	 *         &lt;simpleType>
	 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *             &lt;enumeration value="QD"/>
	 *             &lt;enumeration value="QH"/>
	 *             &lt;enumeration value="PC"/>
	 *             &lt;enumeration value="AC"/>
	 *             &lt;enumeration value="PRN"/>
	 *             &lt;enumeration value="QOD"/>
	 *             &lt;enumeration value="STAT"/>
	 *             &lt;enumeration value="QHS"/>
	 *           &lt;/restriction>
	 *         &lt;/simpleType>
	 *       &lt;/attribute>
	 *     &lt;/extension>
	 *   &lt;/simpleContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "value" })
	public static class DoseTimes {

		@XmlValue
		protected BigInteger value;
		@XmlAttribute
		protected String qualifier;

		/**
		 * Gets the value of the value property.
		 * 
		 * @return possible object is {@link BigInteger }
		 * 
		 */
		public BigInteger getValue() {
			return value;
		}

		/**
		 * Sets the value of the value property.
		 * 
		 * @param value
		 *            allowed object is {@link BigInteger }
		 * 
		 */
		public void setValue(BigInteger value) {
			this.value = value;
		}

		/**
		 * Gets the value of the qualifier property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getQualifier() {
			if (qualifier == null) {
				return "QD";
			} else {
				return qualifier;
			}
		}

		/**
		 * Sets the value of the qualifier property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setQualifier(String value) {
			this.qualifier = value;
		}

	}

}
