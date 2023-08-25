package com.spring.hibernate.university.onetomany;

import com.spring.hibernate.university.onetomany.entity.Course;
import com.spring.hibernate.university.onetomany.entity.Instructor;
import com.spring.hibernate.university.onetomany.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author akash.gond
 * @Project Practice_Spring_Boot
 * @Date 04032023 Copyright (C) 2023 Newcastle University, UK
 */
public class CreateInstructorDemo {
	public static void main(String[] args) {


		// create session factory
		SessionFactory sessionFactory = new Configuration().configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();

		//create session
		Session session = sessionFactory.getCurrentSession();
		try {
			// create student object
			Instructor instructor = new Instructor("Akash", "Gond", "akashgond3112");
			InstructorDetail instructorDetail = new InstructorDetail(
					"https://www.udemy.com/course/spring-hibernate-tutorial/learn/lecture/7668924#questions",
					"Singing");

			instructor.setInstructorDetail(instructorDetail);

			//start transaction
			session.beginTransaction();
			//save the student object
			session.save(instructor);
			//commit transaction
			session.getTransaction().commit();

		} finally {
			session.close();
			sessionFactory.close();
		}

	}
}
