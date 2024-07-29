package com.employeemanagementsystem.application.service;

import java.util.List;

import com.employeemanagementsystem.application.model.Employee;


public interface EmployeeService  {
	
	public String addEmployee(Employee employee);
	
	public Employee getEmployee(int id);
	
	public List<Employee> getAllEmployees();
	
	public void updateEmployee(Employee employee);
	
	public void deleteEmployee(int id);

}
