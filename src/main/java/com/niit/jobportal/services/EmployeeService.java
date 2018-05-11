package com.niit.jobportal.services;

import java.util.List;

import com.niit.jobportal.dao.EmployeeDao;
import com.niit.jobportal.dao.EmployeeDaoImplementation;
import com.niit.jobportal.model.Employee;

public interface EmployeeService {
     EmployeeDao employeeDao=new EmployeeDaoImplementation();public int insertEmployeeDetails(Employee employee);
 	public Employee displaySingleEmployee(int employeeId);
 	public int deleteEmployee(int employeeId);
 	public int updateEmployee(Employee employee);
 	public List<Employee> displayAllEmployees();
     
}
