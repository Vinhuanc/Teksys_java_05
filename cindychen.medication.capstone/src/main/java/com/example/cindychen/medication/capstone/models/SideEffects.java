package com.example.cindychen.medication.capstone.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SideEffects")
public class SideEffects implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int medicationID;
	public String upperBody;
	public String lowerBody;

	public SideEffects(int medicationID, String upperBody, String lowerBody) {
		this.medicationID = medicationID;
		this.upperBody = upperBody;
		this.lowerBody = lowerBody;
	}

	public SideEffects() {
	}

	public int getMedicationID() {
		return medicationID;
	}

	public void setMedicationID(int medicationID) {
		this.medicationID = medicationID;
	}

	public String getUpperBody() {
		return upperBody;
	}

	public void setUpperBody(String upperBody) {
		this.upperBody = upperBody;
	}

	public String getLowerBody() {
		return lowerBody;
	}

	public void setLowerBody(String lowerBody) {
		this.lowerBody = lowerBody;
	}

}
