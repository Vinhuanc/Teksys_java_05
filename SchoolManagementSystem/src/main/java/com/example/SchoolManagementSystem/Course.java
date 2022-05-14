package com.example.SchoolManagementSystem;

import com.example.SchoolManagementSystem.Student;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private int cId;

	@Column(name = "name")
	private String cName;

	@Column(name = "instructor")
	private String cInstructorName;

	@ManyToMany(targetEntity = Course.class, cascade = CascadeType.ALL)
	List<Course> sCourses;

	public Course(Integer cId, String cName, String cInstructorName) {
		this.cId = cId;
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}

	public Course() {
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcInstructorName() {
		return cInstructorName;
	}

	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}

}