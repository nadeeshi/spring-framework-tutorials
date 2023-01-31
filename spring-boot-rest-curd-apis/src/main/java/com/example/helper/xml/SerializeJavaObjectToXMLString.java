package se.example.helper.xml;

import com.example.helper.beans.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class SerializeJavaObjectToXMLString {

	public void convertJavaObjectToXMLString() throws JsonProcessingException {
		Person person = new Person(1, "Nadee", "Test");
		
		// serialize our Java object into the XML String:
		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(person);
		System.out.println(xml);
	}

	/*
	 * <Person>
	 * 	<id>1</id>
	 * 	<firstName>Nadee</firstName>
	 * 	<lastName>Test</lastName>
	 * 	<phoneNumbers/>
	 * </Person>
	 */
}
