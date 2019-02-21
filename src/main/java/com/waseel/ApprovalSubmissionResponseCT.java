package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ApprovalSubmissionResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalSubmissionResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedData" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalSubmissionRequestCT"/>
 *         &lt;element name="ApprovalResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalResponseCT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalSubmissionResponseCT", propOrder = { "requestedData",
		"approvalResponse" })
public class ApprovalSubmissionResponseCT {

	@XmlElement(name = "RequestedData", required = true)
	protected ApprovalSubmissionRequestCT requestedData;
	@XmlElement(name = "ApprovalResponse", required = true)
	protected ApprovalResponseCT approvalResponse;

	/**
	 * Gets the value of the requestedData property.
	 * 
	 * @return possible object is {@link ApprovalSubmissionRequestCT }
	 * 
	 */
	public ApprovalSubmissionRequestCT getRequestedData() {
		return requestedData;
	}

	/**
	 * Sets the value of the requestedData property.
	 * 
	 * @param value
	 *            allowed object is {@link ApprovalSubmissionRequestCT }
	 * 
	 */
	public void setRequestedData(ApprovalSubmissionRequestCT value) {
		this.requestedData = value;
	}

	/**
	 * Gets the value of the approvalResponse property.
	 * 
	 * @return possible object is {@link ApprovalResponseCT }
	 * 
	 */
	public ApprovalResponseCT getApprovalResponse() {
		return approvalResponse;
	}

	/**
	 * Sets the value of the approvalResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ApprovalResponseCT }
	 * 
	 */
	public void setApprovalResponse(ApprovalResponseCT value) {
		this.approvalResponse = value;
	}

}
