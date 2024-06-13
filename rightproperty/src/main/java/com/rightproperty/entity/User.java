package com.rightproperty.entity;



import javax.persistence.Column;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;



@Entity
@Table(name="user")
public class User {
	 
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id")
	private int id;	
	@Column(name="fname",nullable= false)
	@Size(min=5, max=10,message="criteria not met")
	private String fname;
	@Column(name="lname",nullable = false)
	@Size(min=5,max=10)
	private String lname;	
	@Column(name="email",nullable=false,unique=true)
	@Length(min=5, max=46,message = "Enter user email id must be between 5-46 characters" )
	@Email
	private String email;
	@Column(name="dob",nullable=false)

    private String dob;
	@Column(name="phone",nullable=false)
	@Length(min=8,max=12,message="Phone number between 8 to 12 digits")
	private String phone;
	@Column(name="gender",nullable=false)
	private String gender;
	@Column(name="address",nullable=false )
	private String address;
	@Column(name="city",nullable=false)
	private String city;
	@Column(name="state",nullable=false)
	private String state;
	@Column(name="password",nullable=false)
	@Length(min=8,max=16,message="Enter password between 8-16 characters")
	private String password;
	@Column(name="type")	
	
	private String type="normal";
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", dob=" + dob
				+ ", phone=" + phone + ", gender=" + gender + ", address=" + address + ", city=" + city + ", state="
				+ state + ", password=" + password + ", type=" + type + "]";
	}
	public User(int id, @Length(min = 5, max = 26) String fname, @Length(min = 5, max = 26) String lname,
			@Length(min = 5, max = 46, message = "Enter user email id must be between 5-46 characters") String email,
			String dob, @Length(min = 8, max = 12, message = "Phone number between 8 to 12 digits") String phone,
			String gender, String address, String city, String state,
			@Length(min = 8, max = 16, message = "Enter password between 8-16 characters") String password,
			String type) {
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
		this.type = type;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
