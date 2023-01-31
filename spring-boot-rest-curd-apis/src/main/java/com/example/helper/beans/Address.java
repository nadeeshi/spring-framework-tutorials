package com.example.helper.beans;

public class Address {
	String streetName;
    String city;
    
	public Address(String streetName, String city) {
		super();
		this.streetName = streetName;
		this.city = city;
	}
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
    
}
