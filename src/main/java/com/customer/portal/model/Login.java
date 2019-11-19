package com.customer.portal.model;

import java.util.Base64;

public class Login {
	
	private String email;
	private String password;
	
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
		this.password = Base64.getEncoder().encodeToString(password.getBytes());
	}

}
