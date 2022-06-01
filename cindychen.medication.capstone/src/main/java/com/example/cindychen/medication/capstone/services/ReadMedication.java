package com.example.cindychen.medication.capstone.services;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadMedication {
	public static void readMedications() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
			
		String hql ="select mi.medicationID, mi.genericName, mi.brandName, \n"
				+ "		mui.mainPurpose, mui.medicationClass,\n"
				+ "		ri.prescriptionQuantity, ri.yearOfApproval,\n"
				+ "		se.lowerBody,se.upperBody\n"
				+ "		from MedicationInfo mi \n"
				+ "		inner join MedicationUseInfo mui\n"
				+ "		on mi.medicationID = mui.medicationID\n"
				+ "		inner join RelatedInformation ri\n"
				+ "		on mui.medicationID = ri.medicationID\n"
				+ "		inner join SideEffects se\n"
				+ "		on ri.medicationID = se.medicationID";
		
		Query query = session.createQuery(hql);
		List allMedications = query.getResultList();
		
		System.out.print(allMedications);
		

		
	}
}
