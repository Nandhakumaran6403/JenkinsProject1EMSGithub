package com.employeemanagementsystem.application.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employeemanagementsystem.application.model.Employee;
import com.employeemanagementsystem.application.service.EmployeeService;

@SpringBootTest
class EmployeeServiceImplementationTest {

	@Autowired
	private EmployeeService employeeService;
	
	@Test
	void testAddEmployee() {
		Employee obj = new Employee(0,"Nandha", "IT", "Developer", 100000);
		assertEquals("success", employeeService.addEmployee(obj));
	}
	
	@Test
	void testAddEmployee1() {
		Employee obj1 = null;
		assertEquals("failure", employeeService.addEmployee(obj1));
	}

}
