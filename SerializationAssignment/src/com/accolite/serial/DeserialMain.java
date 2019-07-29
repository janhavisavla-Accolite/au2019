package com.accolite.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialMain {

	public static void main(String args[]){  
		  try{  
			  
		  //Creating stream to read the object  
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\janhavi.savla\\Desktop\\Studentdata.txt"));  
		  Student s=(Student)in.readObject();  
		  
		  //printing the data of the serialized object  
		  System.out.println("Student ID: " + s.getStudentId() + 
		  " Standard: "+ s.getStandard() );
		  
		  Student s2=(Student)in.readObject();  
		  //printing the data of the serialized object  
		  
		  System.out.println("Student ID: " + s2.getStudentId() + 
				  " Standard: "+ s2.getStandard() );
		  
		  //closing the stream  
		  in.close();  
		  }catch(Exception e){System.out.println(e);}  
		 }  
	
}
