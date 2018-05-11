package com.niit.jobportal.dao;

import java.sql.Connection;
import java.util.List;

import com.niit.jobportal.configurations.DatabaseConnectivity;
import com.niit.jobportal.model.Employee;

public interface EmployeeDao {
	Connection connectionObject=new DatabaseConnectivity().getConnection();
	public int insertEmployeeDetails(Employee employee);
	public Employee displaySingleEmployee(int employeeId);
	public int deleteEmployee(int employeeId);
	public int updateEmployee(Employee employee);
	public List<Employee> displayAllEmployees();
}
