package com.claresco.service;

import java.util.List;

import com.claresco.model.Employee;

public interface EmployeeService {
	//This method will be called when a employee object is added
    void addEmployee(Employee employee);
    
    List<Employee> getEmployees();
    
    void updatePhoebe();
}
