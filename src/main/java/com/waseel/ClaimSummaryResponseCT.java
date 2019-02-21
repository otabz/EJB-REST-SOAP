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
 * Java class for ClaimSummaryResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimSummaryResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedData" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimCriteriaCT"/>
 *         &lt;element name="Status" type="{http://www.waseel.com/wsdl/primary/wschema}StatusCT"/>
 *         &lt;element name="ClaimList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClaimLine" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimLineCT" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "ClaimSummaryResponseCT", propOrder = { "requestedData",
		"status", "claimList", "additionalInfo" })
public class ClaimSummaryResponseCT {

	@XmlElement(name = "RequestedData", required = true)
	protected ClaimCriteriaCT requestedData;
	@XmlElement(name = "Status", required = true)
	protected StatusCT status;
	@XmlElement(name = "ClaimList", required = true)
	protected ClaimSummaryResponseCT.ClaimList claimList;
	protected String additionalInfo;

	/**
	 * Gets the value of the requestedData property.
	 * 
	 * @return possible object is {@link ClaimCriteriaCT }
	 * 
	 */
	public ClaimCriteriaCT getRequestedData() {
		return requestedData;
	}

	/**
	 * Sets the value of the requestedData property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimCriteriaCT }
	 * 
	 */
	public void setRequestedData(ClaimCriteriaCT value) {
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
	 * Gets the value of the claimList property.
	 * 
	 * @return possible object is {@link ClaimSummaryResponseCT.ClaimList }
	 * 
	 */
	public ClaimSummaryResponseCT.ClaimList getClaimList() {
		return claimList;
	}

	/**
	 * Sets the value of the claimList property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimSummaryResponseCT.ClaimList }
	 * 
	 */
	public void setClaimList(ClaimSummaryResponseCT.ClaimList value) {
		this.claimList = value;
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
	 *         &lt;element name="ClaimLine" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimLineCT" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "claimLine" })
	public static class ClaimList {

		@XmlElement(name = "ClaimLine")
		protected List<ClaimLineCT> claimLine;
		@XmlAttribute
		protected Integer count;

		/**
		 * Gets the value of the claimLine property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the claimLine property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getClaimLine().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link ClaimLineCT }
		 * 
		 * 
		 */
		public List<ClaimLineCT> getClaimLine() {
			if (claimLine == null) {
				claimLine = new ArrayList<ClaimLineCT>();
			}
			return this.claimLine;
		}

		/**
		 * Gets the value of the count property.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getCount() {
			return count;
		}

		/**
		 * Sets the value of the count property.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setCount(Integer value) {
			this.count = value;
		}

	}

}
