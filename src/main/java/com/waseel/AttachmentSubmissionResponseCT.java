package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AttachmentSubmissionResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentSubmissionResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Member" type="{http://www.waseel.com/wsdl/primary/wschema}MemberCT"/>
 *                   &lt;element name="caseType" type="{http://www.waseel.com/wsdl/primary/wschema}caseTypeST"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="status" type="{http://www.waseel.com/wsdl/primary/wschema}StatusCT"/>
 *         &lt;element name="AttachmentIdentifier" type="{http://www.waseel.com/wsdl/primary/wschema}AttachmentIdentifierCT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentSubmissionResponseCT", propOrder = {
		"requestedData", "status", "attachmentIdentifier" })
public class AttachmentSubmissionResponseCT {

	@XmlElement(name = "RequestedData", required = true)
	protected AttachmentSubmissionResponseCT.RequestedData requestedData;
	@XmlElement(required = true)
	protected StatusCT status;
	@XmlElement(name = "AttachmentIdentifier", required = true)
	protected AttachmentIdentifierCT attachmentIdentifier;

	/**
	 * Gets the value of the requestedData property.
	 * 
	 * @return possible object is
	 *         {@link AttachmentSubmissionResponseCT.RequestedData }
	 * 
	 */
	public AttachmentSubmissionResponseCT.RequestedData getRequestedData() {
		return requestedData;
	}

	/**
	 * Sets the value of the requestedData property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link AttachmentSubmissionResponseCT.RequestedData }
	 * 
	 */
	public void setRequestedData(
			AttachmentSubmissionResponseCT.RequestedData value) {
		this.requestedData = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link StatusCT }
	 * 
	 */
	public StatusCT getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link StatusCT }
	 * 
	 */
	public void setStatus(StatusCT value) {
		this.status = value;
	}

	/**
	 * Gets the value of the attachmentIdentifier property.
	 * 
	 * @return possible object is {@link AttachmentIdentifierCT }
	 * 
	 */
	public AttachmentIdentifierCT getAttachmentIdentifier() {
		return attachmentIdentifier;
	}

	/**
	 * Sets the value of the attachmentIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link AttachmentIdentifierCT }
	 * 
	 */
	public void setAttachmentIdentifier(AttachmentIdentifierCT value) {
		this.attachmentIdentifier = value;
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
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Member" type="{http://www.waseel.com/wsdl/primary/wschema}MemberCT"/>
	 *         &lt;element name="caseType" type="{http://www.waseel.com/wsdl/primary/wschema}caseTypeST"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "member", "caseType" })
	public static class RequestedData {

		@XmlElement(name = "Member", required = true)
		protected MemberCT member;
		@XmlElement(required = true)
		protected CaseTypeST caseType;

		/**
		 * Gets the value of the member property.
		 * 
		 * @return possible object is {@link MemberCT }
		 * 
		 */
		public MemberCT getMember() {
			return member;
		}

		/**
		 * Sets the value of the member property.
		 * 
		 * @param value
		 *            allowed object is {@link MemberCT }
		 * 
		 */
		public void setMember(MemberCT value) {
			this.member = value;
		}

		/**
		 * Gets the value of the caseType property.
		 * 
		 * @return possible object is {@link CaseTypeST }
		 * 
		 */
		public CaseTypeST getCaseType() {
			return caseType;
		}

		/**
		 * Sets the value of the caseType property.
		 * 
		 * @param value
		 *            allowed object is {@link CaseTypeST }
		 * 
		 */
		public void setCaseType(CaseTypeST value) {
			this.caseType = value;
		}

	}

}
