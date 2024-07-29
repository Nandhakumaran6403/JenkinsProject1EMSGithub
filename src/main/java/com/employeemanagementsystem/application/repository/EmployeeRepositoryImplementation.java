package com.employeemanagementsystem.application.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employeemanagementsystem.application.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepositoryImplementation implements EmployeeRepository{
	

	
	@Autowired
	EntityManager eManager;
	
	@Override
	public String save(Employee employee) {
		eManager.persist(employee);
		return "success";
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllEmployees() {
		String hql = "from Employee";
		Query query = eManager.createQuery(hql);
		return query.getResultList();
	}
	@Override
	public Employee findById(int id) {
		return eManager.find(Employee.class, id);
	}
	@Override
	public void update(Employee employee) {
		eManager.merge(employee);
	}

	@Override
	public void delete(int id) {
	    Employee empToDelete = findById(id);
	    if (empToDelete != null) {
	        eManager.remove(empToDelete);
	    }
}

}

