package com.accolite.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialMain {

	public static void main(String[] args) throws IOException {

		Address address1 = new Address("Mumbai", "Maharashtra", "Sion", 400022);

		Address address2 = new Address("Bangalore", "Karnataka", "Marathalli", 508067);

		Student student1 = new Student("Janhavi", "Savla", 1, 15, "A", address1);

		Student student2 = new Student("Bhakti", "Savla", 2, 12, "B", address2);

		FileOutputStream fout = new FileOutputStream("C:\\Users\\janhavi.savla\\Desktop\\Studentdata.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(student1);   //Write object to stream
		out.flush();
		out.writeObject(student2);
		out.flush();
		// closing the stream
		out.close();
		System.out.println("success");

	}

}
