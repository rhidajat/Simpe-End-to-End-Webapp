package com.claresco.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.claresco.dao.EmployeeDao;
import com.claresco.model.Employee;
import com.claresco.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;

public class OneAction extends ActionSupport {

	@Resource(name="employeeService")
	private EmployeeService employeeService;
	
	@Override
	public String execute() throws Exception {
		/**
		Employee employee = new Employee();
		employee.setFirstName("phoebe");
		employee.setLastName("buffay");
		employeeService.addEmployee(employee);
		**/

		employeeService.updatePhoebe();
		
		List<Employee> employeeList = employeeService.getEmployees();
		for (Employee e : employeeList) {
			System.out.println(e.getLastName() + ", " + e.getFirstName());
		}
		
		return SUCCESS;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

}
