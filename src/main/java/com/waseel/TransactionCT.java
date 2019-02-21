package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for TransactionCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.waseel.com/wsdl/primary/wschema}transactionTypeST"/>
 *         &lt;element name="subType" type="{http://www.waseel.com/wsdl/primary/wschema}transactionSubTypeST"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="clientTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://www.waseel.com/wsdl/primary/wschema}transactionDirectionST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCT", propOrder = { "type", "subType",
		"transactionID", "clientTransactionID", "direction" })
public class TransactionCT {

	@XmlElement(required = true)
	protected TransactionTypeST type;
	@XmlElement(required = true)
	protected TransactionSubTypeST subType;
	protected Long transactionID;
	protected String clientTransactionID;
	@XmlElement(required = true)
	protected TransactionDirectionST direction;

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link TransactionTypeST }
	 * 
	 */
	public TransactionTypeST getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link TransactionTypeST }
	 * 
	 */
	public void setType(TransactionTypeST value) {
		this.type = value;
	}

	/**
	 * Gets the value of the subType property.
	 * 
	 * @return possible object is {@link TransactionSubTypeST }
	 * 
	 */
	public TransactionSubTypeST getSubType() {
		return subType;
	}

	/**
	 * Sets the value of the subType property.
	 * 
	 * @param value
	 *            allowed object is {@link TransactionSubTypeST }
	 * 
	 */
	public void setSubType(TransactionSubTypeST value) {
		this.subType = value;
	}

	/**
	 * Gets the value of the transactionID property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getTransactionID() {
		return transactionID;
	}

	/**
	 * Sets the value of the transactionID property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setTransactionID(Long value) {
		this.transactionID = value;
	}

	/**
	 * Gets the value of the clientTransactionID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClientTransactionID() {
		return clientTransactionID;
	}

	/**
	 * Sets the value of the clientTransactionID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClientTransactionID(String value) {
		this.clientTransactionID = value;
	}

	/**
	 * Gets the value of the direction property.
	 * 
	 * @return possible object is {@link TransactionDirectionST }
	 * 
	 */
	public TransactionDirectionST getDirection() {
		return direction;
	}

	/**
	 * Sets the value of the direction property.
	 * 
	 * @param value
	 *            allowed object is {@link TransactionDirectionST }
	 * 
	 */
	public void setDirection(TransactionDirectionST value) {
		this.direction = value;
	}

}
