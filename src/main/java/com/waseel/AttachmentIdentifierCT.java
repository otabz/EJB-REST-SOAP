package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AttachmentIdentifierCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentIdentifierCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachmentUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="attachmentID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentIdentifierCT", propOrder = { "attachmentUrl",
		"attachmentID" })
public class AttachmentIdentifierCT {

	@XmlElement(required = true)
	@XmlSchemaType(name = "anyURI")
	protected String attachmentUrl;
	@XmlElement(required = true)
	protected String attachmentID;

	/**
	 * Gets the value of the attachmentUrl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttachmentUrl() {
		return attachmentUrl;
	}

	/**
	 * Sets the value of the attachmentUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAttachmentUrl(String value) {
		this.attachmentUrl = value;
	}

	/**
	 * Gets the value of the attachmentID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttachmentID() {
		return attachmentID;
	}

	/**
	 * Sets the value of the attachmentID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAttachmentID(String value) {
		this.attachmentID = value;
	}

}
