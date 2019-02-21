package com.waseel;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for MSOBRequestCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MSOBRequestCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalClaimCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="totalClaimedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="batchReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NotAcceptedClaimsCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="NotAcceptedClaimsList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotAcceptedClaimsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AcceptedClaimsCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="AcceptedClaimsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSOBRequestCT", propOrder = { "batchID", "totalClaimCount",
		"totalClaimedAmount", "batchReference", "sendDate",
		"notAcceptedClaimsCount", "notAcceptedClaimsList",
		"notAcceptedClaimsAmount", "acceptedClaimsCount",
		"acceptedClaimsAmount" })
public class MSOBRequestCT {

	@XmlElement(required = true)
	protected String batchID;
	@XmlElement(required = true)
	protected BigInteger totalClaimCount;
	@XmlElement(required = true)
	protected BigDecimal totalClaimedAmount;
	@XmlElement(required = true)
	protected String batchReference;
	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar sendDate;
	@XmlElement(name = "NotAcceptedClaimsCount", required = true)
	protected BigInteger notAcceptedClaimsCount;
	@XmlElement(name = "NotAcceptedClaimsList")
	protected String notAcceptedClaimsList;
	@XmlElement(name = "NotAcceptedClaimsAmount", required = true)
	protected BigDecimal notAcceptedClaimsAmount;
	@XmlElement(name = "AcceptedClaimsCount", required = true)
	protected BigInteger acceptedClaimsCount;
	@XmlElement(name = "AcceptedClaimsAmount", required = true)
	protected BigDecimal acceptedClaimsAmount;

	/**
	 * Gets the value of the batchID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBatchID() {
		return batchID;
	}

	/**
	 * Sets the value of the batchID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBatchID(String value) {
		this.batchID = value;
	}

	/**
	 * Gets the value of the totalClaimCount property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getTotalClaimCount() {
		return totalClaimCount;
	}

	/**
	 * Sets the value of the totalClaimCount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setTotalClaimCount(BigInteger value) {
		this.totalClaimCount = value;
	}

	/**
	 * Gets the value of the totalClaimedAmount property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getTotalClaimedAmount() {
		return totalClaimedAmount;
	}

	/**
	 * Sets the value of the totalClaimedAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTotalClaimedAmount(BigDecimal value) {
		this.totalClaimedAmount = value;
	}

	/**
	 * Gets the value of the batchReference property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBatchReference() {
		return batchReference;
	}

	/**
	 * Sets the value of the batchReference property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBatchReference(String value) {
		this.batchReference = value;
	}

	/**
	 * Gets the value of the sendDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getSendDate() {
		return sendDate;
	}

	/**
	 * Sets the value of the sendDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setSendDate(XMLGregorianCalendar value) {
		this.sendDate = value;
	}

	/**
	 * Gets the value of the notAcceptedClaimsCount property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getNotAcceptedClaimsCount() {
		return notAcceptedClaimsCount;
	}

	/**
	 * Sets the value of the notAcceptedClaimsCount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setNotAcceptedClaimsCount(BigInteger value) {
		this.notAcceptedClaimsCount = value;
	}

	/**
	 * Gets the value of the notAcceptedClaimsList property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNotAcceptedClaimsList() {
		return notAcceptedClaimsList;
	}

	/**
	 * Sets the value of the notAcceptedClaimsList property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNotAcceptedClaimsList(String value) {
		this.notAcceptedClaimsList = value;
	}

	/**
	 * Gets the value of the notAcceptedClaimsAmount property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getNotAcceptedClaimsAmount() {
		return notAcceptedClaimsAmount;
	}

	/**
	 * Sets the value of the notAcceptedClaimsAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setNotAcceptedClaimsAmount(BigDecimal value) {
		this.notAcceptedClaimsAmount = value;
	}

	/**
	 * Gets the value of the acceptedClaimsCount property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getAcceptedClaimsCount() {
		return acceptedClaimsCount;
	}

	/**
	 * Sets the value of the acceptedClaimsCount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setAcceptedClaimsCount(BigInteger value) {
		this.acceptedClaimsCount = value;
	}

	/**
	 * Gets the value of the acceptedClaimsAmount property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getAcceptedClaimsAmount() {
		return acceptedClaimsAmount;
	}

	/**
	 * Sets the value of the acceptedClaimsAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setAcceptedClaimsAmount(BigDecimal value) {
		this.acceptedClaimsAmount = value;
	}

}
