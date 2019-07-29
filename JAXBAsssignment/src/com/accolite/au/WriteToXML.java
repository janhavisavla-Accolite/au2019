package com.accolite.au;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class WriteToXML {

	public static void main(String[] args) {
		// Java object. We will convert it to XML.

		Address address = new Address("Mumbai", "Maharashtra", "Sion", 400022);
		Employee employee = new Employee("Janhavi", "Savla", address, 1);
		// Method which uses JAXB to convert object to XML
		jaxbObjectToXML(employee);
	}

	private static void jaxbObjectToXML(Employee employee) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

			// Create Marshaller
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// Required formatting??
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			// Store XML to File
			File file = new File("C:\\Users\\janhavi.savla\\Desktop\\Employeejaxb.xml");

			// Writes XML file to file-system
			jaxbMarshaller.marshal(employee, file);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
