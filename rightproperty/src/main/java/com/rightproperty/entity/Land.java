package com.rightproperty.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="land")
public class Land implements Serializable{

	
	

	@Id
	@GeneratedValue
    @Column(name="id")
	private int id;
	
	

	@Column(name="state")
	private String state;
	
	
	@Column(name="imageurl")
	private String imageurl;
	
	@Column(name="city")
	private String city;
	
	@Column(name="address")
	private String address;
	@Column(name="featured")
	
	private int featured;
	
	@Column(name="area")
	private int area;
	
	@Column(name="price")
	private int price;
	
	@Column(name="type")
	private String type;
	

	@Column(name="sellerid",unique=true)
	private int sellerid;
	
	
	
	public Land(int id, String state, String imageurl, String city, String address, int featured, int area, int price,
			String type, int sellerid) {
		super();
		this.id = id;
		this.state = state;
		this.imageurl = imageurl;
		this.city = city;
		this.address = address;
		this.featured = featured;
		this.area = area;
		this.price = price;
		this.type = type;
		this.sellerid = sellerid;
	}



	public Land() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Land [id=" + id + ", state=" + state + ", imageurl=" + imageurl + ", city=" + city + ", address="
				+ address + ", featured=" + featured + ", area=" + area + ", price=" + price + ", type=" + type
				+ ", sellerid=" + sellerid + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getImageurl() {
		return imageurl;
	}



	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getFeatured() {
		return featured;
	}



	public void setFeatured(int featured) {
		this.featured = featured;
	}



	public int getArea() {
		return area;
	}



	public void setArea(int area) {
		this.area = area;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getSellerid() {
		return sellerid;
	}



	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}


	

	

	
}
