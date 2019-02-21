package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for PolicyGenInfoCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyGenInfoCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyNumber" type="{http://www.waseel.com/wsdl/primary/wschema}policyNumberST"/>
 *         &lt;element name="PolicyHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PolicyType" type="{http://www.waseel.com/wsdl/primary/wschema}policyTypeST"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyGenInfoCT", propOrder = { "policyNumber",
		"policyHolderName", "policyType", "issueDate", "startDate", "endDate",
		"lastUpdate" })
public class PolicyGenInfoCT {

	@XmlElement(required = true)
	protected String policyNumber;
	@XmlElement(name = "PolicyHolderName", required = true)
	protected String policyHolderName;
	@XmlElement(name = "PolicyType", required = true)
	protected PolicyTypeST policyType;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar issueDate;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar startDate;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar endDate;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar lastUpdate;

	/**
	 * Gets the value of the policyNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPolicyNumber() {
		return policyNumber;
	}

	/**
	 * Sets the value of the policyNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPolicyNumber(String value) {
		this.policyNumber = value;
	}

	/**
	 * Gets the value of the policyHolderName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPolicyHolderName() {
		return policyHolderName;
	}

	/**
	 * Sets the value of the policyHolderName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPolicyHolderName(String value) {
		this.policyHolderName = value;
	}

	/**
	 * Gets the value of the policyType property.
	 * 
	 * @return possible object is {@link PolicyTypeST }
	 * 
	 */
	public PolicyTypeST getPolicyType() {
		return policyType;
	}

	/**
	 * Sets the value of the policyType property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicyTypeST }
	 * 
	 */
	public void setPolicyType(PolicyTypeST value) {
		this.policyType = value;
	}

	/**
	 * Gets the value of the issueDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getIssueDate() {
		return issueDate;
	}

	/**
	 * Sets the value of the issueDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setIssueDate(XMLGregorianCalendar value) {
		this.issueDate = value;
	}

	/**
	 * Gets the value of the startDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getStartDate() {
		return startDate;
	}

	/**
	 * Sets the value of the startDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setStartDate(XMLGregorianCalendar value) {
		this.startDate = value;
	}

	/**
	 * Gets the value of the endDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getEndDate() {
		return endDate;
	}

	/**
	 * Sets the value of the endDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setEndDate(XMLGregorianCalendar value) {
		this.endDate = value;
	}

	/**
	 * Gets the value of the lastUpdate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Sets the value of the lastUpdate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setLastUpdate(XMLGregorianCalendar value) {
		this.lastUpdate = value;
	}

}
