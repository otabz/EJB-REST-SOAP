package com.waseel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PolicyCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.waseel.com/wsdl/primary/wschema}StatusCT"/>
 *         &lt;element name="GenaralInfo" type="{http://www.waseel.com/wsdl/primary/wschema}PolicyGenInfoCT"/>
 *         &lt;element name="PolicyClass" type="{http://www.waseel.com/wsdl/primary/wschema}PolicyClassCT" maxOccurs="unbounded"/>
 *         &lt;element name="CEC" type="{http://www.waseel.com/wsdl/primary/wschema}CECCT"/>
 *         &lt;element name="Endorsements">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Endorsement" type="{http://www.waseel.com/wsdl/primary/wschema}EndorsementCT" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="additionalInfo" type="{http://www.waseel.com/wsdl/primary/wschema}additionalInfoST" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyCT", propOrder = { "status", "genaralInfo",
		"policyClass", "cec", "endorsements", "additionalInfo" })
public class PolicyCT {

	@XmlElement(name = "Status", required = true)
	protected StatusCT status;
	@XmlElement(name = "GenaralInfo", required = true)
	protected PolicyGenInfoCT genaralInfo;
	@XmlElement(name = "PolicyClass", required = true)
	protected List<PolicyClassCT> policyClass;
	@XmlElement(name = "CEC", required = true)
	protected CECCT cec;
	@XmlElement(name = "Endorsements", required = true)
	protected PolicyCT.Endorsements endorsements;
	protected String additionalInfo;

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link StatusCT }
	 * 
	 */
	public StatusCT getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link StatusCT }
	 * 
	 */
	public void setStatus(StatusCT value) {
		this.status = value;
	}

	/**
	 * Gets the value of the genaralInfo property.
	 * 
	 * @return possible object is {@link PolicyGenInfoCT }
	 * 
	 */
	public PolicyGenInfoCT getGenaralInfo() {
		return genaralInfo;
	}

	/**
	 * Sets the value of the genaralInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicyGenInfoCT }
	 * 
	 */
	public void setGenaralInfo(PolicyGenInfoCT value) {
		this.genaralInfo = value;
	}

	/**
	 * Gets the value of the policyClass property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the policyClass property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPolicyClass().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link PolicyClassCT }
	 * 
	 * 
	 */
	public List<PolicyClassCT> getPolicyClass() {
		if (policyClass == null) {
			policyClass = new ArrayList<PolicyClassCT>();
		}
		return this.policyClass;
	}

	/**
	 * Gets the value of the cec property.
	 * 
	 * @return possible object is {@link CECCT }
	 * 
	 */
	public CECCT getCEC() {
		return cec;
	}

	/**
	 * Sets the value of the cec property.
	 * 
	 * @param value
	 *            allowed object is {@link CECCT }
	 * 
	 */
	public void setCEC(CECCT value) {
		this.cec = value;
	}

	/**
	 * Gets the value of the endorsements property.
	 * 
	 * @return possible object is {@link PolicyCT.Endorsements }
	 * 
	 */
	public PolicyCT.Endorsements getEndorsements() {
		return endorsements;
	}

	/**
	 * Sets the value of the endorsements property.
	 * 
	 * @param value
	 *            allowed object is {@link PolicyCT.Endorsements }
	 * 
	 */
	public void setEndorsements(PolicyCT.Endorsements value) {
		this.endorsements = value;
	}

	/**
	 * Gets the value of the additionalInfo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdditionalInfo() {
		return additionalInfo;
	}

	/**
	 * Sets the value of the additionalInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdditionalInfo(String value) {
		this.additionalInfo = value;
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
	 *         &lt;element name="Endorsement" type="{http://www.waseel.com/wsdl/primary/wschema}EndorsementCT" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "endorsement" })
	public static class Endorsements {

		@XmlElement(name = "Endorsement")
		protected List<EndorsementCT> endorsement;

		/**
		 * Gets the value of the endorsement property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the endorsement property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getEndorsement().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link EndorsementCT }
		 * 
		 * 
		 */
		public List<EndorsementCT> getEndorsement() {
			if (endorsement == null) {
				endorsement = new ArrayList<EndorsementCT>();
			}
			return this.endorsement;
		}

	}

}
