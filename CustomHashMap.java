package com.accolite.au.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CustomHashMap {
	
public static void main(String args[])
{
	
	List<Book> book = new ArrayList<>();
	book.add(new Book(1, "Norwegian Wood", 450, "Murakami"));
	book.add(new Book(2, "Da Vinci Code", 350, "Dan Brown"));
	book.add(new Book(3, "Revolution 2020", 650, "Chetan Bhagat"));
	book.add(new Book(4, "How to kill a mocking bird", 550, "Harper Lee"));
	book.add(new Book(5, "Famous 5", 550, "Enid Blyton"));
	book.add(new Book(6, "Secret 7", 550, "Enid Blyton"));
	book.add(new Book(7, "The concepts of physics", 150, "HC Verma"));
	book.add(new Book(8, "The Alchemist", 950, "Paulo Coehlo"));

	Map<String , Integer> bookmap = new HashMap<>();
	//Iterator i = book.iterator();
	
	int x =0;
	while(x<book.size())
	{
		Book bookobj = book.get(x);
		String key = bookobj.getAuthorName();
		int value = 1;
		if(!bookmap.containsKey(key))
		{
		bookmap.put(key, value);
		}
		else
		{
			value = bookmap.get(key);
			bookmap.put(key, value+1);
		}
		x++;
	}
	
	
	for(Entry<String, Integer> entry: bookmap.entrySet())
	{
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		
	}
}

}
