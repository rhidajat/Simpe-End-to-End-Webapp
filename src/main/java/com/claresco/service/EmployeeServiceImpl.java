package com.claresco.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.claresco.dao.EmployeeDao;
import com.claresco.model.Employee;

@Component("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Resource(name="employeeDao")
	EmployeeDao employeeDao;
	
	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}
	
	@Override
	@Transactional
	public List<Employee> getEmployees() {
		return employeeDao.getAllEmployees();
	}
	
	@Override
	@Transactional
	public void updatePhoebe() {
		employeeDao.updatePhoebe();
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
}
