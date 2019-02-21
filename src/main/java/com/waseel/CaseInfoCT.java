package com.waseel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for CaseInfoCT complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CaseInfoCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseType" type="{http://www.waseel.com/wsdl/primary/wschema}caseTypeST"/>
 *         &lt;element name="physician" type="{http://www.waseel.com/wsdl/primary/wschema}PhysicianCT" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://www.waseel.com/wsdl/primary/wschema}PatientCT"/>
 *         &lt;element name="caseDescription">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bloodPressure" type="{http://www.waseel.com/wsdl/primary/wschema}bloodPressureST" minOccurs="0"/>
 *                   &lt;element name="temperature" type="{http://www.waseel.com/wsdl/primary/wschema}temperatureST" minOccurs="0"/>
 *                   &lt;element name="pulse" type="{http://www.waseel.com/wsdl/primary/wschema}pulseST" minOccurs="0"/>
 *                   &lt;element name="respRate" type="{http://www.waseel.com/wsdl/primary/wschema}respRateST" minOccurs="0"/>
 *                   &lt;element name="weight" type="{http://www.waseel.com/wsdl/primary/wschema}weightST"/>
 *                   &lt;element name="LMP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="IllnessCategory">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="inllnessCode" type="{http://www.waseel.com/wsdl/primary/wschema}illnessCodeST" maxOccurs="8" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="illnessDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                   &lt;element name="Diagnosis" type="{http://www.waseel.com/wsdl/primary/wschema}DiagnosisCT" maxOccurs="unbounded"/>
 *                   &lt;element name="Optics" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="reading" maxOccurs="10" minOccurs="2">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.waseel.com/wsdl/primary/wschema>opticalReadingST">
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Investigation" type="{http://www.waseel.com/wsdl/primary/wschema}InvestigationCT" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="chiefComplaintSymptoms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="signicantSigns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="possibleLineOfTreatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="radiologyReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseInfoCT", propOrder = { "caseType", "physician", "patient",
		"caseDescription", "possibleLineOfTreatment", "otherConditions",
		"radiologyReport" })
public class CaseInfoCT {

	@XmlElement(required = true)
	protected CaseTypeST caseType;
	protected PhysicianCT physician;
	@XmlElement(required = true)
	protected PatientCT patient;
	@XmlElement(required = true)
	protected CaseInfoCT.CaseDescription caseDescription;
	protected String possibleLineOfTreatment;
	protected String otherConditions;
	protected String radiologyReport;

	/**
	 * Gets the value of the caseType property.
	 * 
	 * @return possible object is {@link CaseTypeST }
	 * 
	 */
	public CaseTypeST getCaseType() {
		return caseType;
	}

	/**
	 * Sets the value of the caseType property.
	 * 
	 * @param value
	 *            allowed object is {@link CaseTypeST }
	 * 
	 */
	public void setCaseType(CaseTypeST value) {
		this.caseType = value;
	}

	/**
	 * Gets the value of the physician property.
	 * 
	 * @return possible object is {@link PhysicianCT }
	 * 
	 */
	public PhysicianCT getPhysician() {
		return physician;
	}

	/**
	 * Sets the value of the physician property.
	 * 
	 * @param value
	 *            allowed object is {@link PhysicianCT }
	 * 
	 */
	public void setPhysician(PhysicianCT value) {
		this.physician = value;
	}

	/**
	 * Gets the value of the patient property.
	 * 
	 * @return possible object is {@link PatientCT }
	 * 
	 */
	public PatientCT getPatient() {
		return patient;
	}

	/**
	 * Sets the value of the patient property.
	 * 
	 * @param value
	 *            allowed object is {@link PatientCT }
	 * 
	 */
	public void setPatient(PatientCT value) {
		this.patient = value;
	}

	/**
	 * Gets the value of the caseDescription property.
	 * 
	 * @return possible object is {@link CaseInfoCT.CaseDescription }
	 * 
	 */
	public CaseInfoCT.CaseDescription getCaseDescription() {
		return caseDescription;
	}

	/**
	 * Sets the value of the caseDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link CaseInfoCT.CaseDescription }
	 * 
	 */
	public void setCaseDescription(CaseInfoCT.CaseDescription value) {
		this.caseDescription = value;
	}

	/**
	 * Gets the value of the possibleLineOfTreatment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPossibleLineOfTreatment() {
		return possibleLineOfTreatment;
	}

	/**
	 * Sets the value of the possibleLineOfTreatment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPossibleLineOfTreatment(String value) {
		this.possibleLineOfTreatment = value;
	}

	/**
	 * Gets the value of the otherConditions property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOtherConditions() {
		return otherConditions;
	}

	/**
	 * Sets the value of the otherConditions property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOtherConditions(String value) {
		this.otherConditions = value;
	}

	/**
	 * Gets the value of the radiologyReport property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRadiologyReport() {
		return radiologyReport;
	}

	/**
	 * Sets the value of the radiologyReport property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRadiologyReport(String value) {
		this.radiologyReport = value;
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
	 *         &lt;element name="bloodPressure" type="{http://www.waseel.com/wsdl/primary/wschema}bloodPressureST" minOccurs="0"/>
	 *         &lt;element name="temperature" type="{http://www.waseel.com/wsdl/primary/wschema}temperatureST" minOccurs="0"/>
	 *         &lt;element name="pulse" type="{http://www.waseel.com/wsdl/primary/wschema}pulseST" minOccurs="0"/>
	 *         &lt;element name="respRate" type="{http://www.waseel.com/wsdl/primary/wschema}respRateST" minOccurs="0"/>
	 *         &lt;element name="weight" type="{http://www.waseel.com/wsdl/primary/wschema}weightST"/>
	 *         &lt;element name="LMP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
	 *         &lt;element name="IllnessCategory">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="inllnessCode" type="{http://www.waseel.com/wsdl/primary/wschema}illnessCodeST" maxOccurs="8" minOccurs="0"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="illnessDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
	 *         &lt;element name="Diagnosis" type="{http://www.waseel.com/wsdl/primary/wschema}DiagnosisCT" maxOccurs="unbounded"/>
	 *         &lt;element name="Optics" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="reading" maxOccurs="10" minOccurs="2">
	 *                     &lt;complexType>
	 *                       &lt;simpleContent>
	 *                         &lt;extension base="&lt;http://www.waseel.com/wsdl/primary/wschema>opticalReadingST">
	 *                         &lt;/extension>
	 *                       &lt;/simpleContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Investigation" type="{http://www.waseel.com/wsdl/primary/wschema}InvestigationCT" maxOccurs="unbounded" minOccurs="0"/>
	 *         &lt;element name="chiefComplaintSymptoms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="signicantSigns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "bloodPressure", "temperature", "pulse",
			"respRate", "weight", "lmp", "illnessCategory", "illnessDuration",
			"diagnosis", "optics", "investigation", "chiefComplaintSymptoms",
			"signicantSigns" })
	public static class CaseDescription {

		protected String bloodPressure;
		protected BigDecimal temperature;
		protected BigDecimal pulse;
		protected BigDecimal respRate;
		@XmlElement(required = true)
		protected BigDecimal weight;
		@XmlElement(name = "LMP")
		@XmlSchemaType(name = "date")
		protected XMLGregorianCalendar lmp;
		@XmlElement(name = "IllnessCategory", required = true)
		protected CaseInfoCT.CaseDescription.IllnessCategory illnessCategory;
		@XmlElement(required = true)
		protected Duration illnessDuration;
		@XmlElement(name = "Diagnosis", required = true)
		protected List<DiagnosisCT> diagnosis;
		@XmlElement(name = "Optics")
		protected CaseInfoCT.CaseDescription.Optics optics;
		@XmlElement(name = "Investigation")
		protected List<InvestigationCT> investigation;
		protected String chiefComplaintSymptoms;
		protected String signicantSigns;

		/**
		 * Gets the value of the bloodPressure property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getBloodPressure() {
			return bloodPressure;
		}

		/**
		 * Sets the value of the bloodPressure property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setBloodPressure(String value) {
			this.bloodPressure = value;
		}

		/**
		 * Gets the value of the temperature property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getTemperature() {
			return temperature;
		}

		/**
		 * Sets the value of the temperature property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setTemperature(BigDecimal value) {
			this.temperature = value;
		}

		/**
		 * Gets the value of the pulse property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getPulse() {
			return pulse;
		}

		/**
		 * Sets the value of the pulse property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setPulse(BigDecimal value) {
			this.pulse = value;
		}

		/**
		 * Gets the value of the respRate property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getRespRate() {
			return respRate;
		}

		/**
		 * Sets the value of the respRate property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setRespRate(BigDecimal value) {
			this.respRate = value;
		}

		/**
		 * Gets the value of the weight property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getWeight() {
			return weight;
		}

		/**
		 * Sets the value of the weight property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setWeight(BigDecimal value) {
			this.weight = value;
		}

		/**
		 * Gets the value of the lmp property.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getLMP() {
			return lmp;
		}

		/**
		 * Sets the value of the lmp property.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setLMP(XMLGregorianCalendar value) {
			this.lmp = value;
		}

		/**
		 * Gets the value of the illnessCategory property.
		 * 
		 * @return possible object is
		 *         {@link CaseInfoCT.CaseDescription.IllnessCategory }
		 * 
		 */
		public CaseInfoCT.CaseDescription.IllnessCategory getIllnessCategory() {
			return illnessCategory;
		}

		/**
		 * Sets the value of the illnessCategory property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link CaseInfoCT.CaseDescription.IllnessCategory }
		 * 
		 */
		public void setIllnessCategory(
				CaseInfoCT.CaseDescription.IllnessCategory value) {
			this.illnessCategory = value;
		}

		/**
		 * Gets the value of the illnessDuration property.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getIllnessDuration() {
			return illnessDuration;
		}

		/**
		 * Sets the value of the illnessDuration property.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setIllnessDuration(Duration value) {
			this.illnessDuration = value;
		}

		/**
		 * Gets the value of the diagnosis property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the diagnosis property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getDiagnosis().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link DiagnosisCT }
		 * 
		 * 
		 */
		public List<DiagnosisCT> getDiagnosis() {
			if (diagnosis == null) {
				diagnosis = new ArrayList<DiagnosisCT>();
			}
			return this.diagnosis;
		}

		/**
		 * Gets the value of the optics property.
		 * 
		 * @return possible object is {@link CaseInfoCT.CaseDescription.Optics }
		 * 
		 */
		public CaseInfoCT.CaseDescription.Optics getOptics() {
			return optics;
		}

		/**
		 * Sets the value of the optics property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link CaseInfoCT.CaseDescription.Optics }
		 * 
		 */
		public void setOptics(CaseInfoCT.CaseDescription.Optics value) {
			this.optics = value;
		}

		/**
		 * Gets the value of the investigation property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the investigation property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getInvestigation().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link InvestigationCT }
		 * 
		 * 
		 */
		public List<InvestigationCT> getInvestigation() {
			if (investigation == null) {
				investigation = new ArrayList<InvestigationCT>();
			}
			return this.investigation;
		}

		/**
		 * Gets the value of the chiefComplaintSymptoms property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getChiefComplaintSymptoms() {
			return chiefComplaintSymptoms;
		}

		/**
		 * Sets the value of the chiefComplaintSymptoms property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setChiefComplaintSymptoms(String value) {
			this.chiefComplaintSymptoms = value;
		}

		/**
		 * Gets the value of the signicantSigns property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSignicantSigns() {
			return signicantSigns;
		}

		/**
		 * Sets the value of the signicantSigns property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSignicantSigns(String value) {
			this.signicantSigns = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="inllnessCode" type="{http://www.waseel.com/wsdl/primary/wschema}illnessCodeST" maxOccurs="8" minOccurs="0"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "inllnessCode" })
		public static class IllnessCategory {

			protected List<IllnessCodeST> inllnessCode;

			/**
			 * Gets the value of the inllnessCode property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the inllnessCode property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getInllnessCode().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link IllnessCodeST }
			 * 
			 * 
			 */
			public List<IllnessCodeST> getInllnessCode() {
				if (inllnessCode == null) {
					inllnessCode = new ArrayList<IllnessCodeST>();
				}
				return this.inllnessCode;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="reading" maxOccurs="10" minOccurs="2">
		 *           &lt;complexType>
		 *             &lt;simpleContent>
		 *               &lt;extension base="&lt;http://www.waseel.com/wsdl/primary/wschema>opticalReadingST">
		 *               &lt;/extension>
		 *             &lt;/simpleContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "reading" })
		public static class Optics {

			@XmlElement(required = true)
			protected List<CaseInfoCT.CaseDescription.Optics.Reading> reading;

			/**
			 * Gets the value of the reading property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the reading property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getReading().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link CaseInfoCT.CaseDescription.Optics.Reading }
			 * 
			 * 
			 */
			public List<CaseInfoCT.CaseDescription.Optics.Reading> getReading() {
				if (reading == null) {
					reading = new ArrayList<CaseInfoCT.CaseDescription.Optics.Reading>();
				}
				return this.reading;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;simpleContent>
			 *     &lt;extension base="&lt;http://www.waseel.com/wsdl/primary/wschema>opticalReadingST">
			 *     &lt;/extension>
			 *   &lt;/simpleContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "")
			public static class Reading extends OpticalReadingST {

			}

		}

	}

}
