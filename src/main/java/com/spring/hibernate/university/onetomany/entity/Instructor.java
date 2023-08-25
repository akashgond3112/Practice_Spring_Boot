package com.spring.hibernate.university.onetomany.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author akash.gond
 * @Project Practice_Spring_Boot
 * @Date 05032023 Copyright (C) 2023 Newcastle University, UK
 */
@Entity
@Table(name = "instructor")
public class Instructor {
	// annotate the class as an entity and map to the db table
	// define tables
	// annotate the fields with db column names
	// ** setup mapping between tables **
	// create constructors
	// generate getter and setter
	// generate to string method

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_id")
	private InstructorDetail instructorDetail;
	@OneToMany(mappedBy = "instructor", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private List<Course> courseList;

	public Instructor() {
	}

	public Instructor(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InstructorDetail getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(InstructorDetail instructorDetail) {
		this.instructorDetail = instructorDetail;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public void add(Course course) {
		if (courseList == null) {
			courseList = new ArrayList<>();
		}

		courseList.add(course);
		course.setInstructor(this);
	}

	@Override
	public String toString() {
		return "Instructor{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", instructorDetail=" + instructorDetail + '}';
	}
}
