package com.accolite.au.java;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		if(o1 ==null)
		{
			if(o2==null)
				return 0;
			return -1;
		}
		if(o2==null)
		{
			return 1;
		}
		if(o1.getPrice()>o2.getPrice())
		{
			return 1;
		}
		else if(o1.getPrice()<o2.getPrice())
		{
			return -1;
		}
		else if((o1.getPrice()==o2.getPrice())) //If prices are equal compare book names
				{
					if(o1.getName().compareTo(o2.getName()) >= 1)
					{
						return 1;
					}
					
					else
					{
						return -1;
					}
				}
		return 0;
	}

}
