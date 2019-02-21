package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for StatusCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="StatusCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusCode" type="{http://www.waseel.com/wsdl/primary/wschema}statusCodeST"/>
 *         &lt;element name="denialCode" type="{http://www.waseel.com/wsdl/primary/wschema}denialCodeST" minOccurs="0"/>
 *         &lt;element name="statusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusCT", propOrder = { "statusCode", "denialCode",
		"statusDescription", "referenceNumber" })
public class StatusCT {

	@XmlElement(required = true)
	protected StatusCodeST statusCode;
	protected String denialCode;
	protected String statusDescription;
	protected String referenceNumber;

	/**
	 * Gets the value of the statusCode property.
	 * 
	 * @return possible object is {@link StatusCodeST }
	 * 
	 */
	public StatusCodeST getStatusCode() {
		return statusCode;
	}

	/**
	 * Sets the value of the statusCode property.
	 * 
	 * @param value
	 *            allowed object is {@link StatusCodeST }
	 * 
	 */
	public void setStatusCode(StatusCodeST value) {
		this.statusCode = value;
	}

	/**
	 * Gets the value of the denialCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDenialCode() {
		return denialCode;
	}

	/**
	 * Sets the value of the denialCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDenialCode(String value) {
		this.denialCode = value;
	}

	/**
	 * Gets the value of the statusDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatusDescription() {
		return statusDescription;
	}

	/**
	 * Sets the value of the statusDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatusDescription(String value) {
		this.statusDescription = value;
	}

	/**
	 * Gets the value of the referenceNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * Sets the value of the referenceNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReferenceNumber(String value) {
		this.referenceNumber = value;
	}

}
