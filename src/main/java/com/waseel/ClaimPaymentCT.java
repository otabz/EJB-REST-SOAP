package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ClaimPaymentCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimPaymentCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="paymentReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimPaymentCT", propOrder = { "paymentDate",
		"paymentReference" })
public class ClaimPaymentCT {

	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar paymentDate;
	@XmlElement(required = true)
	protected String paymentReference;

	/**
	 * Gets the value of the paymentDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getPaymentDate() {
		return paymentDate;
	}

	/**
	 * Sets the value of the paymentDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setPaymentDate(XMLGregorianCalendar value) {
		this.paymentDate = value;
	}

	/**
	 * Gets the value of the paymentReference property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPaymentReference() {
		return paymentReference;
	}

	/**
	 * Sets the value of the paymentReference property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPaymentReference(String value) {
		this.paymentReference = value;
	}

}
