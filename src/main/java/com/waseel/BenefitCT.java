package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for BenefitCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BenefitCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="benefitCode" type="{http://www.waseel.com/wsdl/primary/wschema}benefitCodeST"/>
 *         &lt;element name="benefitLimit" type="{http://www.waseel.com/wsdl/primary/wschema}amountST" minOccurs="0"/>
 *         &lt;element name="benefitDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patientShare" type="{http://www.waseel.com/wsdl/primary/wschema}amountST"/>
 *         &lt;element name="maxPatientShare" type="{http://www.waseel.com/wsdl/primary/wschema}amountST" minOccurs="0"/>
 *         &lt;element name="maxConsultFee" type="{http://www.waseel.com/wsdl/primary/wschema}amountST" minOccurs="0"/>
 *         &lt;element name="approvalThreshold" type="{http://www.waseel.com/wsdl/primary/wschema}amountST" minOccurs="0"/>
 *         &lt;element name="approvalLimit" type="{http://www.waseel.com/wsdl/primary/wschema}approvalLimitST"/>
 *         &lt;element name="CEC" type="{http://www.waseel.com/wsdl/primary/wschema}CECCT"/>
 *         &lt;element name="Case" type="{http://www.waseel.com/wsdl/primary/wschema}CaseCT" minOccurs="0"/>
 *         &lt;element name="SubCoverage" type="{http://www.waseel.com/wsdl/primary/wschema}SubCoverageCT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenefitCT", propOrder = { "benefitCode", "benefitLimit",
		"benefitDescription", "patientShare", "maxPatientShare",
		"maxConsultFee", "approvalThreshold", "approvalLimit", "cec", "_case",
		"subCoverage" })
public class BenefitCT {

	@XmlElement(required = true)
	protected BenefitCodeST benefitCode;
	protected AmountST benefitLimit;
	protected String benefitDescription;
	@XmlElement(required = true)
	protected AmountST patientShare;
	protected AmountST maxPatientShare;
	protected AmountST maxConsultFee;
	protected AmountST approvalThreshold;
	protected boolean approvalLimit;
	@XmlElement(name = "CEC", required = true)
	protected CECCT cec;
	@XmlElement(name = "Case")
	protected CaseCT _case;
	@XmlElement(name = "SubCoverage")
	protected SubCoverageCT subCoverage;

	/**
	 * Gets the value of the benefitCode property.
	 * 
	 * @return possible object is {@link BenefitCodeST }
	 * 
	 */
	public BenefitCodeST getBenefitCode() {
		return benefitCode;
	}

	/**
	 * Sets the value of the benefitCode property.
	 * 
	 * @param value
	 *            allowed object is {@link BenefitCodeST }
	 * 
	 */
	public void setBenefitCode(BenefitCodeST value) {
		this.benefitCode = value;
	}

	/**
	 * Gets the value of the benefitLimit property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getBenefitLimit() {
		return benefitLimit;
	}

	/**
	 * Sets the value of the benefitLimit property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setBenefitLimit(AmountST value) {
		this.benefitLimit = value;
	}

	/**
	 * Gets the value of the benefitDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBenefitDescription() {
		return benefitDescription;
	}

	/**
	 * Sets the value of the benefitDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBenefitDescription(String value) {
		this.benefitDescription = value;
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

	/**
	 * Gets the value of the approvalLimit property.
	 * 
	 */
	public boolean isApprovalLimit() {
		return approvalLimit;
	}

	/**
	 * Sets the value of the approvalLimit property.
	 * 
	 */
	public void setApprovalLimit(boolean value) {
		this.approvalLimit = value;
	}

	/**
	 * Gets the value of the cec property.
	 * 
	 * @return possible object is {@link CECCT }
	 * 
	 */
	public CECCT getCEC() {
		return cec;
	}

	/**
	 * Sets the value of the cec property.
	 * 
	 * @param value
	 *            allowed object is {@link CECCT }
	 * 
	 */
	public void setCEC(CECCT value) {
		this.cec = value;
	}

	/**
	 * Gets the value of the case property.
	 * 
	 * @return possible object is {@link CaseCT }
	 * 
	 */
	public CaseCT getCase() {
		return _case;
	}

	/**
	 * Sets the value of the case property.
	 * 
	 * @param value
	 *            allowed object is {@link CaseCT }
	 * 
	 */
	public void setCase(CaseCT value) {
		this._case = value;
	}

	/**
	 * Gets the value of the subCoverage property.
	 * 
	 * @return possible object is {@link SubCoverageCT }
	 * 
	 */
	public SubCoverageCT getSubCoverage() {
		return subCoverage;
	}

	/**
	 * Sets the value of the subCoverage property.
	 * 
	 * @param value
	 *            allowed object is {@link SubCoverageCT }
	 * 
	 */
	public void setSubCoverage(SubCoverageCT value) {
		this.subCoverage = value;
	}

}
