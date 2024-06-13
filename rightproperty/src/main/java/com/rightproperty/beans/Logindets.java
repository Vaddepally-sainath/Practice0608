package com.rightproperty.beans;




public class Logindets {
	
	String email;
	String password;
	
	 
	public Logindets() {
		super();
		// TODO Auto-generated constructor stub
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
		return "Logindets [email=" + email + ", password=" + password + "]";
	}
	public Logindets(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	

}
