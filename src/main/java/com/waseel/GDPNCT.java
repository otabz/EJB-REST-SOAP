package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for GDPNCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="GDPNCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="net" type="{http://www.waseel.com/wsdl/primary/wschema}amountST"/>
 *         &lt;element name="patientShare" type="{http://www.waseel.com/wsdl/primary/wschema}amountST"/>
 *         &lt;element name="discount" type="{http://www.waseel.com/wsdl/primary/wschema}amountST"/>
 *         &lt;element name="gross" type="{http://www.waseel.com/wsdl/primary/wschema}amountST"/>
 *         &lt;element name="priceCorrection" type="{http://www.waseel.com/wsdl/primary/wschema}amountST" minOccurs="0"/>
 *         &lt;element name="rejection" type="{http://www.waseel.com/wsdl/primary/wschema}amountST" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDPNCT", propOrder = { "net", "patientShare", "discount",
		"gross", "priceCorrection", "rejection" })
public class GDPNCT {

	@XmlElement(required = true)
	protected AmountST net;
	@XmlElement(required = true)
	protected AmountST patientShare;
	@XmlElement(required = true)
	protected AmountST discount;
	@XmlElement(required = true)
	protected AmountST gross;
	protected AmountST priceCorrection;
	protected AmountST rejection;

	/**
	 * Gets the value of the net property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getNet() {
		return net;
	}

	/**
	 * Sets the value of the net property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setNet(AmountST value) {
		this.net = value;
	}

	/**
	 * Gets the value of the patientShare property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getPatientShare() {
		return patientShare;
	}

	/**
	 * Sets the value of the patientShare property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setPatientShare(AmountST value) {
		this.patientShare = value;
	}

	/**
	 * Gets the value of the discount property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getDiscount() {
		return discount;
	}

	/**
	 * Sets the value of the discount property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setDiscount(AmountST value) {
		this.discount = value;
	}

	/**
	 * Gets the value of the gross property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getGross() {
		return gross;
	}

	/**
	 * Sets the value of the gross property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setGross(AmountST value) {
		this.gross = value;
	}

	/**
	 * Gets the value of the priceCorrection property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getPriceCorrection() {
		return priceCorrection;
	}

	/**
	 * Sets the value of the priceCorrection property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setPriceCorrection(AmountST value) {
		this.priceCorrection = value;
	}

	/**
	 * Gets the value of the rejection property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getRejection() {
		return rejection;
	}

	/**
	 * Sets the value of the rejection property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setRejection(AmountST value) {
		this.rejection = value;
	}

}
