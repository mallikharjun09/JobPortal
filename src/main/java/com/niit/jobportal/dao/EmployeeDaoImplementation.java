package com.niit.jobportal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.niit.jobportal.model.Employee;

public class EmployeeDaoImplementation implements EmployeeDao{
	String query="";
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
	public int insertEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		try{
			query="insert into employee values(?,?,?,?,?,?,?,?)";
			preparedStatement=connectionObject.prepareStatement(query);
			preparedStatement.setInt(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getEmployeeFirstName());
			preparedStatement.setString(3, employee.getEmployeeLastName());
			preparedStatement.setString(4,  employee.getEmployeeMailId());
			preparedStatement.setLong(5, employee.getEmployeePhoneNumber());
			preparedStatement.setString(6, employee.getEmployeeGender());
			preparedStatement.setString(7, employee.getEmployeeRole());
			preparedStatement.setString(8, employee.getEmployeePassword());
			return preparedStatement.executeUpdate();
		}catch(SQLException exception){
			exception.printStackTrace();
			return 0;
		}
		
	}

	public Employee displaySingleEmployee(int employeeId) {
		// TODO Auto-generated method stub
		try{
			Employee employee=new Employee();
			query="select *from employee where employee_id=?";
			preparedStatement=connectionObject.prepareStatement(query);
			preparedStatement.setInt(1, employeeId);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				employee.setEmployeeId(employeeId);
				employee.setEmployeeFirstName(resultSet.getString(2));
				employee.setEmployeeLastName(resultSet.getString(3));
				employee.setEmployeeMailId(resultSet.getString(4));
				employee.setEmployeePhoneNumber(Long.parseLong(resultSet.getString(5)));
				employee.setEmployeeGender(resultSet.getString(6));
				employee.setEmployeeRole(resultSet.getString(7));
				employee.setEmployeePassword(resultSet.getString(8));
			    return employee;
			}
			else
				return null;
		}catch(SQLException exception){
			exception.printStackTrace();
			return null;
		}
	}

	public int deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		try{
			   query="delete employee where employee_id=?";
			   preparedStatement=connectionObject.prepareStatement(query);
			   preparedStatement.setInt(1, employeeId);
			   return preparedStatement.executeUpdate();
			}catch(SQLException exception){
			   exception.printStackTrace();
			   return 0;
			}
	}

	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		try{
			   query="update employee set first_name=?,last_name=?,employee_mail=?,phone_number=?,gender=?,role=?,password=? where employee_id=?";
			   preparedStatement=connectionObject.prepareStatement(query);
			   preparedStatement.setInt(8, employee.getEmployeeId());
				preparedStatement.setString(1, employee.getEmployeeFirstName());
				preparedStatement.setString(2, employee.getEmployeeLastName());
				preparedStatement.setString(3,  employee.getEmployeeMailId());
				preparedStatement.setLong(4, employee.getEmployeePhoneNumber());
				preparedStatement.setString(5, employee.getEmployeeGender());
				preparedStatement.setString(6, employee.getEmployeeRole());
				preparedStatement.setString(7, employee.getEmployeePassword());
			   return preparedStatement.executeUpdate();
			}catch(SQLException exception){
			   exception.printStackTrace();
			   return 0;
			}
	}

	public List<Employee> displayAllEmployees() {
		List<Employee> employeeList=new LinkedList<Employee>();
		try{
			Employee employee=new Employee();
			query="select *from employee";
			preparedStatement=connectionObject.prepareStatement(query);
			resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				employee.setEmployeeId(Integer.parseInt(resultSet.getString(1)));
				employee.setEmployeeFirstName(resultSet.getString(2));
				employee.setEmployeeLastName(resultSet.getString(3));
				employee.setEmployeeMailId(resultSet.getString(4));
				employee.setEmployeePhoneNumber(Long.parseLong(resultSet.getString(5)));
				employee.setEmployeeGender(resultSet.getString(6));
				employee.setEmployeeRole(resultSet.getString(7));
				employee.setEmployeePassword(resultSet.getString(8));
			    employeeList.add(employee);
			}
			return employeeList;
			
		}catch(SQLException exception){
			exception.printStackTrace();
			return null;
		}
	}

}
