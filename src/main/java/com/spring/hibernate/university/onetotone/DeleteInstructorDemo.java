package com.spring.hibernate.university.onetotone;

import com.spring.hibernate.university.onetotone.entity.Instructor;
import com.spring.hibernate.university.onetotone.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author akash.gond
 * @Project Practice_Spring_Boot
 * @Date 04032023 Copyright (C) 2023 Newcastle University, UK
 */
public class DeleteInstructorDemo {
	public static void main(String[] args) {


		// create session factory
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		//create session
		Session session = sessionFactory.getCurrentSession();
		try {

			//start transaction
			session.beginTransaction();

			// create student object
			Instructor instructor = session.get(Instructor.class, 1);

			// delete instructor
			if (instructor != null) {
				System.out.println("Deleting : " + instructor);
				session.delete(instructor);
			}

			//commit transaction
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}
}
