package com.waseel;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ServiceCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serviceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="serviceType" type="{http://www.waseel.com/wsdl/primary/wschema}serviceTypeST" minOccurs="0"/>
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toothNumber" type="{http://www.waseel.com/wsdl/primary/wschema}toothNumberST" minOccurs="0"/>
 *         &lt;element name="requestedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="unitPrice" type="{http://www.waseel.com/wsdl/primary/wschema}amountST"/>
 *         &lt;element name="ServiceGDPN" type="{http://www.waseel.com/wsdl/primary/wschema}GDPNCT"/>
 *         &lt;element name="DrugUse" type="{http://www.waseel.com/wsdl/primary/wschema}DrugUseCT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCT", propOrder = { "serviceNumber", "serviceDate",
		"serviceType", "serviceCode", "serviceDescription", "serviceComment",
		"toothNumber", "requestedQuantity", "unitPrice", "serviceGDPN",
		"drugUse" })
public class ServiceCT {

	protected Long serviceNumber;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar serviceDate;
	protected ServiceTypeST serviceType;
	@XmlElement(required = true)
	protected String serviceCode;
	@XmlElement(required = true)
	protected String serviceDescription;
	protected String serviceComment;
	protected ToothNumberST toothNumber;
	@XmlElement(required = true)
	protected BigDecimal requestedQuantity;
	@XmlElement(required = true)
	protected AmountST unitPrice;
	@XmlElement(name = "ServiceGDPN", required = true)
	protected GDPNCT serviceGDPN;
	@XmlElement(name = "DrugUse")
	protected DrugUseCT drugUse;

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
	 * Gets the value of the serviceDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getServiceDate() {
		return serviceDate;
	}

	/**
	 * Sets the value of the serviceDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setServiceDate(XMLGregorianCalendar value) {
		this.serviceDate = value;
	}

	/**
	 * Gets the value of the serviceType property.
	 * 
	 * @return possible object is {@link ServiceTypeST }
	 * 
	 */
	public ServiceTypeST getServiceType() {
		return serviceType;
	}

	/**
	 * Sets the value of the serviceType property.
	 * 
	 * @param value
	 *            allowed object is {@link ServiceTypeST }
	 * 
	 */
	public void setServiceType(ServiceTypeST value) {
		this.serviceType = value;
	}

	/**
	 * Gets the value of the serviceCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceCode() {
		return serviceCode;
	}

	/**
	 * Sets the value of the serviceCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServiceCode(String value) {
		this.serviceCode = value;
	}

	/**
	 * Gets the value of the serviceDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceDescription() {
		return serviceDescription;
	}

	/**
	 * Sets the value of the serviceDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServiceDescription(String value) {
		this.serviceDescription = value;
	}

	/**
	 * Gets the value of the serviceComment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceComment() {
		return serviceComment;
	}

	/**
	 * Sets the value of the serviceComment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServiceComment(String value) {
		this.serviceComment = value;
	}

	/**
	 * Gets the value of the toothNumber property.
	 * 
	 * @return possible object is {@link ToothNumberST }
	 * 
	 */
	public ToothNumberST getToothNumber() {
		return toothNumber;
	}

	/**
	 * Sets the value of the toothNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link ToothNumberST }
	 * 
	 */
	public void setToothNumber(ToothNumberST value) {
		this.toothNumber = value;
	}

	/**
	 * Gets the value of the requestedQuantity property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getRequestedQuantity() {
		return requestedQuantity;
	}

	/**
	 * Sets the value of the requestedQuantity property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setRequestedQuantity(BigDecimal value) {
		this.requestedQuantity = value;
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

	/**
	 * Gets the value of the drugUse property.
	 * 
	 * @return possible object is {@link DrugUseCT }
	 * 
	 */
	public DrugUseCT getDrugUse() {
		return drugUse;
	}

	/**
	 * Sets the value of the drugUse property.
	 * 
	 * @param value
	 *            allowed object is {@link DrugUseCT }
	 * 
	 */
	public void setDrugUse(DrugUseCT value) {
		this.drugUse = value;
	}

}
