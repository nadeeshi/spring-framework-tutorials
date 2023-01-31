package com.example.helper.xml;

import java.io.File;
import java.io.IOException;

import com.example.helper.beans.Person;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class SerializeJavaObjectToXMLFile {

	public void convertJavaObjectToXMLFile() throws JsonGenerationException, JsonMappingException, IOException {
		Person person = new Person(1, "Nadee", "Test");
		
		// serialize our Java object to the XML file:
		XmlMapper xmlMapper = new XmlMapper();
	    xmlMapper.writeValue(new File("simple_bean.xml"), person);
	    File file = new File("simple_bean.xml");

	}

}
