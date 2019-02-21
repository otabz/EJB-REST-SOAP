package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CECCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CECCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Exclusions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CECCT", propOrder = {

})
public class CECCT {

	@XmlElement(name = "Exclusions")
	protected String exclusions;
	@XmlElement(name = "Coverage")
	protected String coverage;
	@XmlElement(name = "Comments")
	protected String comments;

	/**
	 * Gets the value of the exclusions property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExclusions() {
		return exclusions;
	}

	/**
	 * Sets the value of the exclusions property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExclusions(String value) {
		this.exclusions = value;
	}

	/**
	 * Gets the value of the coverage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoverage() {
		return coverage;
	}

	/**
	 * Sets the value of the coverage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCoverage(String value) {
		this.coverage = value;
	}

	/**
	 * Gets the value of the comments property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * Sets the value of the comments property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setComments(String value) {
		this.comments = value;
	}

}
