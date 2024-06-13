package com.rightproperty.beans;

import java.util.Date;



public class UserDetails {
   
	

	private int id;
	
	private String fname;
	
	private String lname;	
	
	private String email;
	
	private Date dob;
	
	private String phone;
	
	private String gender;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String password;
	
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", dob=" + dob
				+ ", phone=" + phone + ", gender=" + gender + ", address=" + address + ", city=" + city + ", state="
				+ state + ", password=" + password + "]";
	}

	public UserDetails(int id, String fname, String lname, String email, Date dob, String phone, String gender,
			String address, String city, String state, String password) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
