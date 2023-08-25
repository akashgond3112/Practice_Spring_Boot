package com.spring.hibernate.demo;

import com.spring.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author akash.gond
 * @Project Practice_Spring_Boot
 * @Date 04032023 Copyright (C) 2023 Newcastle University, UK
 */
public class ReadStudentDemo {
	public static void main(String[] args) {


		// create session factory
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();

		//create session
		Session session = sessionFactory.getCurrentSession();
		try {
			// create student object
			Student student = new Student("Vikash", "Gond", "vikashond3112");

			//start transaction
			session.beginTransaction();
			//save the student object
			session.save(student);
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Saved student generated id :" + student.getId());


			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Student myStudent = session.get(Student.class, student.getId());
			System.out.println("my student :" + myStudent);
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}
}
