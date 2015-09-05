package com.as.sample.validator;

import com.as.sample.common.CommonValidator;
import com.as.sample.constant.ValidationConstant;
import com.as.sample.form.ContactInfoForm;
import com.as.sample.form.ContactInfoForm;


public class ContactInfoValidation {

	public static String validateContactInfo(ContactInfoForm cif) {
	
		String cinfoerrors=" ";
		if(CommonValidator.isFieldBlank(cif.getAddress())||cif.getAddress()=="Select Country"){
		cinfoerrors += ValidationConstant.ADDRESS_BLANK_MSG;
		}
		if(CommonValidator.isFieldBlank(cif.getCity())){
			cinfoerrors += ValidationConstant.CITY_BLANK_MSG;
			}else if(!(cif.getCity().matches("[a-zA-Z0-9-_ ]*"))){
				cinfoerrors +=ValidationConstant.CITY_MATCH_MSG;
			}else if(cif.getCity().length() <2 && cif.getCity().length()<50)
			{
				cinfoerrors +=ValidationConstant.CITY_NAME_LENGTH_MSG;
			}
			
		if(CommonValidator.isFieldBlank(cif.getState())){
			cinfoerrors += ValidationConstant.STATE_BLANK_MSG;
			}else if(cif.getState().length() <2 && cif.getState().length()<50)
			{
				cinfoerrors +=ValidationConstant.STATE_NAME_LENGTH_MSG;
			}
	    if(CommonValidator.isFieldBlank(cif.getCountry())){
	    	cinfoerrors +=ValidationConstant.COUNTRY_BLANK_MSG;
	    }
	    if(CommonValidator.isFieldBlank(cif.getPhone())){
	    	cinfoerrors +=ValidationConstant.PHONE_BLANK_MSG;
	    }else if((!(cif.getPhone().matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}"))))
		{
			cinfoerrors +=ValidationConstant.PHONE_NAME_LENGTH_MSG;
		}
		return cinfoerrors;
		
	}

}
