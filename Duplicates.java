package com.accolite.au.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Duplicates {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		SortedSet<String> setToReturn = new TreeSet<>();
		Set<String> set1 = new HashSet<>();
		// Input Array - ["tables", "chairs", "sofa", "tables", "fans","lights", "beds",
		// "mattress", "beds"]
		list.add("tables");
		list.add("chairs");
		list.add("sofa");
		list.add("tables");
		list.add("fans");
		list.add("lights");
		list.add("beds");
		list.add("mattress");
		list.add("beds");

		for (String yourstring : list) {
			if (!set1.add(yourstring)) {
				setToReturn.add(yourstring);
			}
		}

		Iterator value = setToReturn.iterator();

		// Displaying the values after iterating through the set
		while (value.hasNext()) {
			System.out.println(value.next());
		}

	}

}
