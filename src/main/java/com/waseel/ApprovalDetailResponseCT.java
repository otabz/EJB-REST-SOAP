package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ApprovalDetailResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalDetailResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ApprovalReference">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="approvalNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="approvalVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "ApprovalDetailResponseCT", propOrder = { "requestedData",
		"approvalResponse" })
public class ApprovalDetailResponseCT {

	@XmlElement(name = "RequestedData", required = true)
	protected ApprovalDetailResponseCT.RequestedData requestedData;
	@XmlElement(name = "ApprovalResponse", required = true)
	protected ApprovalResponseCT approvalResponse;

	/**
	 * Gets the value of the requestedData property.
	 * 
	 * @return possible object is {@link ApprovalDetailResponseCT.RequestedData }
	 * 
	 */
	public ApprovalDetailResponseCT.RequestedData getRequestedData() {
		return requestedData;
	}

	/**
	 * Sets the value of the requestedData property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link ApprovalDetailResponseCT.RequestedData }
	 * 
	 */
	public void setRequestedData(ApprovalDetailResponseCT.RequestedData value) {
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
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "approvalReference" })
	public static class RequestedData {

		@XmlElement(name = "ApprovalReference", required = true)
		protected ApprovalDetailResponseCT.RequestedData.ApprovalReference approvalReference;

		/**
		 * Gets the value of the approvalReference property.
		 * 
		 * @return possible object is
		 *         {@link ApprovalDetailResponseCT.RequestedData.ApprovalReference }
		 * 
		 */
		public ApprovalDetailResponseCT.RequestedData.ApprovalReference getApprovalReference() {
			return approvalReference;
		}

		/**
		 * Sets the value of the approvalReference property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link ApprovalDetailResponseCT.RequestedData.ApprovalReference }
		 * 
		 */
		public void setApprovalReference(
				ApprovalDetailResponseCT.RequestedData.ApprovalReference value) {
			this.approvalReference = value;
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

}
