package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MemberCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MemberCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberID" type="{http://www.waseel.com/wsdl/primary/wschema}memberIDST"/>
 *         &lt;element name="policyNumber" type="{http://www.waseel.com/wsdl/primary/wschema}policyNumberST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberCT", propOrder = { "memberID", "policyNumber" })
public class MemberCT {

	@XmlElement(required = true)
	protected String memberID;
	@XmlElement(required = true)
	protected String policyNumber;

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

}
