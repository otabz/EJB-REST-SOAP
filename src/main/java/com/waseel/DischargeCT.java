package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for DischargeCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DischargeCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualLengthOfStay" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         &lt;element name="dischargeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DischargeCT", propOrder = { "actualLengthOfStay",
		"dischargeDate" })
public class DischargeCT {

	@XmlElement(required = true)
	protected Duration actualLengthOfStay;
	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar dischargeDate;

	/**
	 * Gets the value of the actualLengthOfStay property.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getActualLengthOfStay() {
		return actualLengthOfStay;
	}

	/**
	 * Sets the value of the actualLengthOfStay property.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setActualLengthOfStay(Duration value) {
		this.actualLengthOfStay = value;
	}

	/**
	 * Gets the value of the dischargeDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDischargeDate() {
		return dischargeDate;
	}

	/**
	 * Sets the value of the dischargeDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDischargeDate(XMLGregorianCalendar value) {
		this.dischargeDate = value;
	}

}
