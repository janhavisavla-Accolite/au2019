package com.accolite.serial;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 3L;

	private String city;
	private String state;
	private String street;
	private int zip;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public Address(String city, String state, String street, int zip) {
		super();
		this.city = city;
		this.state = state;
		this.street = street;
		this.zip = zip;
	}

}
