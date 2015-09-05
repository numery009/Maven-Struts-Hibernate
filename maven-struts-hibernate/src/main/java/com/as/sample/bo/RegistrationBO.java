package com.as.sample.bo;

import com.as.sample.DAO.BankInfoDAO;
import com.as.sample.DAO.PersonalInfoDAO;
import com.as.sample.DAO.ContactInfoDAO;
import com.as.sample.common.CommonValidator;
import com.as.sample.form.BankInfoForm;
import com.as.sample.form.ContactInfoForm;
import com.as.sample.form.PersonalInfoForm;
import com.as.sample.validator.BankInfoValidation;
import com.as.sample.validator.PersonalInfoValidation;
import com.as.sample.validator.ContactInfoValidation;


public class RegistrationBO {
	public RegistrationBO(){
		super();
	}
		
	public String addPersonalInfo(PersonalInfoForm pif) {
		String errorMsg = PersonalInfoValidation.validatePersonalInfo(pif);
			if(CommonValidator.isFieldBlank(errorMsg))	{
				PersonalInfoDAO piDao=new PersonalInfoDAO();
				piDao.makePersistent(pif);
			}
		return errorMsg;
		}

	public String addContactInfo(ContactInfoForm cif) {
		String errorMsg1 = ContactInfoValidation.validateContactInfo(cif);
		if(CommonValidator.isFieldBlank(errorMsg1))	{
			ContactInfoDAO ciDao=new ContactInfoDAO();
			ciDao.makePersistent(cif);
		}
	return errorMsg1;
	}

	public String addBankData(BankInfoForm bif) {
		String errorMsg2 = BankInfoValidation.validateBankInfo(bif);
		if(CommonValidator.isFieldBlank(errorMsg2))	{
			BankInfoDAO ciDao=new BankInfoDAO();
			ciDao.makePersistent(bif);
		}
		return errorMsg2;
	}
}

