package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ClaimNotificationRequestCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimNotificationRequestCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Claim" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimLineCT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimNotificationRequestCT", propOrder = {
		"notificationMessage", "claim" })
public class ClaimNotificationRequestCT {

	@XmlElement(required = true)
	protected String notificationMessage;
	@XmlElement(name = "Claim", required = true)
	protected ClaimLineCT claim;

	/**
	 * Gets the value of the notificationMessage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNotificationMessage() {
		return notificationMessage;
	}

	/**
	 * Sets the value of the notificationMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNotificationMessage(String value) {
		this.notificationMessage = value;
	}

	/**
	 * Gets the value of the claim property.
	 * 
	 * @return possible object is {@link ClaimLineCT }
	 * 
	 */
	public ClaimLineCT getClaim() {
		return claim;
	}

	/**
	 * Sets the value of the claim property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimLineCT }
	 * 
	 */
	public void setClaim(ClaimLineCT value) {
		this.claim = value;
	}

}
