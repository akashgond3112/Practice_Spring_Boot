package com.spring.hibernate.university.onetomany.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author akash.gond
 * @Project Practice_Spring_Boot
 * @Date 06032023 Copyright (C) 2023 Newcastle University, UK
 */
@Entity
@Table(name = "course")
public class Course {
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

	@Column(name = "title")
	private String title;

	@ManyToOne(cascade = { 	CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name = "instructor_id")
	private Instructor instructor;

	public Course() {
	}

	public Course(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Course{" + "id=" + id + ", title='" + title + '\'' + ", instructor=" + instructor + '}';
	}
}
