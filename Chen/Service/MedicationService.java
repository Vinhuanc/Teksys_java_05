package com.example.New.Medication.Database.Cindy.Chen.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.New.Medication.Database.Cindy.Chen.Entity.Medication;
import com.example.New.Medication.Database.Cindy.Chen.Repository.MedicationRepository;

@Service
@Transactional
public class MedicationService {
	@Autowired
	private MedicationRepository medicationRepository;

	public Iterable<Medication> listAll() {
		return medicationRepository.findAll();
	}

	public void save(Medication medication) {
		medicationRepository.save(medication);
	}

	public Medication get(int medicationID) {
		return medicationRepository.findById(medicationID).get();
	}

	public void delete(int medicationID) {
		medicationRepository.deleteById(medicationID);
	}
}