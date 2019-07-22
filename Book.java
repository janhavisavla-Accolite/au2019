package com.accolite.au.java;

public class Book {

	private int isbn;
	private String name;
	private double price ;
	private String authorName;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Book(int isbn, String name, int price, String authorName) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + ", authorName=" + authorName + "]";
	}
	
	
	
}
