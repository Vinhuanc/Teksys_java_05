package jpa.mainrunner;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Persistence;
import com.example.SchoolManagementSystem.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import jpa.dao.StudentDAO;
import jpa.service.CourseService;
import com.example.SchoolManagementSystem.Course;

import jpa.service.StudentService;

public class SMSRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SMS");
		EntityManager em = emf.createEntityManager();
		// EntityManager em = new EntityManager();

		Student studentUser = new Student();
		CourseService courseService = new CourseService();
		StudentService studentService = new StudentService();

		Scanner userInput = new Scanner(System.in);
		System.out.println("Are you a(n):");
		System.out.println("1. Student");
		System.out.println("2. Quit");
		System.out.println("Please enter 1 or 2");
		int userChoice = userInput.nextInt();

		if (userChoice == 1) {
			System.out.println("Enter Your Email:");
			studentUser.setsEmail(userInput.next());
			System.out.println("Enter Your Password:");
			studentUser.setsPass(userInput.next());
			if (!studentService.validateStudent(em, studentUser.getsEmail(), studentUser.getsPass())) {
				System.out.print("Invalid username or password. Program has ended. Bye.\n");
			} else {
				System.out.println("1. Register to Class \n");
				System.out.println("2. Logout");
				int userInnerChoice = userInput.nextInt();
				if (userInnerChoice == 1) {
					courseService.showCourseList(courseService.getAllCourses(em));
					System.out.print(" \n What is the Course ID you like to register for?");
					int cIdUserToRegisterTo = userInput.nextInt();

					if (studentUser.getsCourses().contains(cIdUserToRegisterTo)) {
//						System.out.print("You already registered for that course.");
//					}
						studentService.registerStudentToCourse(em, studentUser.getsEmail(), cIdUserToRegisterTo);
//line 51, change to getcId()
//					
						System.out.println("Your courses:");
						courseService.showCourseList(studentService.getStudentCourses(em, studentUser.getsEmail()));
						System.out.print("You have been signed out.");

					} else if (userInnerChoice == 2) {
						System.out.print("You've been logged out.");
						userInput.close();
					}
				}
			}
		} else if (userChoice == 2) {
			System.out.print("Program has quitted. Goodbye.");
		}

	}

}
