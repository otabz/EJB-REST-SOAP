package com.waseel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for InvoiceCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="invoiceDepartment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InvoiceGDPN" type="{http://www.waseel.com/wsdl/primary/wschema}GDPNCT"/>
 *         &lt;element name="Service" type="{http://www.waseel.com/wsdl/primary/wschema}ServiceCT" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceCT", propOrder = { "invoiceNumber", "invoiceDate",
		"invoiceDepartment", "invoiceGDPN", "service" })
public class InvoiceCT {

	@XmlElement(required = true)
	protected String invoiceNumber;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar invoiceDate;
	@XmlElement(required = true)
	protected String invoiceDepartment;
	@XmlElement(name = "InvoiceGDPN", required = true)
	protected GDPNCT invoiceGDPN;
	@XmlElement(name = "Service", required = true)
	protected List<ServiceCT> service;

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
	 * Gets the value of the invoiceDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * Sets the value of the invoiceDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setInvoiceDate(XMLGregorianCalendar value) {
		this.invoiceDate = value;
	}

	/**
	 * Gets the value of the invoiceDepartment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceDepartment() {
		return invoiceDepartment;
	}

	/**
	 * Sets the value of the invoiceDepartment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInvoiceDepartment(String value) {
		this.invoiceDepartment = value;
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

	/**
	 * Gets the value of the service property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the service property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getService().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ServiceCT }
	 * 
	 * 
	 */
	public List<ServiceCT> getService() {
		if (service == null) {
			service = new ArrayList<ServiceCT>();
		}
		return this.service;
	}

}
