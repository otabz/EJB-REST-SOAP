package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * Java class for AttachmentSubmissionRequestCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentSubmissionRequestCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Member" type="{http://www.waseel.com/wsdl/primary/wschema}MemberCT"/>
 *         &lt;element name="caseType" type="{http://www.waseel.com/wsdl/primary/wschema}caseTypeST"/>
 *         &lt;element name="Attachment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AttachmentTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AttachmentComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="attachementFile">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                           &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="fileType" type="{http://www.waseel.com/wsdl/primary/wschema}fileTypeST" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentSubmissionRequestCT", propOrder = { "member",
		"caseType", "attachment" })
public class AttachmentSubmissionRequestCT {

	@XmlElement(name = "Member", required = true)
	protected MemberCT member;
	@XmlElement(required = true)
	protected CaseTypeST caseType;
	@XmlElement(name = "Attachment", required = true)
	protected AttachmentSubmissionRequestCT.Attachment attachment;

	/**
	 * Gets the value of the member property.
	 * 
	 * @return possible object is {@link MemberCT }
	 * 
	 */
	public MemberCT getMember() {
		return member;
	}

	/**
	 * Sets the value of the member property.
	 * 
	 * @param value
	 *            allowed object is {@link MemberCT }
	 * 
	 */
	public void setMember(MemberCT value) {
		this.member = value;
	}

	/**
	 * Gets the value of the caseType property.
	 * 
	 * @return possible object is {@link CaseTypeST }
	 * 
	 */
	public CaseTypeST getCaseType() {
		return caseType;
	}

	/**
	 * Sets the value of the caseType property.
	 * 
	 * @param value
	 *            allowed object is {@link CaseTypeST }
	 * 
	 */
	public void setCaseType(CaseTypeST value) {
		this.caseType = value;
	}

	/**
	 * Gets the value of the attachment property.
	 * 
	 * @return possible object is
	 *         {@link AttachmentSubmissionRequestCT.Attachment }
	 * 
	 */
	public AttachmentSubmissionRequestCT.Attachment getAttachment() {
		return attachment;
	}

	/**
	 * Sets the value of the attachment property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link AttachmentSubmissionRequestCT.Attachment }
	 * 
	 */
	public void setAttachment(AttachmentSubmissionRequestCT.Attachment value) {
		this.attachment = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="AttachmentTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="AttachmentComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="attachementFile">
	 *           &lt;complexType>
	 *             &lt;simpleContent>
	 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
	 *                 &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                 &lt;attribute name="fileType" type="{http://www.waseel.com/wsdl/primary/wschema}fileTypeST" />
	 *               &lt;/extension>
	 *             &lt;/simpleContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "attachmentTitle", "attachmentComment",
			"attachementFile" })
	public static class Attachment {

		@XmlElement(name = "AttachmentTitle", required = true)
		protected String attachmentTitle;
		@XmlElement(name = "AttachmentComment", required = true)
		protected String attachmentComment;
		@XmlElement(required = true)
		protected AttachmentSubmissionRequestCT.Attachment.AttachementFile attachementFile;

		/**
		 * Gets the value of the attachmentTitle property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAttachmentTitle() {
			return attachmentTitle;
		}

		/**
		 * Sets the value of the attachmentTitle property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAttachmentTitle(String value) {
			this.attachmentTitle = value;
		}

		/**
		 * Gets the value of the attachmentComment property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAttachmentComment() {
			return attachmentComment;
		}

		/**
		 * Sets the value of the attachmentComment property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAttachmentComment(String value) {
			this.attachmentComment = value;
		}

		/**
		 * Gets the value of the attachementFile property.
		 * 
		 * @return possible object is
		 *         {@link AttachmentSubmissionRequestCT.Attachment.AttachementFile }
		 * 
		 */
		public AttachmentSubmissionRequestCT.Attachment.AttachementFile getAttachementFile() {
			return attachementFile;
		}

		/**
		 * Sets the value of the attachementFile property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link AttachmentSubmissionRequestCT.Attachment.AttachementFile }
		 * 
		 */
		public void setAttachementFile(
				AttachmentSubmissionRequestCT.Attachment.AttachementFile value) {
			this.attachementFile = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;simpleContent>
		 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
		 *       &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *       &lt;attribute name="fileType" type="{http://www.waseel.com/wsdl/primary/wschema}fileTypeST" />
		 *     &lt;/extension>
		 *   &lt;/simpleContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "value" })
		public static class AttachementFile {

			@XmlValue
			protected byte[] value;
			@XmlAttribute
			protected String fileName;
			@XmlAttribute
			protected FileTypeST fileType;

			/**
			 * Gets the value of the value property.
			 * 
			 * @return possible object is byte[]
			 */
			public byte[] getValue() {
				return value;
			}

			/**
			 * Sets the value of the value property.
			 * 
			 * @param value
			 *            allowed object is byte[]
			 */
			public void setValue(byte[] value) {
				this.value = ((byte[]) value);
			}

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

		}

	}

}
