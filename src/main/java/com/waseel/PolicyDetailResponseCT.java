package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PolicyDetailResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyDetailResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedData" type="{http://www.waseel.com/wsdl/primary/wschema}policyNumberST"/>
 *         &lt;element name="PolicyResponse" type="{http://www.waseel.com/wsdl/primary/wschema}PolicyCT"/>
 *         &lt;element name="additionalInfo" type="{http://www.waseel.com/wsdl/primary/wschema}additionalInfoST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyDetailResponseCT", propOrder = { "requestedData",
		"policyResponse", "additionalInfo" })
public class PolicyDetailResponseCT {

	@XmlElement(name = "RequestedData", required = true)
	protected String requestedData;
	@XmlElement(name = "PolicyResponse", required = true)
	protected PolicyCT policyResponse;
	@XmlElement(required = true)
	protected String additionalInfo;

	/**
	 * Gets the value of the requestedData property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequestedData() {
		return requestedData;
	}

	/**
	 * Sets the value of the requestedData property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestedData(String value) {
		this.requestedData = value;
	}

	/**
	 * Gets the value of the policyResponse property.
	 * 
	 * @return possible object is {@link PolicyCT }
	 * 
	 */
	public PolicyCT getPolicyResponse() {
		return policyResponse;
	}

	/**
	 * Sets the value of the policyResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicyCT }
	 * 
	 */
	public void setPolicyResponse(PolicyCT value) {
		this.policyResponse = value;
	}

	/**
	 * Gets the value of the additionalInfo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdditionalInfo() {
		return additionalInfo;
	}

	/**
	 * Sets the value of the additionalInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdditionalInfo(String value) {
		this.additionalInfo = value;
	}

}
