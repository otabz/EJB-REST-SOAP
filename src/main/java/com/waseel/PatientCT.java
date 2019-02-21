package com.waseel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.Duration;

/**
 * <p>
 * Java class for PatientCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PatientCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>duration">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gender" type="{http://www.waseel.com/wsdl/primary/wschema}genderST"/>
 *         &lt;element name="nationality" type="{http://www.waseel.com/wsdl/primary/wschema}nationalityST"/>
 *         &lt;element name="patientFileNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatientCT", propOrder = { "patientName", "age", "gender",
		"nationality", "patientFileNumber", "contactNumber" })
public class PatientCT {

	protected String patientName;
	@XmlElement(required = true)
	protected PatientCT.Age age;
	@XmlElement(required = true)
	protected GenderST gender;
	@XmlElement(required = true)
	protected NationalityST nationality;
	@XmlElement(required = true)
	protected String patientFileNumber;
	protected String contactNumber;

	/**
	 * Gets the value of the patientName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * Sets the value of the patientName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPatientName(String value) {
		this.patientName = value;
	}

	/**
	 * Gets the value of the age property.
	 * 
	 * @return possible object is {@link PatientCT.Age }
	 * 
	 */
	public PatientCT.Age getAge() {
		return age;
	}

	/**
	 * Sets the value of the age property.
	 * 
	 * @param value
	 *            allowed object is {@link PatientCT.Age }
	 * 
	 */
	public void setAge(PatientCT.Age value) {
		this.age = value;
	}

	/**
	 * Gets the value of the gender property.
	 * 
	 * @return possible object is {@link GenderST }
	 * 
	 */
	public GenderST getGender() {
		return gender;
	}

	/**
	 * Sets the value of the gender property.
	 * 
	 * @param value
	 *            allowed object is {@link GenderST }
	 * 
	 */
	public void setGender(GenderST value) {
		this.gender = value;
	}

	/**
	 * Gets the value of the nationality property.
	 * 
	 * @return possible object is {@link NationalityST }
	 * 
	 */
	public NationalityST getNationality() {
		return nationality;
	}

	/**
	 * Sets the value of the nationality property.
	 * 
	 * @param value
	 *            allowed object is {@link NationalityST }
	 * 
	 */
	public void setNationality(NationalityST value) {
		this.nationality = value;
	}

	/**
	 * Gets the value of the patientFileNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPatientFileNumber() {
		return patientFileNumber;
	}

	/**
	 * Sets the value of the patientFileNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPatientFileNumber(String value) {
		this.patientFileNumber = value;
	}

	/**
	 * Gets the value of the contactNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * Sets the value of the contactNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContactNumber(String value) {
		this.contactNumber = value;
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
	 *   &lt;simpleContent>
	 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>duration">
	 *     &lt;/extension>
	 *   &lt;/simpleContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "value" })
	public static class Age {

		@XmlValue
		protected Duration value;

		/**
		 * Gets the value of the value property.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getValue() {
			return value;
		}

		/**
		 * Sets the value of the value property.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setValue(Duration value) {
			this.value = value;
		}

	}

}
