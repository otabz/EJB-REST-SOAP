package com.waseel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ClaimResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimIdentifier" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimIdentifierCT" minOccurs="0"/>
 *         &lt;element name="MemberInfo" type="{http://www.waseel.com/wsdl/primary/wschema}MemberInfoCT" minOccurs="0"/>
 *         &lt;element name="submissionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.waseel.com/wsdl/primary/wschema}StatusCT"/>
 *         &lt;element name="ClaimGDPN" type="{http://www.waseel.com/wsdl/primary/wschema}GDPNCT" minOccurs="0"/>
 *         &lt;element name="ClaimDecisionGDPN" type="{http://www.waseel.com/wsdl/primary/wschema}GDPNCT" minOccurs="0"/>
 *         &lt;element name="ClaimPayment" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimPaymentCT" minOccurs="0"/>
 *         &lt;element name="InvoiceResponse" type="{http://www.waseel.com/wsdl/primary/wschema}InvoiceResponseCT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.waseel.com/wsdl/primary/wschema}CommentCT" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ClaimResponseCT", propOrder = { "claimIdentifier",
		"memberInfo", "submissionDate", "status", "claimGDPN",
		"claimDecisionGDPN", "claimPayment", "invoiceResponse", "comments",
		"additionalInfo" })
public class ClaimResponseCT {

	@XmlElement(name = "ClaimIdentifier")
	protected ClaimIdentifierCT claimIdentifier;
	@XmlElement(name = "MemberInfo")
	protected MemberInfoCT memberInfo;
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar submissionDate;
	@XmlElement(name = "Status", required = true)
	protected StatusCT status;
	@XmlElement(name = "ClaimGDPN")
	protected GDPNCT claimGDPN;
	@XmlElement(name = "ClaimDecisionGDPN")
	protected GDPNCT claimDecisionGDPN;
	@XmlElement(name = "ClaimPayment")
	protected ClaimPaymentCT claimPayment;
	@XmlElement(name = "InvoiceResponse")
	protected List<InvoiceResponseCT> invoiceResponse;
	@XmlElement(name = "Comments")
	protected List<CommentCT> comments;
	protected String additionalInfo;

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
	 * Gets the value of the memberInfo property.
	 * 
	 * @return possible object is {@link MemberInfoCT }
	 * 
	 */
	public MemberInfoCT getMemberInfo() {
		return memberInfo;
	}

	/**
	 * Sets the value of the memberInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link MemberInfoCT }
	 * 
	 */
	public void setMemberInfo(MemberInfoCT value) {
		this.memberInfo = value;
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

	/**
	 * Gets the value of the invoiceResponse property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the invoiceResponse property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getInvoiceResponse().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link InvoiceResponseCT }
	 * 
	 * 
	 */
	public List<InvoiceResponseCT> getInvoiceResponse() {
		if (invoiceResponse == null) {
			invoiceResponse = new ArrayList<InvoiceResponseCT>();
		}
		return this.invoiceResponse;
	}

	/**
	 * Gets the value of the comments property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the comments property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getComments().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CommentCT }
	 * 
	 * 
	 */
	public List<CommentCT> getComments() {
		if (comments == null) {
			comments = new ArrayList<CommentCT>();
		}
		return this.comments;
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

}
