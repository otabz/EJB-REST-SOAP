package com.waseel;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InteractionCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InteractionCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BroadcastList" type="{http://www.waseel.com/wsdl/primary/wschema}BroadcastListCT" minOccurs="0"/>
 *         &lt;element name="receiverCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="senderCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interactionCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractionCT", propOrder = { "broadcastList", "receiverCode",
		"senderCode", "interactionCode" })
public class InteractionCT {

	@XmlElement(name = "BroadcastList")
	protected BroadcastListCT broadcastList;
	@XmlElement(required = true)
	protected String receiverCode;
	@XmlElement(required = true)
	protected String senderCode;
	@XmlElement(required = true, defaultValue = "101")
	protected BigInteger interactionCode;

	/**
	 * Gets the value of the broadcastList property.
	 * 
	 * @return possible object is {@link BroadcastListCT }
	 * 
	 */
	public BroadcastListCT getBroadcastList() {
		return broadcastList;
	}

	/**
	 * Sets the value of the broadcastList property.
	 * 
	 * @param value
	 *            allowed object is {@link BroadcastListCT }
	 * 
	 */
	public void setBroadcastList(BroadcastListCT value) {
		this.broadcastList = value;
	}

	/**
	 * Gets the value of the receiverCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReceiverCode() {
		return receiverCode;
	}

	/**
	 * Sets the value of the receiverCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReceiverCode(String value) {
		this.receiverCode = value;
	}

	/**
	 * Gets the value of the senderCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSenderCode() {
		return senderCode;
	}

	/**
	 * Sets the value of the senderCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSenderCode(String value) {
		this.senderCode = value;
	}

	/**
	 * Gets the value of the interactionCode property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getInteractionCode() {
		return interactionCode;
	}

	/**
	 * Sets the value of the interactionCode property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setInteractionCode(BigInteger value) {
		this.interactionCode = value;
	}

}
