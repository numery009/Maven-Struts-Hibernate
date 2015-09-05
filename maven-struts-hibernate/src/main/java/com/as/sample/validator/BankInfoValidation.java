package com.as.sample.validator;

import com.as.sample.common.CommonValidator;
import com.as.sample.constant.ValidationConstant;
import com.as.sample.form.BankInfoForm;

public class BankInfoValidation {

	public static String validateBankInfo(BankInfoForm bif) {
		
		String binfoerrors=" ";
		if(CommonValidator.isFieldBlank(bif.getBankName())|| bif.getBankName()=="Please select bank"){
		binfoerrors += ValidationConstant.BANK_NAME_BLANK_MSG;
		}
		if(CommonValidator.isFieldBlank(bif.getAccountNo())){
			binfoerrors += ValidationConstant.BANK_ACC_BLANK_MSG;
			}else if((!(bif.getAccountNo().matches("[0-9]\\d{9}")))){
				binfoerrors +=ValidationConstant.BANK_ACC_LENGTH_MSG;
			}
			
		if(CommonValidator.isFieldBlank(bif.getSsn())){
			binfoerrors += ValidationConstant.SSN_BLANK_MSG;
			}else if((!(bif.getSsn().matches("[1-9]\\d{2}-[0-9]\\d{1}-\\d{4}")))){
				binfoerrors +=ValidationConstant.SSn_LENGTH_MSG;	
			}
		
		return binfoerrors;
	}

}
