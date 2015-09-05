package com.as.sample.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.as.sample.form.BankInfoForm;
import com.as.sample.bo.RegistrationBO;
import com.as.sample.common.CommonValidator;
import com.as.sample.form.PersonalInfoForm;
import com.as.sample.form.ContactInfoForm;


public class BankInfoAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String binfoerrors = "";
		
		//step1
		BankInfoForm bif = (BankInfoForm) form;
		//System.out.println(bif.getSsn());
		RegistrationBO regBO=new RegistrationBO();
		HttpSession ses =  request.getSession();
		PersonalInfoForm personalInfoForm = (PersonalInfoForm) ses.getAttribute("personalInfoForm");
		bif.setPersonalInfoForm(personalInfoForm);
		
		try{
			binfoerrors=regBO.addBankData(bif);			
			//System.out.println(binfoerrors);
		}catch(Exception e){
			e.printStackTrace();
		}
		if(CommonValidator.isFieldBlank(binfoerrors)){		
			return mapping.findForward("success");
		}else{
			HttpSession ses1 = request.getSession();
			ses1.setAttribute("binfoerrors", binfoerrors);
			return mapping.findForward("failure");
		}
			
	}
}
