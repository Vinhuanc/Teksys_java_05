package com.example.New.Medication.Database.Cindy.Chen.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.New.Medication.Database.Cindy.Chen.Entity.Medication;

public interface MedicationRepository extends CrudRepository<Medication, Integer>{

}


