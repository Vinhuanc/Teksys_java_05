package com.example.New.Medication.Database.Cindy.Chen.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.New.Medication.Database.Cindy.Chen.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User findByEmail(String email);
}

