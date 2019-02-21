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
 * Java class for ApprovalResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberInfo" type="{http://www.waseel.com/wsdl/primary/wschema}MemberInfoCT" minOccurs="0"/>
 *         &lt;element name="CoverageInfo" type="{http://www.waseel.com/wsdl/primary/wschema}CoverageInfoCT" minOccurs="0"/>
 *         &lt;element name="VisitInformation" type="{http://www.waseel.com/wsdl/primary/wschema}visitInfoCT" minOccurs="0"/>
 *         &lt;element name="CaseInformation" type="{http://www.waseel.com/wsdl/primary/wschema}CaseInfoCT" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.waseel.com/wsdl/primary/wschema}StatusCT"/>
 *         &lt;element name="ValidityEffect" type="{http://www.waseel.com/wsdl/primary/wschema}ValidityEffectCT" minOccurs="0"/>
 *         &lt;element name="Editing" type="{http://www.waseel.com/wsdl/primary/wschema}EditingCT" minOccurs="0"/>
 *         &lt;element name="AdmissionResponse" type="{http://www.waseel.com/wsdl/primary/wschema}AdmissionResponseCT" minOccurs="0"/>
 *         &lt;element name="ServiceResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ServiceResponseCT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.waseel.com/wsdl/primary/wschema}CommentCT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estimatedCost" type="{http://www.waseel.com/wsdl/primary/wschema}amountST" minOccurs="0"/>
 *         &lt;element name="approvedCost" type="{http://www.waseel.com/wsdl/primary/wschema}amountST" minOccurs="0"/>
 *         &lt;element name="submissionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "ApprovalResponseCT", propOrder = { "memberInfo",
		"coverageInfo", "visitInformation", "caseInformation", "status",
		"validityEffect", "editing", "admissionResponse", "serviceResponse",
		"comment", "estimatedCost", "approvedCost", "submissionDate",
		"additionalInfo" })
public class ApprovalResponseCT {

	@XmlElement(name = "MemberInfo")
	protected MemberInfoCT memberInfo;
	@XmlElement(name = "CoverageInfo")
	protected CoverageInfoCT coverageInfo;
	@XmlElement(name = "VisitInformation")
	protected VisitInfoCT visitInformation;
	@XmlElement(name = "CaseInformation")
	protected CaseInfoCT caseInformation;
	@XmlElement(name = "Status", required = true)
	protected StatusCT status;
	@XmlElement(name = "ValidityEffect")
	protected ValidityEffectCT validityEffect;
	@XmlElement(name = "Editing")
	protected EditingCT editing;
	@XmlElement(name = "AdmissionResponse")
	protected AdmissionResponseCT admissionResponse;
	@XmlElement(name = "ServiceResponse")
	protected List<ServiceResponseCT> serviceResponse;
	@XmlElement(name = "Comment")
	protected List<CommentCT> comment;
	protected AmountST estimatedCost;
	protected AmountST approvedCost;
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar submissionDate;
	protected String additionalInfo;

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
	 * Gets the value of the coverageInfo property.
	 * 
	 * @return possible object is {@link CoverageInfoCT }
	 * 
	 */
	public CoverageInfoCT getCoverageInfo() {
		return coverageInfo;
	}

	/**
	 * Sets the value of the coverageInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link CoverageInfoCT }
	 * 
	 */
	public void setCoverageInfo(CoverageInfoCT value) {
		this.coverageInfo = value;
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
	 * Gets the value of the validityEffect property.
	 * 
	 * @return possible object is {@link ValidityEffectCT }
	 * 
	 */
	public ValidityEffectCT getValidityEffect() {
		return validityEffect;
	}

	/**
	 * Sets the value of the validityEffect property.
	 * 
	 * @param value
	 *            allowed object is {@link ValidityEffectCT }
	 * 
	 */
	public void setValidityEffect(ValidityEffectCT value) {
		this.validityEffect = value;
	}

	/**
	 * Gets the value of the editing property.
	 * 
	 * @return possible object is {@link EditingCT }
	 * 
	 */
	public EditingCT getEditing() {
		return editing;
	}

	/**
	 * Sets the value of the editing property.
	 * 
	 * @param value
	 *            allowed object is {@link EditingCT }
	 * 
	 */
	public void setEditing(EditingCT value) {
		this.editing = value;
	}

	/**
	 * Gets the value of the admissionResponse property.
	 * 
	 * @return possible object is {@link AdmissionResponseCT }
	 * 
	 */
	public AdmissionResponseCT getAdmissionResponse() {
		return admissionResponse;
	}

	/**
	 * Sets the value of the admissionResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link AdmissionResponseCT }
	 * 
	 */
	public void setAdmissionResponse(AdmissionResponseCT value) {
		this.admissionResponse = value;
	}

	/**
	 * Gets the value of the serviceResponse property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the serviceResponse property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getServiceResponse().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ServiceResponseCT }
	 * 
	 * 
	 */
	public List<ServiceResponseCT> getServiceResponse() {
		if (serviceResponse == null) {
			serviceResponse = new ArrayList<ServiceResponseCT>();
		}
		return this.serviceResponse;
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
	 * Gets the value of the approvedCost property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getApprovedCost() {
		return approvedCost;
	}

	/**
	 * Sets the value of the approvedCost property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setApprovedCost(AmountST value) {
		this.approvedCost = value;
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
