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
@Table(name="`contactdata`")
public class ContactInfoForm extends ActionForm {
	private String address;
	private String city;
	private String state;
	private String country;
	private String phone;
	
	private PersonalInfoForm personalInfoForm = new PersonalInfoForm();
	
	public ContactInfoForm() {
		super();
	}
	@Column(name="Address", nullable=false)	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="City", nullable=false)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Column(name="State", nullable=false)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	@Column(name="Country", nullable=false)
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	@Id
	@Column(name="Phone", nullable=false)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
