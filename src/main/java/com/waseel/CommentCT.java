package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for CommentCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CommentCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="commentText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commentType" type="{http://www.waseel.com/wsdl/primary/wschema}commentTypeST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentCT", propOrder = { "commentDate", "commentText",
		"commentType" })
public class CommentCT {

	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar commentDate;
	@XmlElement(required = true)
	protected String commentText;
	@XmlElement(required = true)
	protected CommentTypeST commentType;

	/**
	 * Gets the value of the commentDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCommentDate() {
		return commentDate;
	}

	/**
	 * Sets the value of the commentDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCommentDate(XMLGregorianCalendar value) {
		this.commentDate = value;
	}

	/**
	 * Gets the value of the commentText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCommentText() {
		return commentText;
	}

	/**
	 * Sets the value of the commentText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCommentText(String value) {
		this.commentText = value;
	}

	/**
	 * Gets the value of the commentType property.
	 * 
	 * @return possible object is {@link CommentTypeST }
	 * 
	 */
	public CommentTypeST getCommentType() {
		return commentType;
	}

	/**
	 * Sets the value of the commentType property.
	 * 
	 * @param value
	 *            allowed object is {@link CommentTypeST }
	 * 
	 */
	public void setCommentType(CommentTypeST value) {
		this.commentType = value;
	}

}
