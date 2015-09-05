package com.as.sample.util;
import javax.security.auth.login.Configuration;

import org.hibernate.SessionFactory;

@SuppressWarnings("deprecation")
public class HibernateUtil {
	private static SessionFactory sessionFactory;

	private static org.hibernate.cfg.Configuration configuration;

	// Create the initial SessionFactory from the default configuration files
	static {
		try {
			configuration= new org.hibernate.cfg.Configuration();
			sessionFactory = configuration.configure().buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}