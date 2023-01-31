package com.example.helper.xml;

import com.example.helper.beans.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class DeserializeXMLStringToJavaObject {

	public void readXMLStringAndConvertToJavaObject() throws JsonMappingException, JsonProcessingException {
		XmlMapper xmlMapper = new XmlMapper();
	    Person value
	      = xmlMapper.readValue("<Person><id>1</id><firstName>Nadee</firstName><lastName>Test</lastName></Person>", Person.class);

	    System.out.println("Person Name: " + value.getFirstName());
	    System.out.println("Person Name: " + value.getLastName());

	}
}
