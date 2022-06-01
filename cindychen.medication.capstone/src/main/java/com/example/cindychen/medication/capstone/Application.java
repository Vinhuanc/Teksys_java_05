package com.example.cindychen.medication.capstone;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.example.cindychen.medication.capstone.models.MedicationInfo;
import com.example.cindychen.medication.capstone.models.MedicationUseInfo;
import com.example.cindychen.medication.capstone.models.RelatedInformation;
import com.example.cindychen.medication.capstone.models.SideEffects;

public class Application {

	public static void main(String[] args) {

		readMedications();
	}

//this method is created to get all the information from sql and to provide all the informations from each column

	public static void readMedications() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

//		MedicationInfo mi = new MedicationInfo();
//		MedicationUseInfo mui = new MedicationUseInfo();
//		RelatedInformation ri = new RelatedInformation();
//		SideEffects se = new SideEffects();

//	     String hql = "select mi.medicationID, mi.genericName, mi.brandName "
//					+ "mui.mainPurpose, mui.medicationClass,"
//					+ "ri.prescriptionQuantity, ri.yearOfApproval,"
//					+ "se.lowerBody,se.upperBody"
//					+ "from MedicationInfo mi "
//					+ "inner join MedicationUseInfo mui"
//					+ "on mi.medicationID = mui.medicationID"
//					+ "inner join RelatedInformation ri"
//					+ "on mui.medicationID = ri.medicationID"
//					+ "inner join SideEffects se"
//					+ "on ri.medicationID = se.medicationID";

//		String hql = "select mi.medicationID, mi.genericName, mi.brandName, mui.mainPurpose, mui.medicationClass,ri.prescriptionQuantity,
//	     ri.yearOfApproval,
//		se.lowerBody,se.upperBody
//		from MedicationInfo mi 
//		inner join MedicationUseInfo mui
//		on mi.medicationID = mui.medicationID
//		inner join RelatedInformation ri
//		on mui.medicationID = ri.medicationID
//		inner join SideEffects se
//		on ri.medicationID = se.medicationID";

//the "From MedicationInfo" string prints all the informations WITHIN the codes, I would like it to show at the very bottom.		
		String hql = "From MedicationInfo";
		Query query = session.createQuery(hql);
		List results = query.getResultList();
		
		t.commit();

		session.close();
		factory.close();
System.out.print(" \n *******************************************************************************************************************************");
System.out.print(results);
//select mi.medicationID, mi.genericName, mi.brandName, 
//mui.mainPurpose, mui.medicationClass,
//ri.prescriptionQuantity, ri.yearOfApproval,
//se.lowerBody,se.upperBody
//from MedicationInfo mi 
//inner join MedicationUseInfo mui
//on mi.medicationID = mui.medicationID
//inner join RelatedInformation ri
//on mui.medicationID = ri.medicationID
//inner join SideEffects se
//on ri.medicationID = se.medicationID

//			}
	}

}

//	}