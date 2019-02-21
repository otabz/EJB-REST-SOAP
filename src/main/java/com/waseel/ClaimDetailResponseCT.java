package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ClaimDetailResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimDetailResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClaimReference">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="providerClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="payerClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "ClaimDetailResponseCT", propOrder = { "requestedData",
		"claimResponse" })
public class ClaimDetailResponseCT {

	@XmlElement(name = "RequestedData", required = true)
	protected ClaimDetailResponseCT.RequestedData requestedData;
	@XmlElement(name = "ClaimResponse", required = true)
	protected ClaimResponseCT claimResponse;

	/**
	 * Gets the value of the requestedData property.
	 * 
	 * @return possible object is {@link ClaimDetailResponseCT.RequestedData }
	 * 
	 */
	public ClaimDetailResponseCT.RequestedData getRequestedData() {
		return requestedData;
	}

	/**
	 * Sets the value of the requestedData property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimDetailResponseCT.RequestedData }
	 * 
	 */
	public void setRequestedData(ClaimDetailResponseCT.RequestedData value) {
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
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "claimReference" })
	public static class RequestedData {

		@XmlElement(name = "ClaimReference", required = true)
		protected ClaimDetailResponseCT.RequestedData.ClaimReference claimReference;

		/**
		 * Gets the value of the claimReference property.
		 * 
		 * @return possible object is
		 *         {@link ClaimDetailResponseCT.RequestedData.ClaimReference }
		 * 
		 */
		public ClaimDetailResponseCT.RequestedData.ClaimReference getClaimReference() {
			return claimReference;
		}

		/**
		 * Sets the value of the claimReference property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link ClaimDetailResponseCT.RequestedData.ClaimReference }
		 * 
		 */
		public void setClaimReference(
				ClaimDetailResponseCT.RequestedData.ClaimReference value) {
			this.claimReference = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
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
		@XmlType(name = "", propOrder = { "providerClaimNumber",
				"payerClaimNumber" })
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

}
