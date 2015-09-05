package com.as.sample.validator;



import com.as.sample.common.CommonValidator;
import com.as.sample.constant.ValidationConstant;
import com.as.sample.form.PersonalInfoForm;
//import com.as.sample.form.pifForm;
//import com.as.sample.vo.ContactInfoJb;
import com.as.sample.form.PersonalInfoForm;

public class PersonalInfoValidation {

	public static String validatePersonalInfo(PersonalInfoForm pif) {
		
		
		String pinfoerrors=" ";
		System.out.println(pif.geteMailId());
	
		if(CommonValidator.isFieldBlank(pif.geteMailId())){
			pinfoerrors +=ValidationConstant.EMAIL_ID_NULL;
		}else if(!((pif.geteMailId().indexOf(".")>2) && pif.geteMailId().indexOf("@")>0)){
			pinfoerrors +=ValidationConstant.EMAIL_ID_INVALID;
		}
		
		if(CommonValidator.isFieldBlank(pif.getFirstName())){
		pinfoerrors += ValidationConstant.FIRST_NAME_BLANK_MSG;
		}else if(!(pif.getFirstName().matches("[a-zA-Z0-9][a-zA-Z0-9-_ ]*")) ){
			pinfoerrors +=ValidationConstant.FIRST_NAME_MUST_START_MSG;
		}else if(pif.getFirstName().length() <2 && pif.getFirstName().length()<50)
		{
			pinfoerrors +=ValidationConstant.FIRST_NAME_LENGTH_MSG;
		}
		if(CommonValidator.isFieldBlank(pif.getMiddleName())){
			pinfoerrors += ValidationConstant.MIDDLE_NAME_BLANK_MSG;
			}else if(!(pif.getMiddleName().matches("[a-zA-Z0-9][a-zA-Z0-9-_ ]*"))){
				pinfoerrors +=ValidationConstant.MIDDLE_NAME_MUST_START_MSG;
			}else if(pif.getMiddleName().length() <2 && pif.getMiddleName().length()<50)
			{
				pinfoerrors +=ValidationConstant.MIDDLE_NAME_LENGTH_MSG;
			}
			
		if(CommonValidator.isFieldBlank(pif.getLastName())){
			pinfoerrors += ValidationConstant.LAST_NAME_BLANK_MSG;
			}else if(!(pif.getLastName().matches("[a-zA-Z0-9][a-zA-Z0-9-_ ]*"))){
				pinfoerrors +=ValidationConstant.LAST_NAME_MUST_START_MSG;	
			}
		else if(pif.getLastName().length() <2 && pif.getLastName().length()<50)
			{
				pinfoerrors +=ValidationConstant.LAST_NAME_LENGTH_MSG;
			}
	    if(CommonValidator.isFieldBlank(pif.getGendar())){
	    	pinfoerrors +=ValidationConstant.GENDAR_BLANK_MSG;
	    }
		return pinfoerrors;
		}

}
