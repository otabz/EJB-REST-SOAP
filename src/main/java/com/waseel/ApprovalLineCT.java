package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ApprovalLineCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalLineCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.waseel.com/wsdl/primary/wschema}caseTypeST"/>
 *         &lt;element name="statusCode" type="{http://www.waseel.com/wsdl/primary/wschema}statusCodeST"/>
 *         &lt;element name="approvalNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientFileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submissionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="approvalVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalLineCT", propOrder = { "type", "statusCode",
		"approvalNumber", "patientFileNumber", "submissionDate",
		"approvalVersion" })
public class ApprovalLineCT {

	@XmlElement(required = true)
	protected CaseTypeST type;
	@XmlElement(required = true)
	protected StatusCodeST statusCode;
	@XmlElement(required = true)
	protected String approvalNumber;
	protected String patientFileNumber;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar submissionDate;
	protected String approvalVersion;

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link CaseTypeST }
	 * 
	 */
	public CaseTypeST getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link CaseTypeST }
	 * 
	 */
	public void setType(CaseTypeST value) {
		this.type = value;
	}

	/**
	 * Gets the value of the statusCode property.
	 * 
	 * @return possible object is {@link StatusCodeST }
	 * 
	 */
	public StatusCodeST getStatusCode() {
		return statusCode;
	}

	/**
	 * Sets the value of the statusCode property.
	 * 
	 * @param value
	 *            allowed object is {@link StatusCodeST }
	 * 
	 */
	public void setStatusCode(StatusCodeST value) {
		this.statusCode = value;
	}

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
	 * Gets the value of the patientFileNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPatientFileNumber() {
		return patientFileNumber;
	}

	/**
	 * Sets the value of the patientFileNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPatientFileNumber(String value) {
		this.patientFileNumber = value;
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
	 * Gets the value of the approvalVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApprovalVersion() {
		return approvalVersion;
	}

	/**
	 * Sets the value of the approvalVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setApprovalVersion(String value) {
		this.approvalVersion = value;
	}

}
