package com.waseel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommonMessageHeader" type="{http://www.waseel.com/wsdl/primary/wschema}MessageHeaderCT"/>
 *         &lt;choice>
 *           &lt;element name="ErrorResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ErrorResponseCT" maxOccurs="unbounded"/>
 *           &lt;element name="EligibilitySubmissionRequest" type="{http://www.waseel.com/wsdl/primary/wschema}EligibilitySubmissionRequestCT"/>
 *           &lt;element name="EligibilitySubmissionResponse" type="{http://www.waseel.com/wsdl/primary/wschema}EligibilitySubmissionReponseCT"/>
 *           &lt;element name="ApprovalSubmissionRequest" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalSubmissionRequestCT"/>
 *           &lt;element name="ApprovalSubmissionResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalSubmissionResponseCT"/>
 *           &lt;element name="ApprovalInquiryRequest" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalInquiryRequestCT"/>
 *           &lt;element name="ApprovalInquiryResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalInquiryResponseCT"/>
 *           &lt;element name="ApprovalNotificationRequest" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalNotificationRequestCT"/>
 *           &lt;element name="ApprovalNotificationResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalNotificationResponseCT"/>
 *           &lt;element name="ClaimSubmissionRequest" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimSubmissionRequestCT"/>
 *           &lt;element name="ClaimSubmissionResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimSubmissionResponseCT"/>
 *           &lt;element name="ClaimInquiryRequest" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimInquiryRequestCT"/>
 *           &lt;element name="ClaimInquiryResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimInquiryResponseCT"/>
 *           &lt;element name="PolicyNotificationRequest" type="{http://www.waseel.com/wsdl/primary/wschema}PolicyNotificationRequestCT"/>
 *           &lt;element name="PolicyNotificationResponse" type="{http://www.waseel.com/wsdl/primary/wschema}PolicyNotificationResponseCT"/>
 *           &lt;element name="PolicyInquiryRequest" type="{http://www.waseel.com/wsdl/primary/wschema}PolicyInquiryRequestCT"/>
 *           &lt;element name="PolicyInuiryResponse" type="{http://www.waseel.com/wsdl/primary/wschema}PolicyInquiryResponseCT"/>
 *           &lt;element name="ClaimNotificationRequest" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimNotificationRequestCT"/>
 *           &lt;element name="ClaimNotificationResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimNotificationResponseCT"/>
 *           &lt;element name="AttachmentSubmissionRequest" type="{http://www.waseel.com/wsdl/primary/wschema}AttachmentSubmissionRequestCT"/>
 *           &lt;element name="AttachmentSubmissionResponse" type="{http://www.waseel.com/wsdl/primary/wschema}AttachmentSubmissionResponseCT"/>
 *           &lt;element name="MSOBRequest" type="{http://www.waseel.com/wsdl/primary/wschema}MSOBRequestCT"/>
 *           &lt;element name="MEOBRequest" type="{http://www.waseel.com/wsdl/primary/wschema}MEOBRequestCT"/>
 *           &lt;element name="MSOBResponse" type="{http://www.waseel.com/wsdl/primary/wschema}MSOBResponseCT"/>
 *           &lt;element name="MEOBResponse" type="{http://www.waseel.com/wsdl/primary/wschema}MEOBResponseCT"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "commonMessageHeader", "errorResponse",
		"eligibilitySubmissionRequest", "eligibilitySubmissionResponse",
		"approvalSubmissionRequest", "approvalSubmissionResponse",
		"approvalInquiryRequest", "approvalInquiryResponse",
		"approvalNotificationRequest", "approvalNotificationResponse",
		"claimSubmissionRequest", "claimSubmissionResponse",
		"claimInquiryRequest", "claimInquiryResponse",
		"policyNotificationRequest", "policyNotificationResponse",
		"policyInquiryRequest", "policyInuiryResponse",
		"claimNotificationRequest", "claimNotificationResponse",
		"attachmentSubmissionRequest", "attachmentSubmissionResponse",
		"msobRequest", "meobRequest", "msobResponse", "meobResponse" })
@XmlRootElement(name = "TransactionWrapper")
public class TransactionWrapper {

