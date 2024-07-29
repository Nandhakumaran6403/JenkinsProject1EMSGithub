package com.employeemanagementsystem.application.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagementsystem.application.model.Employee;
import com.employeemanagementsystem.application.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	EmployeeRepository repo;

	@Override
	public String addEmployee(Employee employee) {
		if (employee != null) {
			repo.save(employee);
			return "success";
		} else {
			return "failure";
		}
	}

	@Override
	public Employee getEmployee(int id) {
		return repo.findById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAllEmployees();
	}

	@Override
	public void updateEmployee(Employee employee) {
		repo.update(employee);

	}

	@Override
	public void deleteEmployee(int id) {
		repo.delete(id);
	}

}
