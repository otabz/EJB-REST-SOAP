package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;

/**
 * <p>
 * Java class for AdmissionDecisionCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AdmissionDecisionCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomType" type="{http://www.waseel.com/wsdl/primary/wschema}roomTypeST" minOccurs="0"/>
 *         &lt;element name="approvedLengthOfStay" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdmissionDecisionCT", propOrder = { "roomType",
		"approvedLengthOfStay" })
public class AdmissionDecisionCT {

	protected RoomTypeST roomType;
	@XmlElement(required = true)
	protected Duration approvedLengthOfStay;

	/**
	 * Gets the value of the roomType property.
	 * 
	 * @return possible object is {@link RoomTypeST }
	 * 
	 */
	public RoomTypeST getRoomType() {
		return roomType;
	}

	/**
	 * Sets the value of the roomType property.
	 * 
	 * @param value
	 *            allowed object is {@link RoomTypeST }
	 * 
	 */
	public void setRoomType(RoomTypeST value) {
		this.roomType = value;
	}

	/**
	 * Gets the value of the approvedLengthOfStay property.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getApprovedLengthOfStay() {
		return approvedLengthOfStay;
	}

	/**
	 * Sets the value of the approvedLengthOfStay property.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setApprovedLengthOfStay(Duration value) {
		this.approvedLengthOfStay = value;
	}

}
