package com.spring.hibernate.university.onetomany.entity;

import jakarta.persistence.*;

/**
 * @author akash.gond
 * @Project Practice_Spring_Boot
 * @Date 05032023 Copyright (C) 2023 Newcastle University, UK
 */
@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {
	// annotate the class as an entity and map to the db table
	// define tables
	// annotate the fields with db column names
	// create constructors
	// generate getter and setter
	// generate to string method

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private int id;

	@Column(name = "youtube_channel")
	private String youTubeChannel;
	@Column(name = "hobby")
	private String hobby;

	@OneToOne(mappedBy = "instructorDetail", cascade = CascadeType.ALL)
	private Instructor instructor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYouTubeChannel() {
		return youTubeChannel;
	}

	public void setYouTubeChannel(String youTubeChannel) {
		this.youTubeChannel = youTubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public InstructorDetail() {
	}


	public InstructorDetail(String youTubeChannel, String hobby) {
		this.youTubeChannel = youTubeChannel;
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "InstructorDetail{" + "id=" + id + ", youTubeChannel='" + youTubeChannel + '\'' + ", hobby='" + hobby + '\'' + '}';
	}
}
