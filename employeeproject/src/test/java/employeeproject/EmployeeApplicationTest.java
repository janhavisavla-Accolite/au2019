package employeeproject;

import static org.junit.Assert.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.accolite.employee.main.EmployeeApplication;
import com.accolite.employee.model.Employee;
import com.accolite.employee.model.EmployeeDataset;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeApplicationTest {

	private static EmployeeApplication app;

	private static Employee emp1;
	private static Employee emp2;
	private static Employee emp3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		app = new EmployeeApplication();
		emp1 = new Employee();
		emp2 = new Employee();
		emp3 = new Employee();
		emp1.setName("Janhavi");
		emp1.setId(1);
		emp1.setSalary(60000);
		emp1.setDeptartment("Morgan Stanley");
		emp1.setDate_of_joining(new Date());

		emp2.setName("Kunal");
		emp2.setId(2);
		emp2.setSalary(50000);
		emp2.setDeptartment("Samsung");
		emp2.setDate_of_joining(new Date());

		emp3.setName("Pranali");
		emp3.setId(3);
		emp3.setSalary(70000);
		emp3.setDeptartment("Morgan Stanley");
		emp3.setDate_of_joining(new Date());

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Set<Employee> newS = new HashSet<Employee>();
		if (newS.contains(emp1))
			System.out.println("True");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1AddEmployee() {
		assertEquals(emp1, app.addEmployee(emp1));
		assertEquals(emp2, app.addEmployee(emp2));
		assertEquals(emp3, app.addEmployee(emp3));

	}

	@Test
	public void test2DeleteEmployeebyId() {

		assertTrue(app.deleteEmployeebyId(2));   //Returns true is Employee is deleted successfully

	}

	@Test(expected = NullPointerException.class)
	public void test3SearchEmployeebyId() {

		assertNull(app.searchEmployeebyId(4)); // Employee not present
		assertNotNull(app.searchEmployeebyId(emp3.getId())); // Employee is present

	}

	@Test
	public void test4GetemployeeSet() {

		assertNotNull(app.getemployeeSet()); 
	}

	@Test
	public void test5UpdateEmployeeSalary() {

		assertEquals("Salary could not be updated", 10000, app.UpdateEmployeeSalary(1, 10000)); //Update salary of emp_id = 1 
	}

}
