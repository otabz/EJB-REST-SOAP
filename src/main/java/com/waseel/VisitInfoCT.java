package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for visitInfoCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="visitInfoCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="visitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="departmentCode" type="{http://www.waseel.com/wsdl/primary/wschema}departmentCodeST"/>
 *         &lt;element name="visitType" type="{http://www.waseel.com/wsdl/primary/wschema}visitTypeST" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visitInfoCT", propOrder = { "visitDate", "departmentCode",
		"visitType" })
public class VisitInfoCT {

	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar visitDate;
	@XmlElement(required = true)
	protected DepartmentCodeST departmentCode;
	protected VisitTypeST visitType;

	/**
	 * Gets the value of the visitDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getVisitDate() {
		return visitDate;
	}

	/**
	 * Sets the value of the visitDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setVisitDate(XMLGregorianCalendar value) {
		this.visitDate = value;
	}

	/**
	 * Gets the value of the departmentCode property.
	 * 
	 * @return possible object is {@link DepartmentCodeST }
	 * 
	 */
	public DepartmentCodeST getDepartmentCode() {
		return departmentCode;
	}

	/**
	 * Sets the value of the departmentCode property.
	 * 
	 * @param value
	 *            allowed object is {@link DepartmentCodeST }
	 * 
	 */
	public void setDepartmentCode(DepartmentCodeST value) {
		this.departmentCode = value;
	}

	/**
	 * Gets the value of the visitType property.
	 * 
	 * @return possible object is {@link VisitTypeST }
	 * 
	 */
	public VisitTypeST getVisitType() {
		return visitType;
	}

	/**
	 * Sets the value of the visitType property.
	 * 
	 * @param value
	 *            allowed object is {@link VisitTypeST }
	 * 
	 */
	public void setVisitType(VisitTypeST value) {
		this.visitType = value;
	}

}
