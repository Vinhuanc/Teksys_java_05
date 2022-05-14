
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.SchoolManagementSystem.Student;

import jpa.service.StudentService;




public class Testing {
	
	@Test
	public void testValidateStudent() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SMS");
		EntityManager em = emf.createEntityManager();
		StudentService testCase = new StudentService();
		
		boolean student1 = testCase.validateStudent(em,"htaffley6@columbia.edu", "xowtOQ");
		boolean student2 = testCase.validateStudent(em,"cstartin3@flickr.com", "randomPassword");
		
		em.close();
		emf.close();
		
		Assert.isTrue(student1);
		Assert.isTrue(student2);

	}

}

