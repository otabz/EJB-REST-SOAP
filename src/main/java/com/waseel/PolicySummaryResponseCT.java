package com.waseel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PolicySummaryResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PolicySummaryResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedData" type="{http://www.waseel.com/wsdl/primary/wschema}PolicyInquiryCriteriaCT"/>
 *         &lt;element name="Status" type="{http://www.waseel.com/wsdl/primary/wschema}StatusCT"/>
 *         &lt;element name="PolicyList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PolicyLine" type="{http://www.waseel.com/wsdl/primary/wschema}PolicyGenInfoCT" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "PolicySummaryResponseCT", propOrder = { "requestedData",
		"status", "policyList", "additionalInfo" })
public class PolicySummaryResponseCT {

	@XmlElement(name = "RequestedData", required = true)
	protected PolicyInquiryCriteriaCT requestedData;
	@XmlElement(name = "Status", required = true)
	protected StatusCT status;
	@XmlElement(name = "PolicyList", required = true)
	protected PolicySummaryResponseCT.PolicyList policyList;
	protected String additionalInfo;

	/**
	 * Gets the value of the requestedData property.
	 * 
	 * @return possible object is {@link PolicyInquiryCriteriaCT }
	 * 
	 */
	public PolicyInquiryCriteriaCT getRequestedData() {
		return requestedData;
	}

	/**
	 * Sets the value of the requestedData property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicyInquiryCriteriaCT }
	 * 
	 */
	public void setRequestedData(PolicyInquiryCriteriaCT value) {
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
	 * Gets the value of the policyList property.
	 * 
	 * @return possible object is {@link PolicySummaryResponseCT.PolicyList }
	 * 
	 */
	public PolicySummaryResponseCT.PolicyList getPolicyList() {
		return policyList;
	}

	/**
	 * Sets the value of the policyList property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicySummaryResponseCT.PolicyList }
	 * 
	 */
	public void setPolicyList(PolicySummaryResponseCT.PolicyList value) {
		this.policyList = value;
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
	 *         &lt;element name="PolicyLine" type="{http://www.waseel.com/wsdl/primary/wschema}PolicyGenInfoCT" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "policyLine" })
	public static class PolicyList {

		@XmlElement(name = "PolicyLine")
		protected List<PolicyGenInfoCT> policyLine;
		@XmlAttribute(required = true)
		protected int count;

		/**
		 * Gets the value of the policyLine property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the policyLine property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getPolicyLine().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link PolicyGenInfoCT }
		 * 
		 * 
		 */
		public List<PolicyGenInfoCT> getPolicyLine() {
			if (policyLine == null) {
				policyLine = new ArrayList<PolicyGenInfoCT>();
			}
			return this.policyLine;
		}

		/**
		 * Gets the value of the count property.
		 * 
		 */
		public int getCount() {
			return count;
		}

		/**
		 * Sets the value of the count property.
		 * 
		 */
		public void setCount(int value) {
			this.count = value;
		}

	}

}
