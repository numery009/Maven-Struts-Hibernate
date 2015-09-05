package com.as.sample.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.as.sample.form.PersonalInfoForm;

import com.as.sample.bo.RegistrationBO;
import com.as.sample.common.CommonValidator;

public class PersonalInfoAction extends Action {
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	String pinfoerrors="";
	PersonalInfoForm pif=(PersonalInfoForm) form;
	HttpSession ses =  request.getSession();
	RegistrationBO regBO= new RegistrationBO();
	//System.out.println(pif.geteMailId());
	try{
		pinfoerrors=regBO.addPersonalInfo(pif);
		System.out.println(pinfoerrors.length());
	}catch(Exception e){
		e.printStackTrace();
	}
	if(CommonValidator.isFieldBlank(pinfoerrors)){
		
		ses.setAttribute("pinfo", pif);
		return mapping.findForward("success");
	}else{
		ses.setAttribute("pinfoerrors", pinfoerrors);
		return mapping.findForward("failure");
	}
	

}
}
