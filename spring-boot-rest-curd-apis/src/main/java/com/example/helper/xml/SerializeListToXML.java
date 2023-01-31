package com.example.helper.xml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import com.example.helper.beans.Address;
import com.example.helper.beans.Person;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class SerializeListToXML {

	public void convertListToXML() throws JsonGenerationException, JsonMappingException, IOException {
		XmlMapper xmlMapper = new XmlMapper();
	    Person person = testPerson(); // test data
	    
	    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	    xmlMapper.writeValue(byteArrayOutputStream, person); 
        System.out.println(byteArrayOutputStream.toString());
	}

	private static Person testPerson() {
		Person person = new Person();
		person.setFirstName("Nadee");
		person.setLastName("Test");
		person.setPhoneNumbers(Arrays.asList("9911034731", "9911033478"));
		person.setAddress(Arrays.asList(new Address("Name1", "City1"), new Address("Name2", "City2")));
		
		return person;
	}
	
	/* Output :- 
	 * <Person>
	 * 	<id>0</id>
	 * 	<firstName>Nadee</firstName>
	 * 	<lastName>Test</lastName>
	 * 	<phoneNumbers>
	 * 		<phoneNumbers>9911034731</phoneNumbers>
	 * 		<phoneNumbers>9911033478</phoneNumbers>
	 * 	</phoneNumbers>
	 * 	<address>
	 * 		<streetName>Name1</streetName>
	 * 		<city>City1</city>
	 * 	</address>
	 * 	<address>
	 * 		<streetName>Name2</streetName>
	 * 		<city>City2</city>
	 * 	</address>
	 * </Person>
	 */
}
