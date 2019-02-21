package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ApprovalNotificationRequestCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalNotificationRequestCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Member" type="{http://www.waseel.com/wsdl/primary/wschema}MemberCT"/>
 *         &lt;element name="approval" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalLineCT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalNotificationRequestCT", propOrder = {
		"notificationMessage", "member", "approval" })
public class ApprovalNotificationRequestCT {

	@XmlElement(required = true)
	protected String notificationMessage;
	@XmlElement(name = "Member", required = true)
	protected MemberCT member;
	@XmlElement(required = true)
	protected ApprovalLineCT approval;

	/**
	 * Gets the value of the notificationMessage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNotificationMessage() {
		return notificationMessage;
	}

	/**
	 * Sets the value of the notificationMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNotificationMessage(String value) {
		this.notificationMessage = value;
	}

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
	 * Gets the value of the approval property.
	 * 
	 * @return possible object is {@link ApprovalLineCT }
	 * 
	 */
	public ApprovalLineCT getApproval() {
		return approval;
	}

	/**
	 * Sets the value of the approval property.
	 * 
	 * @param value
	 *            allowed object is {@link ApprovalLineCT }
	 * 
	 */
	public void setApproval(ApprovalLineCT value) {
		this.approval = value;
	}

}
