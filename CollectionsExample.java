package com.accolite.au.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsExample {

	public static void main(String args[]) {
		List<Book> book = new ArrayList<>();
		book.add(new Book(1, "Norwegian Wood", 450, "Murakami"));
		book.add(new Book(2, "Da Vinci Code", 350, "Dan Brown"));
		book.add(new Book(3, "Revolution 2020", 650, "Chetan Bhagat"));
		book.add(new Book(4, "How to kill a mocking bird", 550, "Harper Lee"));
		book.add(new Book(5, "Famous 5", 550, "Enid Blyton"));
		book.add(new Book(6, "Secret 7", 550, "Enid Blyton"));
		book.add(new Book(7, "The concepts of physics", 150, "HC Verma"));
		book.add(new Book(8, "The Alchemist", 950, "Paulo Coehlo"));

		// System.out.println(book);

		book.sort(new BookComparator());

		System.out.println("The sorted list is:");
		 System.out.println(book);
		 
		Iterator iter = book.iterator();
		while (iter.hasNext()) {
			Book bookobj = (Book) iter.next();
			bookobj.setPrice(bookobj.getPrice() * 0.8); //Reduce prive of each book by 20%
		}
		
		System.out.println("After reducing price by 20 percent list is:");
		
		System.out.println(book);
	}
}
