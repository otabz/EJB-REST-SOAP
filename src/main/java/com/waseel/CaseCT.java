package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CaseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CaseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseQualifier" type="{http://www.waseel.com/wsdl/primary/wschema}caseQualifierST"/>
 *         &lt;element name="patientShare" type="{http://www.waseel.com/wsdl/primary/wschema}amountST"/>
 *         &lt;element name="maxPatientShare" type="{http://www.waseel.com/wsdl/primary/wschema}amountST" minOccurs="0"/>
 *         &lt;element name="maxConsultFee" type="{http://www.waseel.com/wsdl/primary/wschema}amountST" minOccurs="0"/>
 *         &lt;element name="approvalThreshold" type="{http://www.waseel.com/wsdl/primary/wschema}amountST" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseCT", propOrder = { "caseQualifier", "patientShare",
		"maxPatientShare", "maxConsultFee", "approvalThreshold" })
public class CaseCT {

	@XmlElement(name = "CaseQualifier", required = true)
	protected CaseQualifierST caseQualifier;
	@XmlElement(required = true)
	protected AmountST patientShare;
	protected AmountST maxPatientShare;
	protected AmountST maxConsultFee;
	protected AmountST approvalThreshold;

	/**
	 * Gets the value of the caseQualifier property.
	 * 
	 * @return possible object is {@link CaseQualifierST }
	 * 
	 */
	public CaseQualifierST getCaseQualifier() {
		return caseQualifier;
	}

	/**
	 * Sets the value of the caseQualifier property.
	 * 
	 * @param value
	 *            allowed object is {@link CaseQualifierST }
	 * 
	 */
	public void setCaseQualifier(CaseQualifierST value) {
		this.caseQualifier = value;
	}

	/**
	 * Gets the value of the patientShare property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getPatientShare() {
		return patientShare;
	}

	/**
	 * Sets the value of the patientShare property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setPatientShare(AmountST value) {
		this.patientShare = value;
	}

	/**
	 * Gets the value of the maxPatientShare property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getMaxPatientShare() {
		return maxPatientShare;
	}

	/**
	 * Sets the value of the maxPatientShare property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setMaxPatientShare(AmountST value) {
		this.maxPatientShare = value;
	}

	/**
	 * Gets the value of the maxConsultFee property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getMaxConsultFee() {
		return maxConsultFee;
	}

	/**
	 * Sets the value of the maxConsultFee property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setMaxConsultFee(AmountST value) {
		this.maxConsultFee = value;
	}

	/**
	 * Gets the value of the approvalThreshold property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getApprovalThreshold() {
		return approvalThreshold;
	}

	/**
	 * Sets the value of the approvalThreshold property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setApprovalThreshold(AmountST value) {
		this.approvalThreshold = value;
	}

}
