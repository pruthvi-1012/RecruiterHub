package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sessionFactory;
	
	public static void createSessionFactory() {
		System.out.println("2*****");
		sessionFactory = new Configuration().configure().buildSessionFactory();
		System.out.println("3*****");
		
	}

	public static Session getSession() {
		System.out.println("1*****");
		return sessionFactory.openSession();
	}

}
