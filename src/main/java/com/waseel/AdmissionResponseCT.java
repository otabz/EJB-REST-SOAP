package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AdmissionResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AdmissionResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Admission" type="{http://www.waseel.com/wsdl/primary/wschema}AdmissionCT"/>
 *         &lt;element name="AdmissionDecision" type="{http://www.waseel.com/wsdl/primary/wschema}AdmissionDecisionCT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdmissionResponseCT", propOrder = { "admission",
		"admissionDecision" })
public class AdmissionResponseCT {

	@XmlElement(name = "Admission", required = true)
	protected AdmissionCT admission;
	@XmlElement(name = "AdmissionDecision", required = true)
	protected AdmissionDecisionCT admissionDecision;

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
	 * Gets the value of the admissionDecision property.
	 * 
	 * @return possible object is {@link AdmissionDecisionCT }
	 * 
	 */
	public AdmissionDecisionCT getAdmissionDecision() {
		return admissionDecision;
	}

	/**
	 * Sets the value of the admissionDecision property.
	 * 
	 * @param value
	 *            allowed object is {@link AdmissionDecisionCT }
	 * 
	 */
	public void setAdmissionDecision(AdmissionDecisionCT value) {
		this.admissionDecision = value;
	}

}
