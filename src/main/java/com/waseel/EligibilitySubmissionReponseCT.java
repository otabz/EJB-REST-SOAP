package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for EligibilitySubmissionReponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EligibilitySubmissionReponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedData" type="{http://www.waseel.com/wsdl/primary/wschema}EligibilitySubmissionRequestCT"/>
 *         &lt;element name="Status" type="{http://www.waseel.com/wsdl/primary/wschema}StatusCT"/>
 *         &lt;element name="MemberInfo" type="{http://www.waseel.com/wsdl/primary/wschema}MemberInfoCT" minOccurs="0"/>
 *         &lt;element name="CoverageInfo" type="{http://www.waseel.com/wsdl/primary/wschema}CoverageInfoCT" minOccurs="0"/>
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
@XmlType(name = "EligibilitySubmissionReponseCT", propOrder = {
		"requestedData", "status", "memberInfo", "coverageInfo",
		"additionalInfo" })
public class EligibilitySubmissionReponseCT {

	@XmlElement(name = "RequestedData", required = true)
	protected EligibilitySubmissionRequestCT requestedData;
	@XmlElement(name = "Status", required = true)
	protected StatusCT status;
	@XmlElement(name = "MemberInfo")
	protected MemberInfoCT memberInfo;
	@XmlElement(name = "CoverageInfo")
	protected CoverageInfoCT coverageInfo;
	protected String additionalInfo;

	/**
	 * Gets the value of the requestedData property.
	 * 
	 * @return possible object is {@link EligibilitySubmissionRequestCT }
	 * 
	 */
	public EligibilitySubmissionRequestCT getRequestedData() {
		return requestedData;
	}

	/**
	 * Sets the value of the requestedData property.
	 * 
	 * @param value
	 *            allowed object is {@link EligibilitySubmissionRequestCT }
	 * 
	 */
	public void setRequestedData(EligibilitySubmissionRequestCT value) {
		this.requestedData = value;
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
