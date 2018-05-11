package com.niit.jobportal.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.niit.jobportal.model.Employee;
import com.niit.jobportal.services.EmployeeService;
import com.niit.jobportal.services.EmployeeServicesImplementation;

public class InsertEmployeeTest {
	EmployeeService employeeService=new EmployeeServicesImplementation();
    Employee employee=new Employee();
    
    @Test
    public void insertEmployee(){
   	 employee.setEmployeeId(101);
   	 employee.setEmployeeFirstName("Mallikharjun");
   	 employee.setEmployeeLastName("Kinthada");
   	 employee.setEmployeeGender("Male");
   	 employee.setEmployeeMailId("mallikharjun@gmail.com");
   	 employee.setEmployeePassword("mallika123");
   	 employee.setEmployeePhoneNumber(8885578981L);
   	 employee.setEmployeeRole("Faculty");
   	 
   	 assertEquals("Unable to Insert Record", 1, employeeService.insertEmployeeDetails(employee));
    }

}
