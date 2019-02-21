package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PolicyInquiryRequestCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyInquiryRequestCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Criteria" type="{http://www.waseel.com/wsdl/primary/wschema}PolicyInquiryCriteriaCT"/>
 *         &lt;element name="policyNumber" type="{http://www.waseel.com/wsdl/primary/wschema}policyNumberST"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyInquiryRequestCT", propOrder = { "criteria",
		"policyNumber" })
public class PolicyInquiryRequestCT {

	@XmlElement(name = "Criteria")
	protected PolicyInquiryCriteriaCT criteria;
	protected String policyNumber;

	/**
	 * Gets the value of the criteria property.
	 * 
	 * @return possible object is {@link PolicyInquiryCriteriaCT }
	 * 
	 */
	public PolicyInquiryCriteriaCT getCriteria() {
		return criteria;
	}

	/**
	 * Sets the value of the criteria property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicyInquiryCriteriaCT }
	 * 
	 */
	public void setCriteria(PolicyInquiryCriteriaCT value) {
		this.criteria = value;
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
