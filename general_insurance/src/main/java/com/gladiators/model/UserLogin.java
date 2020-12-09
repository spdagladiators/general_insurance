package com.gladiators.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserLogin {
	@Id
	private String email;

	private String password;

	public UserLogin() {
		
	}

	UserLogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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

	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + "]";
	}

}
