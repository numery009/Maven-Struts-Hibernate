package com.as.sample.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.as.sample.bo.RegistrationBO;
import com.as.sample.common.CommonValidator;
import com.as.sample.form.ContactInfoForm;
import com.as.sample.form.PersonalInfoForm;

public class ContactInfoAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String cinfoerrors="";
		//step1
		ContactInfoForm cif=(ContactInfoForm) form;
		System.out.println(cif.getAddress());
		//step2
		RegistrationBO regBO=new RegistrationBO();
		HttpSession ses =  request.getSession();
		PersonalInfoForm personalInfoForm = (PersonalInfoForm) ses.getAttribute("personalInfoForm");
		cif.setPersonalInfoForm(personalInfoForm);
		System.out.println(personalInfoForm.geteMailId());
		
		try{
			cinfoerrors=regBO.addContactInfo(cif);
			
			System.out.println(cinfoerrors);
		}catch(Exception e){
			e.printStackTrace();
		}
		if(CommonValidator.isFieldBlank(cinfoerrors)){
			
			ses.setAttribute("cinfo", cif);
			return mapping.findForward("success");
		}else{
			ses.setAttribute("cinfoerrors", cinfoerrors);
			return mapping.findForward("failure");
		}
	}

}
