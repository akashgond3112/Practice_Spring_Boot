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
public class DeleteStudentDemo {
	public static void main(String[] args) {


		// create session factory
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();

		//create session
		Session session = sessionFactory.getCurrentSession();
		try {

			session.beginTransaction();
			session.createQuery("delete Student where  lastName='gond'").executeUpdate();
			session.getTransaction().commit();

			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			List myStudents = session.createQuery("from Student").getResultList();
			myStudents.forEach(s -> System.out.println("my student :" + s));
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}
}