	@XmlElement(name = "CommonMessageHeader", required = true)
	protected MessageHeaderCT commonMessageHeader;
	@XmlElement(name = "ErrorResponse")
	protected List<ErrorResponseCT> errorResponse;
	@XmlElement(name = "EligibilitySubmissionRequest")
	protected EligibilitySubmissionRequestCT eligibilitySubmissionRequest;
	@XmlElement(name = "EligibilitySubmissionResponse")
	protected EligibilitySubmissionReponseCT eligibilitySubmissionResponse;
	@XmlElement(name = "ApprovalSubmissionRequest")
	protected ApprovalSubmissionRequestCT approvalSubmissionRequest;
	@XmlElement(name = "ApprovalSubmissionResponse")
	protected ApprovalSubmissionResponseCT approvalSubmissionResponse;
	@XmlElement(name = "ApprovalInquiryRequest")
	protected ApprovalInquiryRequestCT approvalInquiryRequest;
	@XmlElement(name = "ApprovalInquiryResponse")
	protected ApprovalInquiryResponseCT approvalInquiryResponse;
	@XmlElement(name = "ApprovalNotificationRequest")
	protected ApprovalNotificationRequestCT approvalNotificationRequest;
	@XmlElement(name = "ApprovalNotificationResponse")
	protected ApprovalNotificationResponseCT approvalNotificationResponse;
	@XmlElement(name = "ClaimSubmissionRequest")
	protected ClaimSubmissionRequestCT claimSubmissionRequest;
	@XmlElement(name = "ClaimSubmissionResponse")
	protected ClaimSubmissionResponseCT claimSubmissionResponse;
	@XmlElement(name = "ClaimInquiryRequest")
	protected ClaimInquiryRequestCT claimInquiryRequest;
	@XmlElement(name = "ClaimInquiryResponse")
	protected ClaimInquiryResponseCT claimInquiryResponse;
	@XmlElement(name = "PolicyNotificationRequest")
	protected PolicyNotificationRequestCT policyNotificationRequest;
	@XmlElement(name = "PolicyNotificationResponse")
	protected PolicyNotificationResponseCT policyNotificationResponse;
	@XmlElement(name = "PolicyInquiryRequest")
	protected PolicyInquiryRequestCT policyInquiryRequest;
	@XmlElement(name = "PolicyInuiryResponse")
	protected PolicyInquiryResponseCT policyInuiryResponse;
	@XmlElement(name = "ClaimNotificationRequest")
	protected ClaimNotificationRequestCT claimNotificationRequest;
	@XmlElement(name = "ClaimNotificationResponse")
	protected ClaimNotificationResponseCT claimNotificationResponse;
	@XmlElement(name = "AttachmentSubmissionRequest")
	protected AttachmentSubmissionRequestCT attachmentSubmissionRequest;
	@XmlElement(name = "AttachmentSubmissionResponse")
	protected AttachmentSubmissionResponseCT attachmentSubmissionResponse;
	@XmlElement(name = "MSOBRequest")
	protected MSOBRequestCT msobRequest;
	@XmlElement(name = "MEOBRequest")
	protected MEOBRequestCT meobRequest;
	@XmlElement(name = "MSOBResponse")
	protected MSOBResponseCT msobResponse;
	@XmlElement(name = "MEOBResponse")
	protected MEOBResponseCT meobResponse;

	/**
	 * Gets the value of the commonMessageHeader property.
	 * 
	 * @return possible object is {@link MessageHeaderCT }
	 * 
	 */
	public MessageHeaderCT getCommonMessageHeader() {
		return commonMessageHeader;
	}

	/**
	 * Sets the value of the commonMessageHeader property.
	 * 
	 * @param value
	 *            allowed object is {@link MessageHeaderCT }
	 * 
	 */
	public void setCommonMessageHeader(MessageHeaderCT value) {
		this.commonMessageHeader = value;
	}

	/**
	 * Gets the value of the errorResponse property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the errorResponse property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getErrorResponse().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ErrorResponseCT }
	 * 
	 * 
	 */
	public List<ErrorResponseCT> getErrorResponse() {
		if (errorResponse == null) {
			errorResponse = new ArrayList<ErrorResponseCT>();
		}
		return this.errorResponse;
	}

	/**
	 * Gets the value of the eligibilitySubmissionRequest property.
	 * 
	 * @return possible object is {@link EligibilitySubmissionRequestCT }
	 * 
	 */
	public EligibilitySubmissionRequestCT getEligibilitySubmissionRequest() {
		return eligibilitySubmissionRequest;
	}

