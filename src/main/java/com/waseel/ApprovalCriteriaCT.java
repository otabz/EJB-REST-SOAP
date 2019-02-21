package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ApprovalCriteriaCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalCriteriaCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberID" type="{http://www.waseel.com/wsdl/primary/wschema}memberIDST"/>
 *         &lt;element name="policyNumber" type="{http://www.waseel.com/wsdl/primary/wschema}policyNumberST"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalCriteriaCT", propOrder = { "memberID", "policyNumber",
		"startDate", "endDate" })
public class ApprovalCriteriaCT {

	@XmlElement(required = true)
	protected String memberID;
	@XmlElement(required = true)
	protected String policyNumber;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar startDate;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar endDate;

	/**
	 * Gets the value of the memberID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMemberID() {
		return memberID;
	}

	/**
	 * Sets the value of the memberID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMemberID(String value) {
		this.memberID = value;
	}

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

}
