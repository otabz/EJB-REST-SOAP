package com.waseel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ClaimSubmissionRequestCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimSubmissionRequestCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimIdentities" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimIdentifierCT"/>
 *         &lt;element name="Member" type="{http://www.waseel.com/wsdl/primary/wschema}MemberCT"/>
 *         &lt;element name="VisitInformation" type="{http://www.waseel.com/wsdl/primary/wschema}visitInfoCT"/>
 *         &lt;element name="CaseInformation" type="{http://www.waseel.com/wsdl/primary/wschema}CaseInfoCT"/>
 *         &lt;element name="ClaimGDPN" type="{http://www.waseel.com/wsdl/primary/wschema}GDPNCT"/>
 *         &lt;element name="Invoice" type="{http://www.waseel.com/wsdl/primary/wschema}InvoiceCT" maxOccurs="unbounded"/>
 *         &lt;element name="Comment" type="{http://www.waseel.com/wsdl/primary/wschema}CommentCT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Admission" type="{http://www.waseel.com/wsdl/primary/wschema}AdmissionCT" minOccurs="0"/>
 *         &lt;element name="Attachment" type="{http://www.waseel.com/wsdl/primary/wschema}AttachmentRequestCT" maxOccurs="7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimSubmissionRequestCT", propOrder = { "claimIdentities",
		"member", "visitInformation", "caseInformation", "claimGDPN",
		"invoice", "comment", "admission", "attachment" })
public class ClaimSubmissionRequestCT {

	@XmlElement(name = "ClaimIdentities", required = true)
	protected ClaimIdentifierCT claimIdentities;
	@XmlElement(name = "Member", required = true)
	protected MemberCT member;
	@XmlElement(name = "VisitInformation", required = true)
	protected VisitInfoCT visitInformation;
	@XmlElement(name = "CaseInformation", required = true)
	protected CaseInfoCT caseInformation;
	@XmlElement(name = "ClaimGDPN", required = true)
	protected GDPNCT claimGDPN;
	@XmlElement(name = "Invoice", required = true)
	protected List<InvoiceCT> invoice;
	@XmlElement(name = "Comment")
	protected List<CommentCT> comment;
	@XmlElement(name = "Admission")
	protected AdmissionCT admission;
	@XmlElement(name = "Attachment")
	protected List<AttachmentRequestCT> attachment;

	/**
	 * Gets the value of the claimIdentities property.
	 * 
	 * @return possible object is {@link ClaimIdentifierCT }
	 * 
	 */
	public ClaimIdentifierCT getClaimIdentities() {
		return claimIdentities;
	}

	/**
	 * Sets the value of the claimIdentities property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimIdentifierCT }
	 * 
	 */
	public void setClaimIdentities(ClaimIdentifierCT value) {
		this.claimIdentities = value;
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

	/**
	 * Gets the value of the caseInformation property.
	 * 
	 * @return possible object is {@link CaseInfoCT }
	 * 
	 */
	public CaseInfoCT getCaseInformation() {
		return caseInformation;
	}

	/**
	 * Sets the value of the caseInformation property.
	 * 
	 * @param value
	 *            allowed object is {@link CaseInfoCT }
	 * 
	 */
	public void setCaseInformation(CaseInfoCT value) {
		this.caseInformation = value;
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
	 * Gets the value of the invoice property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the invoice property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getInvoice().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link InvoiceCT }
	 * 
	 * 
	 */
	public List<InvoiceCT> getInvoice() {
		if (invoice == null) {
			invoice = new ArrayList<InvoiceCT>();
		}
		return this.invoice;
	}

	/**
	 * Gets the value of the comment property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the comment property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getComment().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CommentCT }
	 * 
	 * 
	 */
	public List<CommentCT> getComment() {
		if (comment == null) {
			comment = new ArrayList<CommentCT>();
		}
		return this.comment;
	}

	/**
	 * Gets the value of the admission property.
	 * 
	 * @return possible object is {@link AdmissionCT }
	 * 
	 */
	public AdmissionCT getAdmission() {
		return admission;
	}

	/**
	 * Sets the value of the admission property.
	 * 
	 * @param value
	 *            allowed object is {@link AdmissionCT }
	 * 
	 */
	public void setAdmission(AdmissionCT value) {
		this.admission = value;
	}

	/**
	 * Gets the value of the attachment property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the attachment property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAttachment().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AttachmentRequestCT }
	 * 
	 * 
	 */
	public List<AttachmentRequestCT> getAttachment() {
		if (attachment == null) {
			attachment = new ArrayList<AttachmentRequestCT>();
		}
		return this.attachment;
	}

}