	/**
	 * Sets the value of the eligibilitySubmissionRequest property.
	 * 
	 * @param value
	 *            allowed object is {@link EligibilitySubmissionRequestCT }
	 * 
	 */
	public void setEligibilitySubmissionRequest(
			EligibilitySubmissionRequestCT value) {
		this.eligibilitySubmissionRequest = value;
	}

	/**
	 * Gets the value of the eligibilitySubmissionResponse property.
	 * 
	 * @return possible object is {@link EligibilitySubmissionReponseCT }
	 * 
	 */
	public EligibilitySubmissionReponseCT getEligibilitySubmissionResponse() {
		return eligibilitySubmissionResponse;
	}

	/**
	 * Sets the value of the eligibilitySubmissionResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link EligibilitySubmissionReponseCT }
	 * 
	 */
	public void setEligibilitySubmissionResponse(
			EligibilitySubmissionReponseCT value) {
		this.eligibilitySubmissionResponse = value;
	}

	/**
	 * Gets the value of the approvalSubmissionRequest property.
	 * 
	 * @return possible object is {@link ApprovalSubmissionRequestCT }
	 * 
	 */
	public ApprovalSubmissionRequestCT getApprovalSubmissionRequest() {
		return approvalSubmissionRequest;
	}

	/**
	 * Sets the value of the approvalSubmissionRequest property.
	 * 
	 * @param value
	 *            allowed object is {@link ApprovalSubmissionRequestCT }
	 * 
	 */
	public void setApprovalSubmissionRequest(ApprovalSubmissionRequestCT value) {
		this.approvalSubmissionRequest = value;
	}

	/**
	 * Gets the value of the approvalSubmissionResponse property.
	 * 
	 * @return possible object is {@link ApprovalSubmissionResponseCT }
	 * 
	 */
	public ApprovalSubmissionResponseCT getApprovalSubmissionResponse() {
		return approvalSubmissionResponse;
	}

	/**
	 * Sets the value of the approvalSubmissionResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ApprovalSubmissionResponseCT }
	 * 
	 */
	public void setApprovalSubmissionResponse(ApprovalSubmissionResponseCT value) {
		this.approvalSubmissionResponse = value;
	}

	/**
	 * Gets the value of the approvalInquiryRequest property.
	 * 
	 * @return possible object is {@link ApprovalInquiryRequestCT }
	 * 
	 */
	public ApprovalInquiryRequestCT getApprovalInquiryRequest() {
		return approvalInquiryRequest;
	}

	/**
	 * Sets the value of the approvalInquiryRequest property.
	 * 
	 * @param value
	 *            allowed object is {@link ApprovalInquiryRequestCT }
	 * 
	 */
	public void setApprovalInquiryRequest(ApprovalInquiryRequestCT value) {
		this.approvalInquiryRequest = value;
	}

	/**
	 * Gets the value of the approvalInquiryResponse property.
	 * 
	 * @return possible object is {@link ApprovalInquiryResponseCT }
	 * 
	 */
	public ApprovalInquiryResponseCT getApprovalInquiryResponse() {
		return approvalInquiryResponse;
	}

	/**
	 * Sets the value of the approvalInquiryResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ApprovalInquiryResponseCT }
	 * 
	 */
	public void setApprovalInquiryResponse(ApprovalInquiryResponseCT value) {
		this.approvalInquiryResponse = value;
	}

	/**
	 * Gets the value of the approvalNotificationRequest property.
	 * 
	 * @return possible object is {@link ApprovalNotificationRequestCT }
	 * 
	 */
	public ApprovalNotificationRequestCT getApprovalNotificationRequest() {
		return approvalNotificationRequest;
	}

	/**
	 * Sets the value of the approvalNotificationRequest property.
	 * 
	 * @param value
	 *            allowed object is {@link ApprovalNotificationRequestCT }
	 * 
	 */
	public void setApprovalNotificationRequest(
			ApprovalNotificationRequestCT value) {
		this.approvalNotificationRequest = value;
	}

	/**
	 * Gets the value of the approvalNotificationResponse property.
	 * 
	 * @return possible object is {@link ApprovalNotificationResponseCT }
	 * 
	 */
	public ApprovalNotificationResponseCT getApprovalNotificationResponse() {
		return approvalNotificationResponse;
	}

