package com.accolite.employee.model;

import java.util.Date;

public class Employee {

	private int id;
	private String name;
	private int salary;
	private String deptartment;
	private Date date_of_joining;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDeptartment() {
		return deptartment;
	}
	public void setDeptartment(String deptartment) {
		this.deptartment = deptartment;
	}
	public Date getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj == this)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee e = (Employee) obj;

		if (this.id == e.getId() && this.name.contentEquals(e.getName()) && this.date_of_joining.compareTo(e. getDate_of_joining()) == 0
				&& this.deptartment.compareTo(e.getDeptartment()) == 0 && this.salary == e.getSalary())
			return true;
		return false;
	}
	
	
	
}
