package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for EndorsementCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EndorsementCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endorsementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endorsementType" type="{http://www.waseel.com/wsdl/primary/wschema}endorsementTypeST"/>
 *         &lt;element name="endorsmentMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endorsementNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndorsementCT", propOrder = { "endorsementDate",
		"endorsementType", "endorsmentMessage", "endorsementNumber" })
public class EndorsementCT {

	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar endorsementDate;
	@XmlElement(required = true)
	protected EndorsementTypeST endorsementType;
	@XmlElement(required = true)
	protected String endorsmentMessage;
	@XmlElement(required = true)
	protected String endorsementNumber;

	/**
	 * Gets the value of the endorsementDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getEndorsementDate() {
		return endorsementDate;
	}

	/**
	 * Sets the value of the endorsementDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setEndorsementDate(XMLGregorianCalendar value) {
		this.endorsementDate = value;
	}

	/**
	 * Gets the value of the endorsementType property.
	 * 
	 * @return possible object is {@link EndorsementTypeST }
	 * 
	 */
	public EndorsementTypeST getEndorsementType() {
		return endorsementType;
	}

	/**
	 * Sets the value of the endorsementType property.
	 * 
	 * @param value
	 *            allowed object is {@link EndorsementTypeST }
	 * 
	 */
	public void setEndorsementType(EndorsementTypeST value) {
		this.endorsementType = value;
	}

	/**
	 * Gets the value of the endorsmentMessage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEndorsmentMessage() {
		return endorsmentMessage;
	}

	/**
	 * Sets the value of the endorsmentMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEndorsmentMessage(String value) {
		this.endorsmentMessage = value;
	}

	/**
	 * Gets the value of the endorsementNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEndorsementNumber() {
		return endorsementNumber;
	}

	/**
	 * Sets the value of the endorsementNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEndorsementNumber(String value) {
		this.endorsementNumber = value;
	}

}
