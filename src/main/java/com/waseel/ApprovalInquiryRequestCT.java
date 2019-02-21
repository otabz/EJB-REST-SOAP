package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ApprovalInquiryRequestCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalInquiryRequestCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Criteria" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalCriteriaCT"/>
 *         &lt;element name="ApprovalReference">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="approvalNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="approvalVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalInquiryRequestCT", propOrder = { "criteria",
		"approvalReference" })
public class ApprovalInquiryRequestCT {

	@XmlElement(name = "Criteria")
	protected ApprovalCriteriaCT criteria;
	@XmlElement(name = "ApprovalReference")
	protected ApprovalInquiryRequestCT.ApprovalReference approvalReference;

	/**
	 * Gets the value of the criteria property.
	 * 
	 * @return possible object is {@link ApprovalCriteriaCT }
	 * 
	 */
	public ApprovalCriteriaCT getCriteria() {
		return criteria;
	}

	/**
	 * Sets the value of the criteria property.
	 * 
	 * @param value
	 *            allowed object is {@link ApprovalCriteriaCT }
	 * 
	 */
	public void setCriteria(ApprovalCriteriaCT value) {
		this.criteria = value;
	}

	/**
	 * Gets the value of the approvalReference property.
	 * 
	 * @return possible object is
	 *         {@link ApprovalInquiryRequestCT.ApprovalReference }
	 * 
	 */
	public ApprovalInquiryRequestCT.ApprovalReference getApprovalReference() {
		return approvalReference;
	}

	/**
	 * Sets the value of the approvalReference property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link ApprovalInquiryRequestCT.ApprovalReference }
	 * 
	 */
	public void setApprovalReference(
			ApprovalInquiryRequestCT.ApprovalReference value) {
		this.approvalReference = value;
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
	 *         &lt;element name="approvalNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="approvalVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "approvalNumber", "approvalVersion" })
	public static class ApprovalReference {

		@XmlElement(required = true)
		protected String approvalNumber;
		protected String approvalVersion;

		/**
		 * Gets the value of the approvalNumber property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApprovalNumber() {
			return approvalNumber;
		}

		/**
		 * Sets the value of the approvalNumber property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApprovalNumber(String value) {
			this.approvalNumber = value;
		}

		/**
		 * Gets the value of the approvalVersion property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApprovalVersion() {
			return approvalVersion;
		}

		/**
		 * Sets the value of the approvalVersion property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApprovalVersion(String value) {
			this.approvalVersion = value;
		}

	}

}
