package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for EligibilitySubmissionRequestCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EligibilitySubmissionRequestCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Member" type="{http://www.waseel.com/wsdl/primary/wschema}MemberCT"/>
 *         &lt;element name="VisitInformation" type="{http://www.waseel.com/wsdl/primary/wschema}visitInfoCT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligibilitySubmissionRequestCT", propOrder = { "member",
		"visitInformation" })
public class EligibilitySubmissionRequestCT {

	@XmlElement(name = "Member", required = true)
	protected MemberCT member;
	@XmlElement(name = "VisitInformation", required = true)
	protected VisitInfoCT visitInformation;

	/**
	 * Gets the value of the member property.
	 * 
	 * @return possible object is {@link MemberCT }
	 * 
	 */
	public MemberCT getMember() {
		return member;
	}

	/**
	 * Sets the value of the member property.
	 * 
	 * @param value
	 *            allowed object is {@link MemberCT }
	 * 
	 */
	public void setMember(MemberCT value) {
		this.member = value;
	}

	/**
	 * Gets the value of the visitInformation property.
	 * 
	 * @return possible object is {@link VisitInfoCT }
	 * 
	 */
	public VisitInfoCT getVisitInformation() {
		return visitInformation;
	}

	/**
	 * Sets the value of the visitInformation property.
	 * 
	 * @param value
	 *            allowed object is {@link VisitInfoCT }
	 * 
	 */
	public void setVisitInformation(VisitInfoCT value) {
		this.visitInformation = value;
	}

}
