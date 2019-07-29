package com.accolite.au;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadFromXML {
	public static void main(String args[]) {
		String fileName = "C:\\Users\\janhavi.savla\\Desktop\\Employeejaxb.xml";

		// Call method which read the XML file above
		jaxbXmlFileToObject(fileName);
	}

	private static void jaxbXmlFileToObject(String fileName) {

		File xmlFile = new File(fileName);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Employee.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Employee employee = (Employee) jaxbUnmarshaller.unmarshal(xmlFile);

			System.out.println(employee);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}