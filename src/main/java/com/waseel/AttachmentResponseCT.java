package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AttachmentResponseCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentResponseCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachmentReferenceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attachmentURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentResponseCT", propOrder = { "attachmentReferenceID",
		"attachmentURL" })
public class AttachmentResponseCT {

	@XmlElement(required = true)
	protected String attachmentReferenceID;
	@XmlElement(required = true)
	@XmlSchemaType(name = "anyURI")
	protected String attachmentURL;

	/**
	 * Gets the value of the attachmentReferenceID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttachmentReferenceID() {
		return attachmentReferenceID;
	}

	/**
	 * Sets the value of the attachmentReferenceID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAttachmentReferenceID(String value) {
		this.attachmentReferenceID = value;
	}

	/**
	 * Gets the value of the attachmentURL property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttachmentURL() {
		return attachmentURL;
	}

	/**
	 * Sets the value of the attachmentURL property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAttachmentURL(String value) {
		this.attachmentURL = value;
	}

}
