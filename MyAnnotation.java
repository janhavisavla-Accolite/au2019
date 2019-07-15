package com.accolite.au.java;

import java.io.FileWriter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
@interface Servlet {

	String name();

	String url();
}

@Servlet(name = "Ramesh", url = "ABC")
public class MyAnnotation {

	MyAnnotation() {
		String name = this.getClass().getAnnotation(Servlet.class).name();
		String url = this.getClass().getAnnotation(Servlet.class).url();
		System.out.println(this.getClass().getAnnotation(Servlet.class).name());
		System.out.println(this.getClass().getAnnotation(Servlet.class).url());
		try {
			FileWriter fw = new FileWriter("C:\\Users\\janhavi.savla\\Desktop\\annotation.xml");
			fw.write("<Servlet>");
			fw.write("<name>" + name + " </name>");
			fw.write("<url>" + url + " </url>");
			fw.write("</Servlet>");
			fw.close();

		}

		catch (Exception e) {
			System.out.println("Exception");
		}

	}

	public static void main(String args[]) {
		MyAnnotation obj = new MyAnnotation();

	}
}
