package com.waseel;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MEOBRequestCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MEOBRequestCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubmittedClaimsCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEOBRequestCT", propOrder = { "batchID",
		"submittedClaimsCount" })
public class MEOBRequestCT {

	@XmlElement(required = true)
	protected String batchID;
	@XmlElement(name = "SubmittedClaimsCount", required = true)
	protected BigInteger submittedClaimsCount;

	/**
	 * Gets the value of the batchID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBatchID() {
		return batchID;
	}

	/**
	 * Sets the value of the batchID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBatchID(String value) {
		this.batchID = value;
	}

	/**
	 * Gets the value of the submittedClaimsCount property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getSubmittedClaimsCount() {
		return submittedClaimsCount;
	}

	/**
	 * Sets the value of the submittedClaimsCount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setSubmittedClaimsCount(BigInteger value) {
		this.submittedClaimsCount = value;
	}

}
