package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for MemberInfoCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MemberInfoCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberID" type="{http://www.waseel.com/wsdl/primary/wschema}memberIDST"/>
 *         &lt;element name="policyNumber" type="{http://www.waseel.com/wsdl/primary/wschema}policyNumberST"/>
 *         &lt;element name="policyType" type="{http://www.waseel.com/wsdl/primary/wschema}policyTypeST"/>
 *         &lt;element name="policyHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memberType" type="{http://www.waseel.com/wsdl/primary/wschema}memberTypeST"/>
 *         &lt;element name="memberClass" type="{http://www.waseel.com/wsdl/primary/wschema}memberClassST"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Gender" type="{http://www.waseel.com/wsdl/primary/wschema}genderST"/>
 *         &lt;element name="maritalStatus" type="{http://www.waseel.com/wsdl/primary/wschema}maritalStatusST"/>
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
@XmlType(name = "MemberInfoCT", propOrder = { "memberID", "policyNumber",
		"policyType", "policyHolderName", "memberType", "memberClass",
		"fullName", "dob", "gender", "maritalStatus", "startDate", "endDate" })
public class MemberInfoCT {

	@XmlElement(required = true)
	protected String memberID;
	@XmlElement(required = true)
	protected String policyNumber;
	@XmlElement(required = true)
	protected PolicyTypeST policyType;
	@XmlElement(required = true)
	protected String policyHolderName;
	@XmlElement(required = true)
	protected MemberTypeST memberType;
	@XmlElement(required = true)
	protected String memberClass;
	@XmlElement(required = true)
	protected String fullName;
	@XmlElement(name = "DOB", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar dob;
	@XmlElement(name = "Gender", required = true)
	protected GenderST gender;
	@XmlElement(required = true)
	protected MaritalStatusST maritalStatus;
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
	 * Gets the value of the memberType property.
	 * 
	 * @return possible object is {@link MemberTypeST }
	 * 
	 */
	public MemberTypeST getMemberType() {
		return memberType;
	}

	/**
	 * Sets the value of the memberType property.
	 * 
	 * @param value
	 *            allowed object is {@link MemberTypeST }
	 * 
	 */
	public void setMemberType(MemberTypeST value) {
		this.memberType = value;
	}

	/**
	 * Gets the value of the memberClass property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMemberClass() {
		return memberClass;
	}

	/**
	 * Sets the value of the memberClass property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMemberClass(String value) {
		this.memberClass = value;
	}

	/**
	 * Gets the value of the fullName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * Sets the value of the fullName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFullName(String value) {
		this.fullName = value;
	}

	/**
	 * Gets the value of the dob property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDOB() {
		return dob;
	}

	/**
	 * Sets the value of the dob property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDOB(XMLGregorianCalendar value) {
		this.dob = value;
	}

	/**
	 * Gets the value of the gender property.
	 * 
	 * @return possible object is {@link GenderST }
	 * 
	 */
	public GenderST getGender() {
		return gender;
	}

	/**
	 * Sets the value of the gender property.
	 * 
	 * @param value
	 *            allowed object is {@link GenderST }
	 * 
	 */
	public void setGender(GenderST value) {
		this.gender = value;
	}

	/**
	 * Gets the value of the maritalStatus property.
	 * 
	 * @return possible object is {@link MaritalStatusST }
	 * 
	 */
	public MaritalStatusST getMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * Sets the value of the maritalStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link MaritalStatusST }
	 * 
	 */
	public void setMaritalStatus(MaritalStatusST value) {
		this.maritalStatus = value;
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
