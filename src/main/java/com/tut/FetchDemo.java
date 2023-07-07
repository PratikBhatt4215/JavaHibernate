package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		//get , load
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session=factory.openSession();
		//get-student:106
		Student student=(Student)session.load(Student.class, 103);		
		Student student1=(Student)session.load(Student.class, 103);		
		
		System.out.println(student.getName());
//		
//		Address ad=(Address)session.get(Address.class, 2);		
//		System.out.println(ad.getStreet()+" : "+ad.getCity());
//		
//		Address ad1=(Address)session.get(Address.class, 2);		
//		System.out.println(ad1.getStreet()+" : "+ad1.getCity());
//		
//		
		
		session.close();
		factory.close();
		
	}
}
