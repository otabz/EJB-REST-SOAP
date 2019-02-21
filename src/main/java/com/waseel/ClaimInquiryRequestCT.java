package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ClaimInquiryRequestCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimInquiryRequestCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Criteria" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimCriteriaCT"/>
 *         &lt;element name="ClaimReference">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="providerClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="payerClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
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
@XmlType(name = "ClaimInquiryRequestCT", propOrder = { "criteria",
		"claimReference" })
public class ClaimInquiryRequestCT {

	@XmlElement(name = "Criteria")
	protected ClaimCriteriaCT criteria;
	@XmlElement(name = "ClaimReference")
	protected ClaimInquiryRequestCT.ClaimReference claimReference;

	/**
	 * Gets the value of the criteria property.
	 * 
	 * @return possible object is {@link ClaimCriteriaCT }
	 * 
	 */
	public ClaimCriteriaCT getCriteria() {
		return criteria;
	}

	/**
	 * Sets the value of the criteria property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimCriteriaCT }
	 * 
	 */
	public void setCriteria(ClaimCriteriaCT value) {
		this.criteria = value;
	}

	/**
	 * Gets the value of the claimReference property.
	 * 
	 * @return possible object is {@link ClaimInquiryRequestCT.ClaimReference }
	 * 
	 */
	public ClaimInquiryRequestCT.ClaimReference getClaimReference() {
		return claimReference;
	}

	/**
	 * Sets the value of the claimReference property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimInquiryRequestCT.ClaimReference }
	 * 
	 */
	public void setClaimReference(ClaimInquiryRequestCT.ClaimReference value) {
		this.claimReference = value;
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
	 *       &lt;choice>
	 *         &lt;element name="providerClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="payerClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *       &lt;/choice>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "providerClaimNumber", "payerClaimNumber" })
	public static class ClaimReference {

		protected String providerClaimNumber;
		protected String payerClaimNumber;

		/**
		 * Gets the value of the providerClaimNumber property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getProviderClaimNumber() {
			return providerClaimNumber;
		}

		/**
		 * Sets the value of the providerClaimNumber property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setProviderClaimNumber(String value) {
			this.providerClaimNumber = value;
		}

		/**
		 * Gets the value of the payerClaimNumber property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPayerClaimNumber() {
			return payerClaimNumber;
		}

		/**
		 * Sets the value of the payerClaimNumber property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPayerClaimNumber(String value) {
			this.payerClaimNumber = value;
		}

	}

}
