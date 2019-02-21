package com.waseel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PolicyClassCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyClassCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classCode" type="{http://www.waseel.com/wsdl/primary/wschema}memberClassST"/>
 *         &lt;element name="classLimit" type="{http://www.waseel.com/wsdl/primary/wschema}amountST"/>
 *         &lt;element name="Benefit" type="{http://www.waseel.com/wsdl/primary/wschema}BenefitCT" maxOccurs="unbounded"/>
 *         &lt;element name="CEC" type="{http://www.waseel.com/wsdl/primary/wschema}CECCT"/>
 *         &lt;element name="roomType" type="{http://www.waseel.com/wsdl/primary/wschema}roomTypeST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyClassCT", propOrder = { "classCode", "classLimit",
		"benefit", "cec", "roomType" })
public class PolicyClassCT {

	@XmlElement(required = true)
	protected String classCode;
	@XmlElement(required = true)
	protected AmountST classLimit;
	@XmlElement(name = "Benefit", required = true)
	protected List<BenefitCT> benefit;
	@XmlElement(name = "CEC", required = true)
	protected CECCT cec;
	@XmlElement(required = true)
	protected RoomTypeST roomType;

	/**
	 * Gets the value of the classCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClassCode() {
		return classCode;
	}

	/**
	 * Sets the value of the classCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClassCode(String value) {
		this.classCode = value;
	}

	/**
	 * Gets the value of the classLimit property.
	 * 
	 * @return possible object is {@link AmountST }
	 * 
	 */
	public AmountST getClassLimit() {
		return classLimit;
	}

	/**
	 * Sets the value of the classLimit property.
	 * 
	 * @param value
	 *            allowed object is {@link AmountST }
	 * 
	 */
	public void setClassLimit(AmountST value) {
		this.classLimit = value;
	}

	/**
	 * Gets the value of the benefit property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the benefit property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getBenefit().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link BenefitCT }
	 * 
	 * 
	 */
	public List<BenefitCT> getBenefit() {
		if (benefit == null) {
			benefit = new ArrayList<BenefitCT>();
		}
		return this.benefit;
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
	 * Gets the value of the roomType property.
	 * 
	 * @return possible object is {@link RoomTypeST }
	 * 
	 */
	public RoomTypeST getRoomType() {
		return roomType;
	}

	/**
	 * Sets the value of the roomType property.
	 * 
	 * @param value
	 *            allowed object is {@link RoomTypeST }
	 * 
	 */
	public void setRoomType(RoomTypeST value) {
		this.roomType = value;
	}

}
