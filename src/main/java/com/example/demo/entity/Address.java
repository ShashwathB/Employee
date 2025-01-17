package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String street;
	private String city;
	
	@Column(name = "pinCode")
	private int pinCode;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public Address(String street, String city, int pinCode) {
		super();
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	public Address() {
		super();
	}
	
	
	

}
