package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ClaimLineCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimLineCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimIdentifier" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimIdentifierCT"/>
 *         &lt;element name="Member" type="{http://www.waseel.com/wsdl/primary/wschema}MemberCT"/>
 *         &lt;element name="submissionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.waseel.com/wsdl/primary/wschema}StatusCT"/>
 *         &lt;element name="ClaimGDPN" type="{http://www.waseel.com/wsdl/primary/wschema}GDPNCT"/>
 *         &lt;element name="ClaimDecisionGDPN" type="{http://www.waseel.com/wsdl/primary/wschema}GDPNCT" minOccurs="0"/>
 *         &lt;element name="ClaimPayment" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimPaymentCT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimLineCT", propOrder = { "claimIdentifier", "member",
		"submissionDate", "status", "claimGDPN", "claimDecisionGDPN",
		"claimPayment" })
public class ClaimLineCT {

	@XmlElement(name = "ClaimIdentifier", required = true)
	protected ClaimIdentifierCT claimIdentifier;
	@XmlElement(name = "Member", required = true)
	protected MemberCT member;
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar submissionDate;
	@XmlElement(name = "Status", required = true)
	protected StatusCT status;
	@XmlElement(name = "ClaimGDPN", required = true)
	protected GDPNCT claimGDPN;
	@XmlElement(name = "ClaimDecisionGDPN")
	protected GDPNCT claimDecisionGDPN;
	@XmlElement(name = "ClaimPayment")
	protected ClaimPaymentCT claimPayment;

	/**
	 * Gets the value of the claimIdentifier property.
	 * 
	 * @return possible object is {@link ClaimIdentifierCT }
	 * 
	 */
	public ClaimIdentifierCT getClaimIdentifier() {
		return claimIdentifier;
	}

	/**
	 * Sets the value of the claimIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimIdentifierCT }
	 * 
	 */
	public void setClaimIdentifier(ClaimIdentifierCT value) {
		this.claimIdentifier = value;
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
	 * Gets the value of the submissionDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getSubmissionDate() {
		return submissionDate;
	}

	/**
	 * Sets the value of the submissionDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setSubmissionDate(XMLGregorianCalendar value) {
		this.submissionDate = value;
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
	 * Gets the value of the claimGDPN property.
	 * 
	 * @return possible object is {@link GDPNCT }
	 * 
	 */
	public GDPNCT getClaimGDPN() {
		return claimGDPN;
	}

	/**
	 * Sets the value of the claimGDPN property.
	 * 
	 * @param value
	 *            allowed object is {@link GDPNCT }
	 * 
	 */
	public void setClaimGDPN(GDPNCT value) {
		this.claimGDPN = value;
	}

	/**
	 * Gets the value of the claimDecisionGDPN property.
	 * 
	 * @return possible object is {@link GDPNCT }
	 * 
	 */
	public GDPNCT getClaimDecisionGDPN() {
		return claimDecisionGDPN;
	}

	/**
	 * Sets the value of the claimDecisionGDPN property.
	 * 
	 * @param value
	 *            allowed object is {@link GDPNCT }
	 * 
	 */
	public void setClaimDecisionGDPN(GDPNCT value) {
		this.claimDecisionGDPN = value;
	}

	/**
	 * Gets the value of the claimPayment property.
	 * 
	 * @return possible object is {@link ClaimPaymentCT }
	 * 
	 */
	public ClaimPaymentCT getClaimPayment() {
		return claimPayment;
	}

	/**
	 * Sets the value of the claimPayment property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimPaymentCT }
	 * 
	 */
	public void setClaimPayment(ClaimPaymentCT value) {
		this.claimPayment = value;
	}

}
