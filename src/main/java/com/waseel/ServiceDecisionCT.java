package com.waseel;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ServiceDecisionCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDecisionCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="approvedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="serviceDenialCode" type="{http://www.waseel.com/wsdl/primary/wschema}denialCodeST" minOccurs="0"/>
 *         &lt;element name="decisionComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitPrice" type="{http://www.waseel.com/wsdl/primary/wschema}amountST"/>
 *         &lt;element name="ServiceGDPN" type="{http://www.waseel.com/wsdl/primary/wschema}GDPNCT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDecisionCT", propOrder = { "serviceNumber",
		"approvedQuantity", "serviceDenialCode", "decisionComment",
		"unitPrice", "serviceGDPN" })
public class ServiceDecisionCT {

	protected Long serviceNumber;
	@XmlElement(required = true)
	protected BigDecimal approvedQuantity;
	protected String serviceDenialCode;
	protected String decisionComment;
	@XmlElement(required = true)
	protected AmountST unitPrice;
	@XmlElement(name = "ServiceGDPN", required = true)
	protected GDPNCT serviceGDPN;

	/**
	 * Gets the value of the serviceNumber property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getServiceNumber() {
		return serviceNumber;
	}

	/**
	 * Sets the value of the serviceNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setServiceNumber(Long value) {
		this.serviceNumber = value;
	}

	/**
	 * Gets the value of the approvedQuantity property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getApprovedQuantity() {
		return approvedQuantity;
	}

	/**
	 * Sets the value of the approvedQuantity property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setApprovedQuantity(BigDecimal value) {
		this.approvedQuantity = value;
	}

	/**
	 * Gets the value of the serviceDenialCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceDenialCode() {
		return serviceDenialCode;
	}

	/**
	 * Sets the value of the serviceDenialCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServiceDenialCode(String value) {
		this.serviceDenialCode = value;
	}

	/**
	 * Gets the value of the decisionComment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDecisionComment() {
		return decisionComment;
	}

	/**
	 * Sets the value of the decisionComment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDecisionComment(String value) {
		this.decisionComment = value;
	}

	/**
	 * Gets the value of the unitPrice property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getUnitPrice() {
		return unitPrice;
	}

	/**
	 * Sets the value of the unitPrice property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setUnitPrice(AmountST value) {
		this.unitPrice = value;
	}

	/**
	 * Gets the value of the serviceGDPN property.
	 * 
	 * @return possible object is {@link GDPNCT }
	 * 
	 */
	public GDPNCT getServiceGDPN() {
		return serviceGDPN;
	}

	/**
	 * Sets the value of the serviceGDPN property.
	 * 
	 * @param value
	 *            allowed object is {@link GDPNCT }
	 * 
	 */
	public void setServiceGDPN(GDPNCT value) {
		this.serviceGDPN = value;
	}

}
