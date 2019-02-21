package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ApprovalInquiryResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalInquiryResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SummaryResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalSummaryResponseCT"/>
 *         &lt;element name="DetailResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ApprovalDetailResponseCT"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalInquiryResponseCT", propOrder = { "summaryResponse",
		"detailResponse" })
public class ApprovalInquiryResponseCT {

	@XmlElement(name = "SummaryResponse")
	protected ApprovalSummaryResponseCT summaryResponse;
	@XmlElement(name = "DetailResponse")
	protected ApprovalDetailResponseCT detailResponse;

	/**
	 * Gets the value of the summaryResponse property.
	 * 
	 * @return possible object is {@link ApprovalSummaryResponseCT }
	 * 
	 */
	public ApprovalSummaryResponseCT getSummaryResponse() {
		return summaryResponse;
	}

	/**
	 * Sets the value of the summaryResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ApprovalSummaryResponseCT }
	 * 
	 */
	public void setSummaryResponse(ApprovalSummaryResponseCT value) {
		this.summaryResponse = value;
	}

	/**
	 * Gets the value of the detailResponse property.
	 * 
	 * @return possible object is {@link ApprovalDetailResponseCT }
	 * 
	 */
	public ApprovalDetailResponseCT getDetailResponse() {
		return detailResponse;
	}

	/**
	 * Sets the value of the detailResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ApprovalDetailResponseCT }
	 * 
	 */
	public void setDetailResponse(ApprovalDetailResponseCT value) {
		this.detailResponse = value;
	}

}
