package com.spring.hibernate.university.onetotonebi;

import com.spring.hibernate.university.onetotonebi.entity.Instructor;
import com.spring.hibernate.university.onetotonebi.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author akash.gond
 * @Project Practice_Spring_Boot
 * @Date 04032023 Copyright (C) 2023 Newcastle University, UK
 */
public class GetInstructorDetailDemo {
	public static void main(String[] args) {


		// create session factory
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		//create session
		Session session = sessionFactory.getCurrentSession();
		try {
			//start transaction
			session.beginTransaction();

			// get instructor detail object
			InstructorDetail instructorDetail = session.get(InstructorDetail.class, 2);

			//print instructor detail
			System.out.println("instructor detail : " + instructorDetail);

			//print associated instructor
			System.out.println("Associated instructor : " + instructorDetail.getInstructor());

			//commit transaction
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}

	}
}
