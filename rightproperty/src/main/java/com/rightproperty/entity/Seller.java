package com.rightproperty.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seller")
public class Seller implements Serializable {
    

	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")	
	private int id;
	
	@Column(name="fname")
	public String fname;
	
	@Column(name="lname")
	public String lname;
	
	@Column(name="email")
	public String email;
	
	@Column(name="phone")
	public String phone;
	
	@Column(name="sellerid",unique = true)
	
	public int sellerid;
	

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(int id, String fname, String lname, String email, String phone, int sellerid) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.sellerid = sellerid;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone
				+ ", sellerid=" + sellerid + "]";
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSellerid() {
		return sellerid;
	}

	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}
	
	
}
