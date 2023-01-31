package com.example.beans.jackson;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@JacksonXmlRootElement(localName = "country_list")
public class CountryList {

	@JacksonXmlElementWrapper(useWrapping = false)
	//@JacksonXmlElementWrapper(localName = "cards")
	@JacksonXmlProperty(localName = "country")
	List<Country> listOfCountries;
	
	public CountryList() {
		super();
	}

	public CountryList(List<Country> listOfCountries) {
		super();
		this.listOfCountries = listOfCountries;
	}

	public List<Country> getListOfCountries() {
		return listOfCountries;
	}

	public void setListOfCountries(List<Country> listOfCountries) {
		this.listOfCountries = listOfCountries;
	}
	
	
}
