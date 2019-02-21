package com.waseel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ApprovalSubmissionRequestCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalSubmissionRequestCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Member" type="{http://www.waseel.com/wsdl/primary/wschema}MemberCT" minOccurs="0"/>
 *         &lt;element name="VisitInformation" type="{http://www.waseel.com/wsdl/primary/wschema}visitInfoCT" minOccurs="0"/>
 *         &lt;element name="CaseInformation" type="{http://www.waseel.com/wsdl/primary/wschema}CaseInfoCT" minOccurs="0"/>
 *         &lt;element name="estimatedCost" type="{http://www.waseel.com/wsdl/primary/wschema}amountST" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://www.waseel.com/wsdl/primary/wschema}ServiceCT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.waseel.com/wsdl/primary/wschema}CommentCT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Admission" type="{http://www.waseel.com/wsdl/primary/wschema}AdmissionCT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalSubmissionRequestCT", propOrder = { "approvalNumber",
		"member", "visitInformation", "caseInformation", "estimatedCost",
		"service", "comment", "admission" })
public class ApprovalSubmissionRequestCT {

	protected String approvalNumber;
	@XmlElement(name = "Member")
	protected MemberCT member;
	@XmlElement(name = "VisitInformation")
	protected VisitInfoCT visitInformation;
	@XmlElement(name = "CaseInformation")
	protected CaseInfoCT caseInformation;
	protected AmountST estimatedCost;
	@XmlElement(name = "Service")
	protected List<ServiceCT> service;
	@XmlElement(name = "Comment")
	protected List<CommentCT> comment;
	@XmlElement(name = "Admission")
	protected AdmissionCT admission;

	/**
	 * Gets the value of the approvalNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApprovalNumber() {
		return approvalNumber;
	}

	/**
	 * Sets the value of the approvalNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setApprovalNumber(String value) {
		this.approvalNumber = value;
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
	 * Gets the value of the estimatedCost property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getEstimatedCost() {
		return estimatedCost;
	}

	/**
	 * Sets the value of the estimatedCost property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setEstimatedCost(AmountST value) {
		this.estimatedCost = value;
	}

	/**
	 * Gets the value of the service property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the service property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getService().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ServiceCT }
	 * 
	 * 
	 */
	public List<ServiceCT> getService() {
		if (service == null) {
			service = new ArrayList<ServiceCT>();
		}
		return this.service;
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

}
