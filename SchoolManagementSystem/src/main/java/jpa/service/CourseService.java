package jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.example.SchoolManagementSystem.Course;

import jpa.dao.CourseDAO;

public class CourseService implements CourseDAO {

	public void showCourseList(List<Course> courseList) {
		System.out.printf("%s, %s, %s ", "#", "COURSE", "INSTRUCTOR \n");
		for (Course c : courseList) {
			System.out.printf("%s, %s, %s ", c.getcId(), c.getcName(), c.getcInstructorName());
		}
	}

	public List<Course> getAllCourses(EntityManager em) {
		Query query2 = em.createQuery("From Course");
		List<Course> listOfCourses = query2.getResultList();
		return listOfCourses;
	}

	public static Course getCourseById(EntityManager em, int cId) {

		Course certainCourse = em.find(Course.class, cId);
		return certainCourse;
	}

}