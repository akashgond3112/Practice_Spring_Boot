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
public class CreateCourseDemo {
	public static void main(String[] args) {


		// create session factory
		SessionFactory sessionFactory = new Configuration().configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		//create session
		Session session = sessionFactory.getCurrentSession();
		try {
			//start transaction
			session.beginTransaction();

			// create student object
			Instructor instructor = session.get(Instructor.class, 3);

			Course course1 = new Course("Anatomy and physiology");
			Course course2 = new Course("Biology");
			Course course3 = new Course("Mathematics");
			Course course4 = new Course("Algebra");

			instructor.add(course1);
			instructor.add(course2);
			instructor.add(course3);
			instructor.add(course4);

			//save the instructor object
			session.save(course1);
			session.save(course2);
			session.save(course3);
			session.save(course4);
			//commit transaction
			session.getTransaction().commit();

		} finally {
			session.close();
			sessionFactory.close();
		}

	}
}
