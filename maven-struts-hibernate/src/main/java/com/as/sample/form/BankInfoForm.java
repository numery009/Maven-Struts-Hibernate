package com.as.sample.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.struts.action.ActionForm;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
@Table(name="`bankdata`")
public class BankInfoForm extends ActionForm {
	String bankName;
	String accountNo;
	String ssn;
	private PersonalInfoForm personalInfoForm = new PersonalInfoForm();
	public BankInfoForm() {
		super();
	}
	

	@Column(name="BankName", nullable=false)	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Id
	@Column(name="AccountNumber", nullable=false)
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	@Column(name="SSN", nullable=false)	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@Fetch(FetchMode.SELECT)
	@JoinColumn(name = "EmailId", nullable = false)

	public PersonalInfoForm getPersonalInfoForm() {
		return personalInfoForm;
	}



	public void setPersonalInfoForm(PersonalInfoForm personalInfoForm) {
		this.personalInfoForm = personalInfoForm;
	}
}
