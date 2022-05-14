package jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.example.SchoolManagementSystem.Course;
import com.example.SchoolManagementSystem.Student;

import jpa.dao.StudentDAO;

public class StudentService implements StudentDAO {

	@Override
	public Student getStudentByEmail(EntityManager em, String sEmail) {
		Student certainStudent = em.find(Student.class, sEmail);
		return certainStudent;
	}

	@Override
	public List<Student> getAllStudents(EntityManager em) {

		Query query1 = em.createQuery("Select name from Student");
		List<Student> listOfStudents = query1.getResultList();
		return listOfStudents;
	}

	@Override
	public List<Course> getStudentCourses(EntityManager em, String sEmail) {
		Student certainStudent = getStudentByEmail(em, sEmail);
		List<Course> studentCourses = certainStudent.getsCourses();
		return studentCourses;

	}

	@Override
	public void registerStudentToCourse(EntityManager em, String sEmail, int cId) {
		Student certainStudent = getStudentByEmail(em, sEmail);
		List<Course> studentCourses = certainStudent.getsCourses();
		Course certainCourse = CourseService.getCourseById(em, cId);
		if (studentCourses.contains(certainCourse)) {
			System.out.print("You already registered for this course.");
		} else {
			studentCourses.add(certainCourse);
			em.getTransaction().begin();
			em.persist(certainStudent);
			em.getTransaction().commit();
		}
	}

	@Override
	public boolean validateStudent(EntityManager em, String sEmail, String sPassword) {
		Student certainStudent = getStudentByEmail(em, sEmail);
		if (certainStudent.getsEmail().equals(sEmail) && certainStudent.getsPass().equals(sPassword)) {
			System.out.println("Student is found.");
			return true;
		} else if (certainStudent.getsEmail() != sEmail || certainStudent.getsEmail() != sEmail) {
			System.out.println("Student is not found.");

		}
		return false;
	}

}
