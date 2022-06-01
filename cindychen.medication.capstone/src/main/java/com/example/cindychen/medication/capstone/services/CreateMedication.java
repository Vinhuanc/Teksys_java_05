package com.example.cindychen.medication.capstone.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.cindychen.medication.capstone.models.MedicationInfo;
import com.example.cindychen.medication.capstone.models.MedicationUseInfo;
import com.example.cindychen.medication.capstone.models.RelatedInformation;
import com.example.cindychen.medication.capstone.models.SideEffects;
//this class is created to add medications to the database
public class CreateMedication {
	//this method is created to add a new medication to the list
	
	public static void createMedication(String genericName, String brandName, String medicationClass,
			String mainPurpose, int yearOfApproval, long prescriptionQuantity, String introduction,  String upperBody, String lowerBody, String URL) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		MedicationInfo MedicationInfo = new MedicationInfo();
		MedicationUseInfo MedicationUseInfo = new MedicationUseInfo();
		RelatedInformation RelatedInformation = new RelatedInformation();
		SideEffects SideEffects = new SideEffects();

		MedicationInfo.setGenericName(genericName);
		MedicationInfo.setBrandName(brandName);
		MedicationUseInfo.setMedicationClass(medicationClass);
		MedicationUseInfo.setMainPurpose(mainPurpose);
		RelatedInformation.setYearOfApproval(yearOfApproval);
		RelatedInformation.setprescriptionQuantity(prescriptionQuantity);		
		RelatedInformation.setIntroduction(introduction);
		RelatedInformation.setURL(URL);
		SideEffects.setUpperBody(upperBody);
		SideEffects.setLowerBody(lowerBody);

		session.save(MedicationInfo);
		session.save(MedicationUseInfo);
		session.save(RelatedInformation);
		session.save(SideEffects);

		t.commit();
		session.close();
		factory.close();

	}
}