	/**
	 * Sets the value of the approvalNotificationResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ApprovalNotificationResponseCT }
	 * 
	 */
	public void setApprovalNotificationResponse(
			ApprovalNotificationResponseCT value) {
		this.approvalNotificationResponse = value;
	}

	/**
	 * Gets the value of the claimSubmissionRequest property.
	 * 
	 * @return possible object is {@link ClaimSubmissionRequestCT }
	 * 
	 */
	public ClaimSubmissionRequestCT getClaimSubmissionRequest() {
		return claimSubmissionRequest;
	}

	/**
	 * Sets the value of the claimSubmissionRequest property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimSubmissionRequestCT }
	 * 
	 */
	public void setClaimSubmissionRequest(ClaimSubmissionRequestCT value) {
		this.claimSubmissionRequest = value;
	}

	/**
	 * Gets the value of the claimSubmissionResponse property.
	 * 
	 * @return possible object is {@link ClaimSubmissionResponseCT }
	 * 
	 */
	public ClaimSubmissionResponseCT getClaimSubmissionResponse() {
		return claimSubmissionResponse;
	}

	/**
	 * Sets the value of the claimSubmissionResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimSubmissionResponseCT }
	 * 
	 */
	public void setClaimSubmissionResponse(ClaimSubmissionResponseCT value) {
		this.claimSubmissionResponse = value;
	}

	/**
	 * Gets the value of the claimInquiryRequest property.
	 * 
	 * @return possible object is {@link ClaimInquiryRequestCT }
	 * 
	 */
	public ClaimInquiryRequestCT getClaimInquiryRequest() {
		return claimInquiryRequest;
	}

	/**
	 * Sets the value of the claimInquiryRequest property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimInquiryRequestCT }
	 * 
	 */
	public void setClaimInquiryRequest(ClaimInquiryRequestCT value) {
		this.claimInquiryRequest = value;
	}

	/**
	 * Gets the value of the claimInquiryResponse property.
	 * 
	 * @return possible object is {@link ClaimInquiryResponseCT }
	 * 
	 */
	public ClaimInquiryResponseCT getClaimInquiryResponse() {
		return claimInquiryResponse;
	}

	/**
	 * Sets the value of the claimInquiryResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimInquiryResponseCT }
	 * 
	 */
	public void setClaimInquiryResponse(ClaimInquiryResponseCT value) {
		this.claimInquiryResponse = value;
	}

	/**
	 * Gets the value of the policyNotificationRequest property.
	 * 
	 * @return possible object is {@link PolicyNotificationRequestCT }
	 * 
	 */
	public PolicyNotificationRequestCT getPolicyNotificationRequest() {
		return policyNotificationRequest;
	}

	/**
	 * Sets the value of the policyNotificationRequest property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicyNotificationRequestCT }
	 * 
	 */
	public void setPolicyNotificationRequest(PolicyNotificationRequestCT value) {
		this.policyNotificationRequest = value;
	}

	/**
	 * Gets the value of the policyNotificationResponse property.
	 * 
	 * @return possible object is {@link PolicyNotificationResponseCT }
	 * 
	 */
	public PolicyNotificationResponseCT getPolicyNotificationResponse() {
		return policyNotificationResponse;
	}

	/**
	 * Sets the value of the policyNotificationResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicyNotificationResponseCT }
	 * 
	 */
	public void setPolicyNotificationResponse(PolicyNotificationResponseCT value) {
		this.policyNotificationResponse = value;
	}

	/**
	 * Gets the value of the policyInquiryRequest property.
	 * 
	 * @return possible object is {@link PolicyInquiryRequestCT }
	 * 
	 */
	public PolicyInquiryRequestCT getPolicyInquiryRequest() {
		return policyInquiryRequest;
	}

	/**
	 * Sets the value of the policyInquiryRequest property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicyInquiryRequestCT }
	 * 
	 */
	public void setPolicyInquiryRequest(PolicyInquiryRequestCT value) {
		this.policyInquiryRequest = value;
	}

	/**
	 * Gets the value of the policyInuiryResponse property.
	 * 
	 * @return possible object is {@link PolicyInquiryResponseCT }
	 * 
	 */
	public PolicyInquiryResponseCT getPolicyInuiryResponse() {
		return policyInuiryResponse;
	}

