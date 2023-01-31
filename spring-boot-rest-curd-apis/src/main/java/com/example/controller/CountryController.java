package com.example.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.beans.jackson.Country;
import com.example.beans.jackson.CountryList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@RestController
@RequestMapping("/java/api/country")
public class CountryController {

	@RequestMapping(value = "/countries", method = RequestMethod.GET, headers="Accept=application/xml")
	//@GetMapping(value = "/users/{id}")
	public String getCountries() throws IOException {
		return createCountryList();
	}

	@PostMapping(path = "/createJson", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	//@RequestMapping(value = "/users", method = RequestMethod.POST)
    public String createCountry(@RequestBody CountryList countryList) throws JsonProcessingException {
		System.out.print("xml " + countryList);

		List<Country> listOfCountries = countryList.getListOfCountries();

		listOfCountries.stream()
		.map(country -> {
			country.setId(country.getId() + 1);
			return country;
		})
		.collect(Collectors.toList());

		//Object to JSON in String
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(countryList);
	}

	@PostMapping(path = "/createXml", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	//@PostMapping(path = "/createXml")
    public String createJsonToXML(@RequestBody CountryList countryList) throws JsonProcessingException {

		List<Country> listOfCountries = countryList.getListOfCountries();

		listOfCountries.stream()
		.map(country -> {
			country.setId(country.getId() + 1);
			return country;
		})
		.collect(Collectors.toList());

		//Object to JSON in String
		 XmlMapper xmlMapper = new XmlMapper();
	        String employeeXml = "";
	        try {
	            employeeXml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(countryList);
	            System.out.println(employeeXml);

	        } catch (JsonProcessingException e) {
	            e.printStackTrace();
	        }

		 return employeeXml;
	}


	// utility method to create country list
	public String createCountryList()  throws IOException{
		Country india = new Country(1, "India");
		Country sriLanka = new Country(2, "Sri Lanka");
		Country uk = new Country(3, "UK");
		Country usa = new Country(4, "USA");

		List<Country> listOfCountries = Arrays.asList(india, sriLanka, uk, usa);

		CountryList countryList = new CountryList(listOfCountries);


		// Converting a Java class object to XML
        XmlMapper xmlMapper = new XmlMapper();
        String employeeXml = "";
        try {
            employeeXml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(countryList);
            System.out.println(employeeXml);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

	    return employeeXml;
	}

	/*
	 *  JSON Input
	 * {
    "listOfCountries": [
        {
            "id": 2,
            "countryName": "India"
        },
        {
            "id": 3,
            "countryName": "Sri Lanka"
        },
        {
            "id": 4,
            "countryName": "UK"
        },
        {
            "id": 5,
            "countryName": "USA"
        }
    ]
}
	 */
}
