package jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.example.SchoolManagementSystem.Course;

public interface CourseDAO {

	public List<Course> getAllCourses(EntityManager em);
}
