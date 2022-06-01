package com.example.cindychen.medication.capstone.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "RelatedInformation")
public class RelatedInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int medicationID;
	public int yearOfApproval;
	public long prescriptionQuantity;
	public String introduction;
	public String URL;

	public RelatedInformation(int medicationID, int yearOfApproval, long prescriptionQuantity, String introduction, String URL) {
		this.medicationID = medicationID;
		this.yearOfApproval = yearOfApproval;
		this.prescriptionQuantity = prescriptionQuantity;
		this.introduction = introduction;
		this.URL = URL;
	}

	public RelatedInformation() {
	}

	public int getMedicationID() {
		return medicationID;
	}

	public void setMedicationID(int medicationID) {
		this.medicationID = medicationID;
	}

	public int getYearOfApproval() {
		return yearOfApproval;
	}

	public void setYearOfApproval(int yearOfApproval) {
		this.yearOfApproval = yearOfApproval;
	}

	public long getprescriptionQuantity() {
		return prescriptionQuantity;
	}

	public void setprescriptionQuantity(long prescriptionQuantity) {
		this.prescriptionQuantity = prescriptionQuantity;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}
	
	

}
