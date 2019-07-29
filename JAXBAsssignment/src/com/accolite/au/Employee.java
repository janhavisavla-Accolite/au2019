package com.accolite.au;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private String fname;
	private String lname;
	Address address;
	private int empId;

	public Employee() {
	}

	public Employee(String fname, String lname, Address address, int empId) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.empId = empId;
	}

	public String getFname() {
		return fname;
	}

	@XmlElement
	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	@XmlElement
	public void setLname(String lname) {
		this.lname = lname;
	}

	public Address getAddress() {
		return address;
	}

	@XmlElement
	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	@XmlAttribute
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", address=" + address + ", empId=" + empId + "]";
	}

}
