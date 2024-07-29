package com.employeemanagementsystem.application.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.employeemanagementsystem.application.model.Employee;

@Repository
public interface EmployeeRepository {

	public String save(Employee employee);

	public Employee findById(int id);

	public List<Employee> findAllEmployees();

	public void update(Employee employee);

	public void delete(int id);

}
