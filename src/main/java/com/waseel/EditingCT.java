package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for EditingCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EditingCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canFollowUp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canCancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditingCT", propOrder = { "canFollowUp", "canCancel" })
public class EditingCT {

	protected boolean canFollowUp;
	protected boolean canCancel;

	/**
	 * Gets the value of the canFollowUp property.
	 * 
	 */
	public boolean isCanFollowUp() {
		return canFollowUp;
	}

	/**
	 * Sets the value of the canFollowUp property.
	 * 
	 */
	public void setCanFollowUp(boolean value) {
		this.canFollowUp = value;
	}

	/**
	 * Gets the value of the canCancel property.
	 * 
	 */
	public boolean isCanCancel() {
		return canCancel;
	}

	/**
	 * Sets the value of the canCancel property.
	 * 
	 */
	public void setCanCancel(boolean value) {
		this.canCancel = value;
	}

}
