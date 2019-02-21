package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ClaimInquiryResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimInquiryResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SummaryResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimSummaryResponseCT"/>
 *         &lt;element name="DetailResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ClaimDetailResponseCT"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimInquiryResponseCT", propOrder = { "summaryResponse",
		"detailResponse" })
public class ClaimInquiryResponseCT {

	@XmlElement(name = "SummaryResponse")
	protected ClaimSummaryResponseCT summaryResponse;
	@XmlElement(name = "DetailResponse")
	protected ClaimDetailResponseCT detailResponse;

	/**
	 * Gets the value of the summaryResponse property.
	 * 
	 * @return possible object is {@link ClaimSummaryResponseCT }
	 * 
	 */
	public ClaimSummaryResponseCT getSummaryResponse() {
		return summaryResponse;
	}

	/**
	 * Sets the value of the summaryResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimSummaryResponseCT }
	 * 
	 */
	public void setSummaryResponse(ClaimSummaryResponseCT value) {
		this.summaryResponse = value;
	}

	/**
	 * Gets the value of the detailResponse property.
	 * 
	 * @return possible object is {@link ClaimDetailResponseCT }
	 * 
	 */
	public ClaimDetailResponseCT getDetailResponse() {
		return detailResponse;
	}

	/**
	 * Sets the value of the detailResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ClaimDetailResponseCT }
	 * 
	 */
	public void setDetailResponse(ClaimDetailResponseCT value) {
		this.detailResponse = value;
	}

}
