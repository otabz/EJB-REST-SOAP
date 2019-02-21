package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * AdmissionCT include the admission related information like admission date,
 * admission type, and the estimated length of stay
 * 
 * <p>
 * Java class for AdmissionCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AdmissionCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="admissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="admissionType" type="{http://www.waseel.com/wsdl/primary/wschema}admissionTypeST"/>
 *         &lt;element name="estimatedLengthOfStay" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         &lt;element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bedNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discharge" type="{http://www.waseel.com/wsdl/primary/wschema}DischargeCT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdmissionCT", propOrder = { "admissionDate", "admissionType",
		"estimatedLengthOfStay", "roomNumber", "bedNumber", "discharge" })
public class AdmissionCT {

	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar admissionDate;
	@XmlElement(required = true)
	protected AdmissionTypeST admissionType;
	@XmlElement(required = true)
	protected Duration estimatedLengthOfStay;
	protected String roomNumber;
	protected String bedNumber;
	@XmlElement(name = "Discharge")
	protected DischargeCT discharge;

	/**
	 * Gets the value of the admissionDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getAdmissionDate() {
		return admissionDate;
	}

	/**
	 * Sets the value of the admissionDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setAdmissionDate(XMLGregorianCalendar value) {
		this.admissionDate = value;
	}

	/**
	 * Gets the value of the admissionType property.
	 * 
	 * @return possible object is {@link AdmissionTypeST }
	 * 
	 */
	public AdmissionTypeST getAdmissionType() {
		return admissionType;
	}

	/**
	 * Sets the value of the admissionType property.
	 * 
	 * @param value
	 *            allowed object is {@link AdmissionTypeST }
	 * 
	 */
	public void setAdmissionType(AdmissionTypeST value) {
		this.admissionType = value;
	}

	/**
	 * Gets the value of the estimatedLengthOfStay property.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getEstimatedLengthOfStay() {
		return estimatedLengthOfStay;
	}

	/**
	 * Sets the value of the estimatedLengthOfStay property.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setEstimatedLengthOfStay(Duration value) {
		this.estimatedLengthOfStay = value;
	}

	/**
	 * Gets the value of the roomNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRoomNumber() {
		return roomNumber;
	}

	/**
	 * Sets the value of the roomNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRoomNumber(String value) {
		this.roomNumber = value;
	}

	/**
	 * Gets the value of the bedNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBedNumber() {
		return bedNumber;
	}

	/**
	 * Sets the value of the bedNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBedNumber(String value) {
		this.bedNumber = value;
	}

	/**
	 * Gets the value of the discharge property.
	 * 
	 * @return possible object is {@link DischargeCT }
	 * 
	 */
	public DischargeCT getDischarge() {
		return discharge;
	}

	/**
	 * Sets the value of the discharge property.
	 * 
	 * @param value
	 *            allowed object is {@link DischargeCT }
	 * 
	 */
	public void setDischarge(DischargeCT value) {
		this.discharge = value;
	}

}
