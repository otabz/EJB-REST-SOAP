package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ClaimCriteriaCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimCriteriaCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerBatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerBatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimCriteriaCT", propOrder = { "providerBatchID",
		"payerBatchID", "providerClaimNumber", "payerClaimNumber" })
public class ClaimCriteriaCT {

	protected String providerBatchID;
	protected String payerBatchID;
	protected String providerClaimNumber;
	protected String payerClaimNumber;

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
