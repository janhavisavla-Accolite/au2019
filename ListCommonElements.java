package com.accolite.au.java;

import java.util.ArrayList;

public class ListCommonElements {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("Hello");
		list1.add("This ");
		list1.add("Is");
		list1.add("Java");

		System.out.println("List1: " + list1);

		ArrayList<String> list2 = new ArrayList<String>();

		list2.add("Hello");
		list2.add("Java");
		list2.add("Folks");

		System.out.println("List2: " + list2);

		ArrayList<String> list3 = new ArrayList<String>();

// Find common elements  while iterating through list1 
		for (String temp : list1) {

			if (list2.contains(temp)) {

				list3.add(temp);
			}
		}

		System.out.println("Common elements: " + list3);
	}
}
