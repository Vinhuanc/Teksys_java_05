package com.example.New.Medication.Database.Cindy.Chen.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.New.Medication.Database.Cindy.Chen.UserRegistrationDto;
import com.example.New.Medication.Database.Cindy.Chen.Entity.User;



public interface UserService extends UserDetailsService {
   User findByEmail(String email);
   User save(UserRegistrationDto registration);
}