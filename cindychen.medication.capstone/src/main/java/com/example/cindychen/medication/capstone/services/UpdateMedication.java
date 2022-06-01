package com.example.cindychen.medication.capstone.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.cindychen.medication.capstone.models.MedicationInfo;
import com.example.cindychen.medication.capstone.models.MedicationUseInfo;
import com.example.cindychen.medication.capstone.models.RelatedInformation;
import com.example.cindychen.medication.capstone.models.SideEffects;
//this class is created to update a medication information
public class UpdateMedication {
	// this method is created to update the prescriptionQuantity of the medication
		// user wanted to update, as the prescription quantity of medications are
		// constantly
		// changing, may increase or decrease
		// Other columns don't need to be updated as all the informations are official,
		// declared with officials/governments, or published with many researchers to
		// prove its validation. Only the number of prescription amount is constantly
		// changing
		// May 20th, update, it works!!!
	
	public static void updateMedication(int medicationID, long prescriptionQuantity) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

//		MedicationInfo MedicationInfo = new MedicationInfo();
//		MedicationUseInfo MedicationUseInfo = new MedicationUseInfo();
//		RelatedInformation RelatedInformation = new RelatedInformation();
//		SideEffects SideEffects = new SideEffects();

		RelatedInformation medToUpdate = (RelatedInformation) session.get(RelatedInformation.class, medicationID);
		medToUpdate.setprescriptionQuantity(prescriptionQuantity);
		session.save(medToUpdate);
		t.commit();
		session.close();
		factory.close();

	}
}
