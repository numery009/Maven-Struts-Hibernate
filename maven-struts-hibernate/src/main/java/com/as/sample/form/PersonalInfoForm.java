package com.as.sample.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.struts.action.ActionForm;
@Entity
@Table(name="`personaldata`")
public class PersonalInfoForm extends ActionForm {
	private String eMailId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gendar;
	public PersonalInfoForm() {
		super();
	}
	public PersonalInfoForm(String eMailId, String firstName,
			String middleName, String lastName, String gendar) {
		super();
		this.eMailId = eMailId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gendar = gendar;
	}
	@Id
	@Column(name="EmailId", nullable=false)
	
	public String geteMailId() {
		return eMailId;
	}
		public void seteMailId(String eMailId) {
		this.eMailId = eMailId;
	}
		@Column(name="FirstName", nullable=false)	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name="MiddleName", nullable=false)
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	@Column(name="LastName", nullable=false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column(name="Gendar", nullable=false)
	public String getGendar() {
		return gendar;
	}
	public void setGendar(String gendar) {
		this.gendar = gendar;
	}
}
