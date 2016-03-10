package com.claresco.dao;

import java.util.List;

import com.claresco.model.Employee;

public interface EmployeeDao {

	void addEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	void updatePhoebe();
}
