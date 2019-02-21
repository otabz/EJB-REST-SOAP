package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MSOBResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MSOBResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedData" type="{http://www.waseel.com/wsdl/primary/wschema}MSOBRequestCT"/>
 *         &lt;element name="Status" type="{http://www.waseel.com/wsdl/primary/wschema}StatusCT"/>
 *         &lt;element name="additionalInfo" type="{http://www.waseel.com/wsdl/primary/wschema}additionalInfoST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSOBResponseCT", propOrder = { "requestedData", "status",
		"additionalInfo" })
public class MSOBResponseCT {

	@XmlElement(name = "RequestedData", required = true)
	protected MSOBRequestCT requestedData;
	@XmlElement(name = "Status", required = true)
	protected StatusCT status;
	@XmlElement(required = true)
	protected String additionalInfo;

	/**
	 * Gets the value of the requestedData property.
	 * 
	 * @return possible object is {@link MSOBRequestCT }
	 * 
	 */
	public MSOBRequestCT getRequestedData() {
		return requestedData;
	}

	/**
	 * Sets the value of the requestedData property.
	 * 
	 * @param value
	 *            allowed object is {@link MSOBRequestCT }
	 * 
	 */
	public void setRequestedData(MSOBRequestCT value) {
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
