package com.gladiators.model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo {
	@Id
	private String email;
	
	private String name;
	private String address;
	private String password;
	private String phoneno;
	private Date dob;
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	
	
	UserInfo(String email, String name, String address, String password, String phoneno, Date dob) {
		super();
		this.email = email;
		this.name = name;
		this.address = address;
		this.password = password;
		this.phoneno = phoneno;
		this.dob = dob;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "UserInfo [email=" + email + ", name=" + name + ", address=" + address + ", password=" + password
				+ ", phoneno=" + phoneno + ", dob=" + dob + "]";
	}
	
	
	
	

}
