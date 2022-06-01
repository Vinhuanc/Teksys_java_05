package com.example.cindychen.medication.capstone.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.cindychen.medication.capstone.models.MedicationInfo;
import com.example.cindychen.medication.capstone.models.MedicationUseInfo;
import com.example.cindychen.medication.capstone.models.RelatedInformation;
import com.example.cindychen.medication.capstone.models.SideEffects;
//this class is created to delete a medication


public class DeleteMedication {
	// this method is to delete medications that the user wanted to delete
	// May 20th, update, it works!!!
	
	//@DELETEMAPPING (value="/delete/{id}" )@Pathvariable( int id)onto the deleteMedication method
	public static void deleteMedication( int medicationID) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		MedicationInfo MedicationInfo = new MedicationInfo();
		MedicationUseInfo MedicationUseInfo = new MedicationUseInfo();
		RelatedInformation RelatedInformation = new RelatedInformation();
		SideEffects SideEffects = new SideEffects();

		MedicationInfo IDToDelete = (MedicationInfo) session.load(MedicationInfo.class, medicationID);
		MedicationUseInfo IDToDelete2 = (MedicationUseInfo) session.load(MedicationUseInfo.class, medicationID);
		RelatedInformation IDToDelete3 = (RelatedInformation) session.load(RelatedInformation.class, medicationID);
		SideEffects IDToDelete4 = (SideEffects) session.load(SideEffects.class, medicationID);
		session.delete(IDToDelete);
		session.delete(IDToDelete2);
		session.delete(IDToDelete3);
		session.delete(IDToDelete4);

		t.commit();
		session.close();
		factory.close();
	}
}
