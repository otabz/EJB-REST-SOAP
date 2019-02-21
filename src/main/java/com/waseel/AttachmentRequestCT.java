package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AttachmentRequestCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentRequestCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileType" type="{http://www.waseel.com/wsdl/primary/wschema}fileTypeST"/>
 *         &lt;element name="attachmentFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="userComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentRequestCT", propOrder = { "fileName", "fileType",
		"attachmentFile", "userComment" })
public class AttachmentRequestCT {

	@XmlElement(required = true)
	protected String fileName;
	@XmlElement(required = true)
	protected FileTypeST fileType;
	@XmlElement(required = true)
	protected byte[] attachmentFile;
	protected String userComment;

	/**
	 * Gets the value of the fileName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Sets the value of the fileName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileName(String value) {
		this.fileName = value;
	}

	/**
	 * Gets the value of the fileType property.
	 * 
	 * @return possible object is {@link FileTypeST }
	 * 
	 */
	public FileTypeST getFileType() {
		return fileType;
	}

	/**
	 * Sets the value of the fileType property.
	 * 
	 * @param value
	 *            allowed object is {@link FileTypeST }
	 * 
	 */
	public void setFileType(FileTypeST value) {
		this.fileType = value;
	}

	/**
	 * Gets the value of the attachmentFile property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getAttachmentFile() {
		return attachmentFile;
	}

	/**
	 * Sets the value of the attachmentFile property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setAttachmentFile(byte[] value) {
		this.attachmentFile = ((byte[]) value);
	}

	/**
	 * Gets the value of the userComment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserComment() {
		return userComment;
	}

	/**
	 * Sets the value of the userComment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserComment(String value) {
		this.userComment = value;
	}

}