	/**
	 * Sets the value of the policyInuiryResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicyInquiryResponseCT }
	 * 
	 */
	public void setPolicyInuiryResponse(PolicyInquiryResponseCT value) {
		this.policyInuiryResponse = value;
	}

	/**
	 * Gets the value of the claimNotificationRequest property.
	 * 
	 * @return possible object is {@link ClaimNotificationRequestCT }
	 * 
	 */
	public ClaimNotificationRequestCT getClaimNotificationRequest() {
		return claimNotificationRequest;
	}

	/**
	 * Sets the value of the claimNotificationRequest property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimNotificationRequestCT }
	 * 
	 */
	public void setClaimNotificationRequest(ClaimNotificationRequestCT value) {
		this.claimNotificationRequest = value;
	}

	/**
	 * Gets the value of the claimNotificationResponse property.
	 * 
	 * @return possible object is {@link ClaimNotificationResponseCT }
	 * 
	 */
	public ClaimNotificationResponseCT getClaimNotificationResponse() {
		return claimNotificationResponse;
	}

	/**
	 * Sets the value of the claimNotificationResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimNotificationResponseCT }
	 * 
	 */
	public void setClaimNotificationResponse(ClaimNotificationResponseCT value) {
		this.claimNotificationResponse = value;
	}

	/**
	 * Gets the value of the attachmentSubmissionRequest property.
	 * 
	 * @return possible object is {@link AttachmentSubmissionRequestCT }
	 * 
	 */
	public AttachmentSubmissionRequestCT getAttachmentSubmissionRequest() {
		return attachmentSubmissionRequest;
	}

	/**
	 * Sets the value of the attachmentSubmissionRequest property.
	 * 
	 * @param value
	 *            allowed object is {@link AttachmentSubmissionRequestCT }
	 * 
	 */
	public void setAttachmentSubmissionRequest(
			AttachmentSubmissionRequestCT value) {
		this.attachmentSubmissionRequest = value;
	}

	/**
	 * Gets the value of the attachmentSubmissionResponse property.
	 * 
	 * @return possible object is {@link AttachmentSubmissionResponseCT }
	 * 
	 */
	public AttachmentSubmissionResponseCT getAttachmentSubmissionResponse() {
		return attachmentSubmissionResponse;
	}

	/**
	 * Sets the value of the attachmentSubmissionResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link AttachmentSubmissionResponseCT }
	 * 
	 */
	public void setAttachmentSubmissionResponse(
			AttachmentSubmissionResponseCT value) {
		this.attachmentSubmissionResponse = value;
	}

	/**
	 * Gets the value of the msobRequest property.
	 * 
	 * @return possible object is {@link MSOBRequestCT }
	 * 
	 */
	public MSOBRequestCT getMSOBRequest() {
		return msobRequest;
	}

	/**
	 * Sets the value of the msobRequest property.
	 * 
	 * @param value
	 *            allowed object is {@link MSOBRequestCT }
	 * 
	 */
	public void setMSOBRequest(MSOBRequestCT value) {
		this.msobRequest = value;
	}

	/**
	 * Gets the value of the meobRequest property.
	 * 
	 * @return possible object is {@link MEOBRequestCT }
	 * 
	 */
	public MEOBRequestCT getMEOBRequest() {
		return meobRequest;
	}

	/**
	 * Sets the value of the meobRequest property.
	 * 
	 * @param value
	 *            allowed object is {@link MEOBRequestCT }
	 * 
	 */
	public void setMEOBRequest(MEOBRequestCT value) {
		this.meobRequest = value;
	}

	/**
	 * Gets the value of the msobResponse property.
	 * 
	 * @return possible object is {@link MSOBResponseCT }
	 * 
	 */
	public MSOBResponseCT getMSOBResponse() {
		return msobResponse;
	}

	/**
	 * Sets the value of the msobResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link MSOBResponseCT }
	 * 
	 */
	public void setMSOBResponse(MSOBResponseCT value) {
		this.msobResponse = value;
	}

	/**
	 * Gets the value of the meobResponse property.
	 * 
	 * @return possible object is {@link MEOBResponseCT }
	 * 
	 */
	public MEOBResponseCT getMEOBResponse() {
		return meobResponse;
	}

	/**
	 * Sets the value of the meobResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link MEOBResponseCT }
	 * 
	 */
	public void setMEOBResponse(MEOBResponseCT value) {
		this.meobResponse = value;
	}

}
