package com.waseel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ApprovalSummaryResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalSummaryResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedData" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalCriteriaCT"/>
 *         &lt;element name="Status" type="{http://www.waseel.com/wsdl/primary/wschema}StatusCT"/>
 *         &lt;element name="ApprovalList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ApprovalLine" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalLineCT" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="additionalInfo" type="{http://www.waseel.com/wsdl/primary/wschema}additionalInfoST" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalSummaryResponseCT", propOrder = { "requestedData",
		"status", "approvalList", "additionalInfo" })
public class ApprovalSummaryResponseCT {

	@XmlElement(name = "RequestedData", required = true)
	protected ApprovalCriteriaCT requestedData;
	@XmlElement(name = "Status", required = true)
	protected StatusCT status;
	@XmlElement(name = "ApprovalList", required = true)
	protected ApprovalSummaryResponseCT.ApprovalList approvalList;
	protected String additionalInfo;

	/**
	 * Gets the value of the requestedData property.
	 * 
	 * @return possible object is {@link ApprovalCriteriaCT }
	 * 
	 */
	public ApprovalCriteriaCT getRequestedData() {
		return requestedData;
	}

	/**
	 * Sets the value of the requestedData property.
	 * 
	 * @param value
	 *            allowed object is {@link ApprovalCriteriaCT }
	 * 
	 */
	public void setRequestedData(ApprovalCriteriaCT value) {
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
	 * Gets the value of the approvalList property.
	 * 
	 * @return possible object is {@link ApprovalSummaryResponseCT.ApprovalList }
	 * 
	 */
	public ApprovalSummaryResponseCT.ApprovalList getApprovalList() {
		return approvalList;
	}

	/**
	 * Sets the value of the approvalList property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link ApprovalSummaryResponseCT.ApprovalList }
	 * 
	 */
	public void setApprovalList(ApprovalSummaryResponseCT.ApprovalList value) {
		this.approvalList = value;
	}

	/**
	 * Gets the value of the additionalInfo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdditionalInfo() {
		return additionalInfo;
	}

	/**
	 * Sets the value of the additionalInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdditionalInfo(String value) {
		this.additionalInfo = value;
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
	 *         &lt;element name="ApprovalLine" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalLineCT" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}integer" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "approvalLine" })
	public static class ApprovalList {

		@XmlElement(name = "ApprovalLine")
		protected List<ApprovalLineCT> approvalLine;
		@XmlAttribute
		protected BigInteger count;

		/**
		 * Gets the value of the approvalLine property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the approvalLine property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getApprovalLine().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link ApprovalLineCT }
		 * 
		 * 
		 */
		public List<ApprovalLineCT> getApprovalLine() {
			if (approvalLine == null) {
				approvalLine = new ArrayList<ApprovalLineCT>();
			}
			return this.approvalLine;
		}

		/**
		 * Gets the value of the count property.
		 * 
		 * @return possible object is {@link BigInteger }
		 * 
		 */
		public BigInteger getCount() {
			return count;
		}

		/**
		 * Sets the value of the count property.
		 * 
		 * @param value
		 *            allowed object is {@link BigInteger }
		 * 
		 */
		public void setCount(BigInteger value) {
			this.count = value;
		}

	}

}
