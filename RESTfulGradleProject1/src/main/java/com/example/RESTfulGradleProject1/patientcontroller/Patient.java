package com.example.RESTfulGradleProject1.patientcontroller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "patient")
public class Patient {
	private String name;
	
	private int id;
	
	private String diseaseDescription;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	 @XmlElement
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	 @XmlElement
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the diseaseDescription
	 */
	public String getDiseaseDescription() {
		return diseaseDescription;
	}

	/**
	 * @param diseaseDescription the diseaseDescription to set
	 */
	 @XmlElement
	public void setDiseaseDescription(String diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}
	
	
	
	
}
