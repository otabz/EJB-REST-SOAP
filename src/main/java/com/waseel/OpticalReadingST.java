package com.waseel;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * Java class for opticalReadingST complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="opticalReadingST">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="geometry" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.waseel.com/wsdl/primary/wschema}geometryST">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="side" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.waseel.com/wsdl/primary/wschema}sideST">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="focus" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.waseel.com/wsdl/primary/wschema}focusST">
 *             &lt;enumeration value="NEAR"/>
 *             &lt;enumeration value="DISTANCE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opticalReadingST", propOrder = { "value" })
public class OpticalReadingST {

	@XmlValue
	protected BigDecimal value;
	@XmlAttribute(required = true)
	protected GeometryST geometry;
	@XmlAttribute(required = true)
	protected SideST side;
	@XmlAttribute(required = true)
	protected FocusST focus;

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setValue(BigDecimal value) {
		this.value = value;
	}

	/**
	 * Gets the value of the geometry property.
	 * 
	 * @return possible object is {@link GeometryST }
	 * 
	 */
	public GeometryST getGeometry() {
		return geometry;
	}

	/**
	 * Sets the value of the geometry property.
	 * 
	 * @param value
	 *            allowed object is {@link GeometryST }
	 * 
	 */
	public void setGeometry(GeometryST value) {
		this.geometry = value;
	}

	/**
	 * Gets the value of the side property.
	 * 
	 * @return possible object is {@link SideST }
	 * 
	 */
	public SideST getSide() {
		return side;
	}

	/**
	 * Sets the value of the side property.
	 * 
	 * @param value
	 *            allowed object is {@link SideST }
	 * 
	 */
	public void setSide(SideST value) {
		this.side = value;
	}

	/**
	 * Gets the value of the focus property.
	 * 
	 * @return possible object is {@link FocusST }
	 * 
	 */
	public FocusST getFocus() {
		return focus;
	}

	/**
	 * Sets the value of the focus property.
	 * 
	 * @param value
	 *            allowed object is {@link FocusST }
	 * 
	 */
	public void setFocus(FocusST value) {
		this.focus = value;
	}

}
