package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for MessageHeaderCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MessageHeaderCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transaction" type="{http://www.waseel.com/wsdl/primary/wschema}TransactionCT"/>
 *         &lt;element name="Interaction" type="{http://www.waseel.com/wsdl/primary/wschema}InteractionCT"/>
 *         &lt;element name="User" type="{http://www.waseel.com/wsdl/primary/wschema}UserCT" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeaderCT", propOrder = { "transaction", "interaction",
		"user", "timestamp" })
public class MessageHeaderCT {

	@XmlElement(name = "Transaction", required = true)
	protected TransactionCT transaction;
	@XmlElement(name = "Interaction", required = true)
	protected InteractionCT interaction;
	@XmlElement(name = "User")
	protected UserCT user;
	@XmlElement(name = "Timestamp", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar timestamp;

	/**
	 * Gets the value of the transaction property.
	 * 
	 * @return possible object is {@link TransactionCT }
	 * 
	 */
	public TransactionCT getTransaction() {
		return transaction;
	}

	/**
	 * Sets the value of the transaction property.
	 * 
	 * @param value
	 *            allowed object is {@link TransactionCT }
	 * 
	 */
	public void setTransaction(TransactionCT value) {
		this.transaction = value;
	}

	/**
	 * Gets the value of the interaction property.
	 * 
	 * @return possible object is {@link InteractionCT }
	 * 
	 */
	public InteractionCT getInteraction() {
		return interaction;
	}

	/**
	 * Sets the value of the interaction property.
	 * 
	 * @param value
	 *            allowed object is {@link InteractionCT }
	 * 
	 */
	public void setInteraction(InteractionCT value) {
		this.interaction = value;
	}

	/**
	 * Gets the value of the user property.
	 * 
	 * @return possible object is {@link UserCT }
	 * 
	 */
	public UserCT getUser() {
		return user;
	}

	/**
	 * Sets the value of the user property.
	 * 
	 * @param value
	 *            allowed object is {@link UserCT }
	 * 
	 */
	public void setUser(UserCT value) {
		this.user = value;
	}

	/**
	 * Gets the value of the timestamp property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the timestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTimestamp(XMLGregorianCalendar value) {
		this.timestamp = value;
	}

}
