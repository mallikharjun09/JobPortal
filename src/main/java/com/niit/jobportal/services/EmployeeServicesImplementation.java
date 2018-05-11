package com.niit.jobportal.services;

import java.util.List;

import com.niit.jobportal.model.Employee;

public class EmployeeServicesImplementation implements EmployeeService{

	public int insertEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.insertEmployeeDetails(employee);
	}

	public Employee displaySingleEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.displaySingleEmployee(employeeId);
	}

	public int deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployee(employeeId);
	}

	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		return employeeDao.updateEmployee(employee);
		
	}

	public List<Employee> displayAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.displayAllEmployees();
	}

}
