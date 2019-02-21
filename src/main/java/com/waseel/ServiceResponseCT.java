package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ServiceResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service" type="{http://www.waseel.com/wsdl/primary/wschema}ServiceCT"/>
 *         &lt;element name="ServiceDecision" type="{http://www.waseel.com/wsdl/primary/wschema}ServiceDecisionCT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponseCT", propOrder = { "service", "serviceDecision" })
public class ServiceResponseCT {

	@XmlElement(name = "Service", required = true)
	protected ServiceCT service;
	@XmlElement(name = "ServiceDecision")
	protected ServiceDecisionCT serviceDecision;

	/**
	 * Gets the value of the service property.
	 * 
	 * @return possible object is {@link ServiceCT }
	 * 
	 */
	public ServiceCT getService() {
		return service;
	}

	/**
	 * Sets the value of the service property.
	 * 
	 * @param value
	 *            allowed object is {@link ServiceCT }
	 * 
	 */
	public void setService(ServiceCT value) {
		this.service = value;
	}

	/**
	 * Gets the value of the serviceDecision property.
	 * 
	 * @return possible object is {@link ServiceDecisionCT }
	 * 
	 */
	public ServiceDecisionCT getServiceDecision() {
		return serviceDecision;
	}

	/**
	 * Sets the value of the serviceDecision property.
	 * 
	 * @param value
	 *            allowed object is {@link ServiceDecisionCT }
	 * 
	 */
	public void setServiceDecision(ServiceDecisionCT value) {
		this.serviceDecision = value;
	}

}
