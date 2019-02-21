package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DiagnosisCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosisCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diagnosisNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="diagnosisCode" type="{http://www.waseel.com/wsdl/primary/wschema}diangosisCodeST"/>
 *         &lt;element name="diagnosisType" type="{http://www.waseel.com/wsdl/primary/wschema}diagnosisTypeST"/>
 *         &lt;element name="diagnosisDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosisCT", propOrder = { "diagnosisNumber",
		"diagnosisCode", "diagnosisType", "diagnosisDescription" })
public class DiagnosisCT {

	protected Long diagnosisNumber;
	@XmlElement(required = true)
	protected String diagnosisCode;
	@XmlElement(required = true)
	protected DiagnosisTypeST diagnosisType;
	protected String diagnosisDescription;

	/**
	 * Gets the value of the diagnosisNumber property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getDiagnosisNumber() {
		return diagnosisNumber;
	}

	/**
	 * Sets the value of the diagnosisNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setDiagnosisNumber(Long value) {
		this.diagnosisNumber = value;
	}

	/**
	 * Gets the value of the diagnosisCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDiagnosisCode() {
		return diagnosisCode;
	}

	/**
	 * Sets the value of the diagnosisCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDiagnosisCode(String value) {
		this.diagnosisCode = value;
	}

	/**
	 * Gets the value of the diagnosisType property.
	 * 
	 * @return possible object is {@link DiagnosisTypeST }
	 * 
	 */
	public DiagnosisTypeST getDiagnosisType() {
		return diagnosisType;
	}

	/**
	 * Sets the value of the diagnosisType property.
	 * 
	 * @param value
	 *            allowed object is {@link DiagnosisTypeST }
	 * 
	 */
	public void setDiagnosisType(DiagnosisTypeST value) {
		this.diagnosisType = value;
	}

	/**
	 * Gets the value of the diagnosisDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDiagnosisDescription() {
		return diagnosisDescription;
	}

	/**
	 * Sets the value of the diagnosisDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDiagnosisDescription(String value) {
		this.diagnosisDescription = value;
	}

}
