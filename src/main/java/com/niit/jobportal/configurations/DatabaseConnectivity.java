package com.niit.jobportal.configurations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity {
	 Connection connectionObject=null;
      public Connection getConnection(){
    	  try{
    		  Class.forName("org.h2.Driver");
    		  String url="jdbc:h2:tcp://localhost/~/employeeDatabase";
    		  String userName="sa";
    		  String password="";
    		  connectionObject=DriverManager.getConnection(url,userName,password);
    		  return connectionObject;
    	  }catch(SQLException | ClassNotFoundException exception){
    		  exception.printStackTrace();
    		  return null;
    	  }
    	  
      }
}
