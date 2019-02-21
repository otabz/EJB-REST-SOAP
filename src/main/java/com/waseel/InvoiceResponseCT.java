package com.waseel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InvoiceResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceDecision" type="{http://www.waseel.com/wsdl/primary/wschema}InvoiceDecisionCT"/>
 *         &lt;element name="ServiceResponse" type="{http://www.waseel.com/wsdl/primary/wschema}ServiceResponseCT" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceResponseCT", propOrder = { "invoiceDecision",
		"serviceResponse" })
public class InvoiceResponseCT {

	@XmlElement(name = "InvoiceDecision", required = true)
	protected InvoiceDecisionCT invoiceDecision;
	@XmlElement(name = "ServiceResponse", required = true)
	protected List<ServiceResponseCT> serviceResponse;

	/**
	 * Gets the value of the invoiceDecision property.
	 * 
	 * @return possible object is {@link InvoiceDecisionCT }
	 * 
	 */
	public InvoiceDecisionCT getInvoiceDecision() {
		return invoiceDecision;
	}

	/**
	 * Sets the value of the invoiceDecision property.
	 * 
	 * @param value
	 *            allowed object is {@link InvoiceDecisionCT }
	 * 
	 */
	public void setInvoiceDecision(InvoiceDecisionCT value) {
		this.invoiceDecision = value;
	}

	/**
	 * Gets the value of the serviceResponse property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the serviceResponse property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getServiceResponse().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ServiceResponseCT }
	 * 
	 * 
	 */
	public List<ServiceResponseCT> getServiceResponse() {
		if (serviceResponse == null) {
			serviceResponse = new ArrayList<ServiceResponseCT>();
		}
		return this.serviceResponse;
	}

}
