package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ClaimIdentifierCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimIdentifierCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="portalTransactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="providerClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="providerParentClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerBatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerBatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligibilityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimIdentifierCT", propOrder = { "portalTransactionID",
		"providerClaimNumber", "providerParentClaimNumber", "providerBatchID",
		"payerBatchID", "payerClaimNumber", "approvalNumber",
		"eligibilityNumber" })
public class ClaimIdentifierCT {

	@XmlElement(required = true)
	protected String portalTransactionID;
	@XmlElement(required = true)
	protected String providerClaimNumber;
	protected String providerParentClaimNumber;
	protected String providerBatchID;
	protected String payerBatchID;
	protected String payerClaimNumber;
	protected String approvalNumber;
	protected String eligibilityNumber;

	/**
	 * Gets the value of the portalTransactionID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPortalTransactionID() {
		return portalTransactionID;
	}

	/**
	 * Sets the value of the portalTransactionID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPortalTransactionID(String value) {
		this.portalTransactionID = value;
	}

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
	 * Gets the value of the providerParentClaimNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProviderParentClaimNumber() {
		return providerParentClaimNumber;
	}

	/**
	 * Sets the value of the providerParentClaimNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProviderParentClaimNumber(String value) {
		this.providerParentClaimNumber = value;
	}

	/**
	 * Gets the value of the providerBatchID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProviderBatchID() {
		return providerBatchID;
	}

	/**
	 * Sets the value of the providerBatchID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProviderBatchID(String value) {
		this.providerBatchID = value;
	}

	/**
	 * Gets the value of the payerBatchID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPayerBatchID() {
		return payerBatchID;
	}

	/**
	 * Sets the value of the payerBatchID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPayerBatchID(String value) {
		this.payerBatchID = value;
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
	 * Gets the value of the eligibilityNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEligibilityNumber() {
		return eligibilityNumber;
	}

	/**
	 * Sets the value of the eligibilityNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEligibilityNumber(String value) {
		this.eligibilityNumber = value;
	}

}
