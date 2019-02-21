package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SubCoverageCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SubCoverageCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subCoverageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subCoverageDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subCoverageLimit" type="{http://www.waseel.com/wsdl/primary/wschema}amountST"/>
 *         &lt;element name="subCoverageApprovalThreshold" type="{http://www.waseel.com/wsdl/primary/wschema}amountST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubCoverageCT", propOrder = { "subCoverageCode",
		"subCoverageDescription", "subCoverageLimit",
		"subCoverageApprovalThreshold" })
public class SubCoverageCT {

	@XmlElement(required = true)
	protected String subCoverageCode;
	@XmlElement(required = true)
	protected String subCoverageDescription;
	@XmlElement(required = true)
	protected AmountST subCoverageLimit;
	@XmlElement(required = true)
	protected AmountST subCoverageApprovalThreshold;

	/**
	 * Gets the value of the subCoverageCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubCoverageCode() {
		return subCoverageCode;
	}

	/**
	 * Sets the value of the subCoverageCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSubCoverageCode(String value) {
		this.subCoverageCode = value;
	}

	/**
	 * Gets the value of the subCoverageDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubCoverageDescription() {
		return subCoverageDescription;
	}

	/**
	 * Sets the value of the subCoverageDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSubCoverageDescription(String value) {
		this.subCoverageDescription = value;
	}

	/**
	 * Gets the value of the subCoverageLimit property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getSubCoverageLimit() {
		return subCoverageLimit;
	}

	/**
	 * Sets the value of the subCoverageLimit property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setSubCoverageLimit(AmountST value) {
		this.subCoverageLimit = value;
	}

	/**
	 * Gets the value of the subCoverageApprovalThreshold property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getSubCoverageApprovalThreshold() {
		return subCoverageApprovalThreshold;
	}

	/**
	 * Sets the value of the subCoverageApprovalThreshold property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setSubCoverageApprovalThreshold(AmountST value) {
		this.subCoverageApprovalThreshold = value;
	}

}
