package com.waseel;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * the amount simple type is used wherever there is a monatry representation. it
 * is of decimal type and has an attribute for the currency.
 * 
 * <p>
 * Java class for amountST complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="amountST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.waseel.com/wsdl/primary/wschema}amountValueST"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.waseel.com/wsdl/primary/wschema}amountTypeST" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amountST", propOrder = { "value" })
public class AmountST {

	@XmlElement(required = true)
	protected BigDecimal value;
	@XmlAttribute
	protected AmountTypeST type;

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setValue(BigDecimal value) {
		this.value = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link AmountTypeST }
	 * 
	 */
	public AmountTypeST getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountTypeST }
	 * 
	 */
	public void setType(AmountTypeST value) {
		this.type = value;
	}

}
