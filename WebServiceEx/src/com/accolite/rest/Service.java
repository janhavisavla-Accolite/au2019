package com.accolite.rest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/root")
public class Service {

	private static Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String add(@QueryParam("id") Integer id, @QueryParam("firstName") String firstName,
			@QueryParam("lastName") String lastName, @QueryParam("age") Integer age) {

		if (empMap.get(id) != null)
			return "Employee Already Exists";

		empMap.put(id, new Employee(id, firstName, lastName, age));

		return "Employee created successfully";
	}

	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee[] getAll() {
		Set<Integer> ids = empMap.keySet();

		Employee[] p = new Employee[ids.size()];
		int i = 0;

		for (Integer id : ids) {
			p[i] = empMap.get(id);
			i++;
		}

		return p;
	}

	@POST
	@Path("/deleteEmp")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteEmp(@QueryParam("id") Integer id) {

		if (empMap.get(id) != null) {
			empMap.remove(id);
			return "Employee Deleted successfully";
		}

		return "Employee Does Not Exist";
	}

}
