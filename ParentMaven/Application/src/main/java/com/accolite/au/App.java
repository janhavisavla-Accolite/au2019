package com.accolite.au;

import com.accolite.au.*;
import com.fasterxml.jackson.core.JsonProcessingException;

public class App {

	public static void main(String[] args) throws JsonProcessingException {
		UtilApp ut = new UtilApp();
		Book book = new Book(1, "Chetan Bhagat", 250 ,"2 states");
		System.out.println(ut.getJsonString(book));
		
	}

}
