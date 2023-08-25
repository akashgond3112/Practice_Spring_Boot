package com.spring.hibernate.demo;

import com.spring.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * @author akash.gond
 * @Project Practice_Spring_Boot
 * @Date 04032023 Copyright (C) 2023 Newcastle University, UK
 */
public class QueryStudentDemo {
	public static void main(String[] args) {


		// create session factory
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();

		//create session
		Session session = sessionFactory.getCurrentSession();
		try {
			// create student object
			Student student1 = new Student("Jhon", "A", "malinator101.com");
			Student student2 = new Student("Alex", "G", "malinator102.com");
			Student student3 = new Student("Ryan", "FA", "malinator103.com");
			Student student4 = new Student("Piyush", "AS", "malinator104.com");

			//start transaction
			session.beginTransaction();
			//save the student object
			session.save(student1);
			session.save(student2);
			session.save(student3);
			session.save(student4);
			//commit transaction
			session.getTransaction().commit();


			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			List myStudents = session.createQuery("from Student").getResultList();
			myStudents.forEach(s -> System.out.println("my student :" + s));

			List myStudents1 = session.createQuery("from Student s where s.lastName='gond'").getResultList();
			myStudents1.forEach(s -> System.out.println("my student :" + s));

			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}
}
