package com.example.cindychen.medication.capstone.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "MedicationUseInfo")
public class MedicationUseInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int medicationID;
	public String medicationClass;
	public String mainPurpose;

	public MedicationUseInfo(int medicationID, String medicationClass, String mainPurpose) {
		this.medicationID = medicationID;
		this.medicationClass = medicationClass;
		this.mainPurpose = mainPurpose;
	}

	public MedicationUseInfo() {
	}

	public int getMedicationID() {
		return medicationID;
	}

	public void setMedicationID(int medicationID) {
		this.medicationID = medicationID;
	}

	public String getMedicationClass() {
		return medicationClass;
	}

	public void setMedicationClass(String medicationClass) {
		this.medicationClass = medicationClass;
	}

	public String getMainPurpose() {
		return mainPurpose;
	}

	public void setMainPurpose(String mainPurpose) {
		this.mainPurpose = mainPurpose;
	}

}
