package com.accolite.serial;

import java.io.Serializable;

public class Student extends Person implements Serializable {

	private static final long serialVersionUID = 3L;

	private int studentId;
	private int standard;
	transient double marks;
	private String division;
	private Address address;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		super();
	}

	public Student(String fname, String lname, int studentId, int standard, String division, Address address) {
		super(fname, lname);
		this.studentId = studentId;
		this.standard = standard;
		this.division = division;
		this.address = address;
	}

}
