package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PolicyInquiryResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyInquiryResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SummaryResponse" type="{http://www.waseel.com/wsdl/primary/wschema}PolicySummaryResponseCT"/>
 *         &lt;element name="DetailResponse" type="{http://www.waseel.com/wsdl/primary/wschema}PolicyDetailResponseCT"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyInquiryResponseCT", propOrder = { "summaryResponse",
		"detailResponse" })
public class PolicyInquiryResponseCT {

	@XmlElement(name = "SummaryResponse")
	protected PolicySummaryResponseCT summaryResponse;
	@XmlElement(name = "DetailResponse")
	protected PolicyDetailResponseCT detailResponse;

	/**
	 * Gets the value of the summaryResponse property.
	 * 
	 * @return possible object is {@link PolicySummaryResponseCT }
	 * 
	 */
	public PolicySummaryResponseCT getSummaryResponse() {
		return summaryResponse;
	}

	/**
	 * Sets the value of the summaryResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicySummaryResponseCT }
	 * 
	 */
	public void setSummaryResponse(PolicySummaryResponseCT value) {
		this.summaryResponse = value;
	}

	/**
	 * Gets the value of the detailResponse property.
	 * 
	 * @return possible object is {@link PolicyDetailResponseCT }
	 * 
	 */
	public PolicyDetailResponseCT getDetailResponse() {
		return detailResponse;
	}

	/**
	 * Sets the value of the detailResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicyDetailResponseCT }
	 * 
	 */
	public void setDetailResponse(PolicyDetailResponseCT value) {
		this.detailResponse = value;
	}

}
