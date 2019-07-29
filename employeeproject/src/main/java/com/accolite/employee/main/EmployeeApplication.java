package com.accolite.employee.main;

import java.util.HashSet;

import java.util.Iterator;
import java.util.Set;

import com.accolite.employee.model.Employee;
import com.accolite.employee.model.EmployeeDataset;

public class EmployeeApplication {

	EmployeeDataset empD = new EmployeeDataset();

	public Employee addEmployee(Employee employee) {
		Set<Employee> empSet = empD.getEmployeeSet();
		if (empSet == null) {
			empSet = new HashSet<Employee>();
		}
		empSet.add(employee);
		empD.setEmployeeSet(empSet);
		return employee;
	}

	public boolean deleteEmployeebyId(int id) {
		Set<Employee> empsSet = empD.getEmployeeSet();
		if (empsSet != null) {
			Iterator<Employee> itr = empsSet.iterator();
			while (itr.hasNext()) {
				Employee e = itr.next();
				if (e.getId() == id) {
					itr.remove();
					empD.setEmployeeSet(empsSet);
					return true;
				}
			}
		}
		return false;
	}

	public Employee searchEmployeebyId(int id) {
		Set<Employee> empSet = empD.getEmployeeSet();

		if (empSet.isEmpty()) {
			System.out.println("empty");
			return null;
		}

		Iterator<Employee> itr = empSet.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getId() == id) {
				System.out.println(emp.getId());
				return emp;
			}

		}

		throw new NullPointerException();
	}

	public Set<Employee> getemployeeSet() {
		Set<Employee> empSet = empD.getEmployeeSet();
		return empSet;
	}

	public int UpdateEmployeeSalary(int id, int salary) {
		Set<Employee> empSet = empD.getEmployeeSet();

		if (empSet.isEmpty()) {
			System.out.println("empty");
		}
		Iterator<Employee> itr = empSet.iterator();

		Employee emp = null;
		while (itr.hasNext()) {
			emp = itr.next();
			if (emp.getId() == id) {
				emp.setSalary(salary);
				break;
			}

		}
		empD.setEmployeeSet(empSet);
		return emp.getSalary();

	}

}
