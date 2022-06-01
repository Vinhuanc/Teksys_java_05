package com.example.cindychen.medication.capstone.services;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Services {

	public static void getAllMedications() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		String hql ="select genericName, brandName\n"
				+ "from MedicationInfo";
		
		Query query = session.createQuery(hql);
		List allMedications = query.getResultList();
//		return allMedications;
//		System.out.printf("%s, %s","genericName, brandName");
	}
	
}
