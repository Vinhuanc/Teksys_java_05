package com.example.SchoolManagementSystem;



import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name= "Student")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name = "email")
		private String sEmail;
		
		@Column(name="name")
		private String sName;
		
		@Column(name="password")
		private String sPass;
		
		@OneToMany(targetEntity =Student.class, cascade = CascadeType.ALL)
		List<Course> sCourses;
		// change back to <Course>
		
	public Student(String sEmail, String sName, String sPass,  List<Course> sCourses) { 
		this.sEmail=sEmail;
		this.sName=sName;
		this.sPass=sPass;
		this.sCourses=sCourses;
	}
	public Student() {}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsPass() {
		return sPass;
	}
	public void setsPass(String sPass) {
		this.sPass = sPass;
	}
	public List<Course> getsCourses() {
		return sCourses;
	}
	public void setsCourses(List sCourses) {
		this.sCourses = sCourses;
	};
	

	
	
		

}
