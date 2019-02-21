package com.waseel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for InvestigationCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InvestigationCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="investigationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="investigationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="investigationDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="investigationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Observation" type="{http://www.waseel.com/wsdl/primary/wschema}ObservationCT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="investigationComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationCT", propOrder = { "investigationType",
		"investigationCode", "investigationDescription", "investigationDate",
		"observation", "investigationComments" })
public class InvestigationCT {

	@XmlElement(required = true)
	protected String investigationType;
	@XmlElement(required = true)
	protected String investigationCode;
	@XmlElement(required = true)
	protected String investigationDescription;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar investigationDate;
	@XmlElement(name = "Observation")
	protected List<ObservationCT> observation;
	protected String investigationComments;

	/**
	 * Gets the value of the investigationType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvestigationType() {
		return investigationType;
	}

	/**
	 * Sets the value of the investigationType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInvestigationType(String value) {
		this.investigationType = value;
	}

	/**
	 * Gets the value of the investigationCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvestigationCode() {
		return investigationCode;
	}

	/**
	 * Sets the value of the investigationCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInvestigationCode(String value) {
		this.investigationCode = value;
	}

	/**
	 * Gets the value of the investigationDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvestigationDescription() {
		return investigationDescription;
	}

	/**
	 * Sets the value of the investigationDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInvestigationDescription(String value) {
		this.investigationDescription = value;
	}

	/**
	 * Gets the value of the investigationDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getInvestigationDate() {
		return investigationDate;
	}

	/**
	 * Sets the value of the investigationDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setInvestigationDate(XMLGregorianCalendar value) {
		this.investigationDate = value;
	}

	/**
	 * Gets the value of the observation property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the observation property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getObservation().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ObservationCT }
	 * 
	 * 
	 */
	public List<ObservationCT> getObservation() {
		if (observation == null) {
			observation = new ArrayList<ObservationCT>();
		}
		return this.observation;
	}

	/**
	 * Gets the value of the investigationComments property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvestigationComments() {
		return investigationComments;
	}

	/**
	 * Sets the value of the investigationComments property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInvestigationComments(String value) {
		this.investigationComments = value;
	}

}
