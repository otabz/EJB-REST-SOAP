package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InvoiceDecisionCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDecisionCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InvoiceGDPN" type="{http://www.waseel.com/wsdl/primary/wschema}GDPNCT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDecisionCT", propOrder = { "invoiceNumber",
		"invoiceGDPN" })
public class InvoiceDecisionCT {

	@XmlElement(required = true)
	protected String invoiceNumber;
	@XmlElement(name = "InvoiceGDPN", required = true)
	protected GDPNCT invoiceGDPN;

	/**
	 * Gets the value of the invoiceNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * Sets the value of the invoiceNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInvoiceNumber(String value) {
		this.invoiceNumber = value;
	}

	/**
	 * Gets the value of the invoiceGDPN property.
	 * 
	 * @return possible object is {@link GDPNCT }
	 * 
	 */
	public GDPNCT getInvoiceGDPN() {
		return invoiceGDPN;
	}

	/**
	 * Sets the value of the invoiceGDPN property.
	 * 
	 * @param value
	 *            allowed object is {@link GDPNCT }
	 * 
	 */
	public void setInvoiceGDPN(GDPNCT value) {
		this.invoiceGDPN = value;
	}

}
