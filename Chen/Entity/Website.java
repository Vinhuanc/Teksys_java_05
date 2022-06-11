package com.example.New.Medication.Database.Cindy.Chen.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Website")
public class Website implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer medicationID;
	public String websiteURL;

	public Website(Integer medicationID, String websiteURL) {
		this.medicationID = medicationID;
		this.websiteURL = websiteURL;
	}

	public Website() {
	}

	public Integer getMedicationID() {
		return medicationID;
	}

	public void setMedicationID(Integer medicationID) {
		this.medicationID = medicationID;
	}

	public String getWebsiteURL() {
		return websiteURL;
	}

	public void setWebsiteURL(String websiteURL) {
		this.websiteURL = websiteURL;
	}

}
