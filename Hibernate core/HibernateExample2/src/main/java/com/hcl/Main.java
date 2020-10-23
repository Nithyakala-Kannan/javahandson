package com.hcl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Student student=new Student();
		student.setId(1);
		student.setName("Varun");
		student.setAddress("Chennai");
		student.setCourse("java");
		session.save(student);
		tx.commit();
		session.close();
		factory.close();

	}

}
