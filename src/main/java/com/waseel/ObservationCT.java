package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ObservationCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ObservationCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="observationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observationDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observationValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observationComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationCT", propOrder = { "observationCode",
		"observationDescription", "observationValue", "observationUnit",
		"observationComment" })
public class ObservationCT {

	@XmlElement(required = true)
	protected String observationCode;
	@XmlElement(required = true)
	protected String observationDescription;
	protected String observationValue;
	protected String observationUnit;
	protected String observationComment;

	/**
	 * Gets the value of the observationCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObservationCode() {
		return observationCode;
	}

	/**
	 * Sets the value of the observationCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObservationCode(String value) {
		this.observationCode = value;
	}

	/**
	 * Gets the value of the observationDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObservationDescription() {
		return observationDescription;
	}

	/**
	 * Sets the value of the observationDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObservationDescription(String value) {
		this.observationDescription = value;
	}

	/**
	 * Gets the value of the observationValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObservationValue() {
		return observationValue;
	}

	/**
	 * Sets the value of the observationValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObservationValue(String value) {
		this.observationValue = value;
	}

	/**
	 * Gets the value of the observationUnit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObservationUnit() {
		return observationUnit;
	}

	/**
	 * Sets the value of the observationUnit property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObservationUnit(String value) {
		this.observationUnit = value;
	}

	/**
	 * Gets the value of the observationComment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObservationComment() {
		return observationComment;
	}

	/**
	 * Sets the value of the observationComment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObservationComment(String value) {
		this.observationComment = value;
	}

}
