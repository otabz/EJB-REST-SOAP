package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ClaimSubmissionResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimSubmissionResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedData" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimSubmissionRequestCT"/>
 *         &lt;element name="ClaimResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimResponseCT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimSubmissionResponseCT", propOrder = { "requestedData",
		"claimResponse" })
public class ClaimSubmissionResponseCT {

	@XmlElement(name = "RequestedData", required = true)
	protected ClaimSubmissionRequestCT requestedData;
	@XmlElement(name = "ClaimResponse", required = true)
	protected ClaimResponseCT claimResponse;

	/**
	 * Gets the value of the requestedData property.
	 * 
	 * @return possible object is {@link ClaimSubmissionRequestCT }
	 * 
	 */
	public ClaimSubmissionRequestCT getRequestedData() {
		return requestedData;
	}

	/**
	 * Sets the value of the requestedData property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimSubmissionRequestCT }
	 * 
	 */
	public void setRequestedData(ClaimSubmissionRequestCT value) {
		this.requestedData = value;
	}

	/**
	 * Gets the value of the claimResponse property.
	 * 
	 * @return possible object is {@link ClaimResponseCT }
	 * 
	 */
	public ClaimResponseCT getClaimResponse() {
		return claimResponse;
	}

	/**
	 * Sets the value of the claimResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimResponseCT }
	 * 
	 */
	public void setClaimResponse(ClaimResponseCT value) {
		this.claimResponse = value;
	}

}
