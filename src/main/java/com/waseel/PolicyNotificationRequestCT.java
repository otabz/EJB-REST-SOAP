package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PolicyNotificationRequestCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyNotificationRequestCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PolicyLineCT" type="{http://www.waseel.com/wsdl/primary/wschema}PolicyGenInfoCT"/>
 *         &lt;element name="endorsementNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyNotificationRequestCT", propOrder = {
		"notificationMessage", "policyLineCT", "endorsementNumber" })
public class PolicyNotificationRequestCT {

	@XmlElement(required = true)
	protected String notificationMessage;
	@XmlElement(name = "PolicyLineCT", required = true)
	protected PolicyGenInfoCT policyLineCT;
	@XmlElement(required = true)
	protected String endorsementNumber;

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
	 * Gets the value of the policyLineCT property.
	 * 
	 * @return possible object is {@link PolicyGenInfoCT }
	 * 
	 */
	public PolicyGenInfoCT getPolicyLineCT() {
		return policyLineCT;
	}

	/**
	 * Sets the value of the policyLineCT property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicyGenInfoCT }
	 * 
	 */
	public void setPolicyLineCT(PolicyGenInfoCT value) {
		this.policyLineCT = value;
	}

	/**
	 * Gets the value of the endorsementNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEndorsementNumber() {
		return endorsementNumber;
	}

	/**
	 * Sets the value of the endorsementNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEndorsementNumber(String value) {
		this.endorsementNumber = value;
	}

}
