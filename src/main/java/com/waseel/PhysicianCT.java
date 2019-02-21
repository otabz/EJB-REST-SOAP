package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PhysicianCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicianCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="physicianName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="physicianID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="physicianCategory" type="{http://www.waseel.com/wsdl/primary/wschema}physicianCategoryST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicianCT", propOrder = { "physicianName", "physicianID",
		"physicianCategory" })
public class PhysicianCT {

	@XmlElement(required = true)
	protected String physicianName;
	@XmlElement(required = true)
	protected String physicianID;
	@XmlElement(required = true)
	protected PhysicianCategoryST physicianCategory;

	/**
	 * Gets the value of the physicianName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhysicianName() {
		return physicianName;
	}

	/**
	 * Sets the value of the physicianName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhysicianName(String value) {
		this.physicianName = value;
	}

	/**
	 * Gets the value of the physicianID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhysicianID() {
		return physicianID;
	}

	/**
	 * Sets the value of the physicianID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhysicianID(String value) {
		this.physicianID = value;
	}

	/**
	 * Gets the value of the physicianCategory property.
	 * 
	 * @return possible object is {@link PhysicianCategoryST }
	 * 
	 */
	public PhysicianCategoryST getPhysicianCategory() {
		return physicianCategory;
	}

	/**
	 * Sets the value of the physicianCategory property.
	 * 
	 * @param value
	 *            allowed object is {@link PhysicianCategoryST }
	 * 
	 */
	public void setPhysicianCategory(PhysicianCategoryST value) {
		this.physicianCategory = value;
	}

}
