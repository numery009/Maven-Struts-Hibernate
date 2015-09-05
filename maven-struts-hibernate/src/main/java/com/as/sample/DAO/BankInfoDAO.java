package com.as.sample.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.as.sample.exceptions.InfrastructureException;
import com.as.sample.form.BankInfoForm;
import com.as.sample.util.HibernateUtil;

public class BankInfoDAO {

	public void makePersistent(BankInfoForm bif) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.save(bif);
			tx.commit();
			session.close();


		} catch (HibernateException ex) {
			throw new InfrastructureException(ex);
		}

		
	}

}
