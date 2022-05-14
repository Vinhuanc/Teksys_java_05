package jpa.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.example.SchoolManagementSystem.Course;
import com.example.SchoolManagementSystem.Student;

public interface StudentDAO {

	
	public List<Student> getAllStudents(EntityManager em);

	public List<Course> getStudentCourses(EntityManager em, String sEmail);
	public Student getStudentByEmail(EntityManager em, String sEmail); 
	
	public void registerStudentToCourse(EntityManager em, String sEmail, int cId);
	public boolean validateStudent(EntityManager em, String sEmail, String sPassword);
	
	

	
	
	
	
	
}