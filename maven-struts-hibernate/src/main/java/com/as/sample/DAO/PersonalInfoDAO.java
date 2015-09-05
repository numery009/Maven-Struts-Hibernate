package com.as.sample.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.as.sample.exceptions.InfrastructureException;
import com.as.sample.form.PersonalInfoForm;
import com.as.sample.util.HibernateUtil;

public class PersonalInfoDAO {

	
	
	public void makePersistent(PersonalInfoForm pif) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.save(pif);
			tx.commit();
			session.close();


		} catch (HibernateException ex) {
			throw new InfrastructureException(ex);
		}
		
	}

	

}
