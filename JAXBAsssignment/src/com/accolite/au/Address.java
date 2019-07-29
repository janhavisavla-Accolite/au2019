package com.accolite.au;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {

	private String city;
	private String state;
	private String street;
	private int zip;

	public Address() {
	}

	public Address(String city, String state, String street, int zip) {
		super();
		this.city = city;
		this.state = state;
		this.street = street;
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	@XmlElement
	public void setState(String state) {
		this.state = state;
	}

	@XmlElement
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZip() {
		return zip;
	}

	@XmlElement
	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", street=" + street + ", zip=" + zip + "]";
	}

}
