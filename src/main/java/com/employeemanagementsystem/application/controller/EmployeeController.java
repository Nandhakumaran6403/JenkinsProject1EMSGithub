package com.employeemanagementsystem.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagementsystem.application.model.Employee;
import com.employeemanagementsystem.application.service.EmployeeServiceImplementation;

@CrossOrigin("http://localhost:3001,http://localhost:3000,http://localhost:3002,http://localhost:3003")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeServiceImplementation service;

	@PostMapping
	public String insertEmployee(@RequestBody Employee employee) {

		String msg = "";
		try {
			service.addEmployee(employee);
			msg = "success";
		} catch (Exception e) {
			msg = "failure";
		}
		return msg;
	}

	@GetMapping("{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {

		return service.getEmployee(id);
	}

	@GetMapping("/all")
	public List<Employee> getEmployees() {

		return service.getAllEmployees();
	}

	@PutMapping
	public String updateEmployee(@RequestBody Employee employee) {

		String msg = "";
		try {
			service.updateEmployee(employee);
			msg = "Success";
		} catch (Exception e) {
			msg = "Failure";
		}
		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteEmployee(@PathVariable("id") int id) {

		String msg = "";
		try {
			service.deleteEmployee(id);
			msg = "Success";
		} catch (Exception e) {
			msg = "Failure";
		}
		return msg;
	}
}
