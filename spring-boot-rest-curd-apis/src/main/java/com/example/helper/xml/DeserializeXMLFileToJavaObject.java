package com.example.helper.xml;

import java.io.File;
import java.io.IOException;

import com.example.helper.beans.Person;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class DeserializeXMLFileToJavaObject {

	public void readXMLFileAndConvertToJavaObject() throws JsonParseException, JsonMappingException, IOException {
		File file = new File("simple_bean.xml");
	    XmlMapper xmlMapper = new XmlMapper();
	    Person value = xmlMapper.readValue(file, Person.class);

	    System.out.println("Person Name: " + value.getFirstName());
	    System.out.println("Person Name: " + value.getLastName());
	}

}
