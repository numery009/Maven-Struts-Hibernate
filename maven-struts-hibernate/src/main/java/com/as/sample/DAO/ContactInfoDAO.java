package com.as.sample.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.as.sample.exceptions.InfrastructureException;
import com.as.sample.form.ContactInfoForm;
import com.as.sample.util.HibernateUtil;

public class ContactInfoDAO {

	public void makePersistent(ContactInfoForm cif) {

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.save(cif);
			tx.commit();
			session.close();


		} catch (HibernateException ex) {
			throw new InfrastructureException(ex);
		}
		
	}

}
