package com.example.beans.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "country")
public class Country {
	private int id;
	private String countryName;
	public Country() {
		super();
	}

	public Country(int id, String countryName) {
		super();
		this.id = id;
		this.countryName = countryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}		
	
}
