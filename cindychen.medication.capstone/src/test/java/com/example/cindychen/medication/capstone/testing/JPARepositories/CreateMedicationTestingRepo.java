package com.example.cindychen.medication.capstone.testing.JPARepositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.cindychen.medication.capstone.models.MedicationInfo;
import com.example.cindychen.medication.capstone.models.MedicationUseInfo;
import com.example.cindychen.medication.capstone.models.RelatedInformation;
import com.example.cindychen.medication.capstone.models.SideEffects;

public class CreateMedicationTestingRepo {
//	private static SessionFactory sessionFactory;
//    private Session session;
//   //************************  
//    //life cycle methods in JUnit, fits the life cycle requirement of JUnit
//    @BeforeAll
//    public static void setup() {
//        sessionFactory = HibernateUtil.getSessionFactory();
//        System.out.println("SessionFactory created");
//    }
//     
//    @AfterAll
//    public static void tearDown() {
//        if (sessionFactory != null) sessionFactory.close();
//        System.out.println("SessionFactory destroyed");
//    }
//    @BeforeEach
//    public void openSession() {
//        session = sessionFactory.openSession();
//        System.out.println("Session created");
//    }
//     
//    @AfterEach
//    public void closeSession() {
//        if (session != null) session.close();
//        System.out.println("Session closed\n");
//    }  
//    
//    //************************
    
	
	
	private static MedicationInfo medicationInfo;
	
	@BeforeAll
	public static void setUp() {
		medicationInfo = new MedicationInfo();
	}
	
	
	@Test public void testCreateMedication() {
		System.out.print("Running create medication test...");
		
		MedicationInfo trialOne = new MedicationInfo();
		trialOne.setMedicationID(5000);
		trialOne.setGenericName("Fluoxetine");
		trialOne.setBrandName("Prozac");
		MedicationInfo testTrialOne = medicationInfo.getBrandName("Prozac");
				
		assertEquals(trialOne.getGenericName(), actual.getGenericName());
		

	
	}
}
