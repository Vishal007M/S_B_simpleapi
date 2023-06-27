package com.allegient.AuthanticationApi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DataEntity {

	@Id
	private int id;
	private String company_name;

	// Branch Detail
	private String company_email;
	private String email;
	private String password;
	private String phone;

	public DataEntity() {
		super();
	}

	public DataEntity(int id, String company_name, String company_email, String email, String password, String phone) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.company_email = company_email;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_email() {
		return company_email;
	}

	public void setCompany_email(String company_email) {
		this.company_email = company_email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "entity [id=" + id + ", company_name=" + company_name + ", company_email=" + company_email + ", email="
				+ email + ", password=" + password + ", phone=" + phone + "]";
	}


}
