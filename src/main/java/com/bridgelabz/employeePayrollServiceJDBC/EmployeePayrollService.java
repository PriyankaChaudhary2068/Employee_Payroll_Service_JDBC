package com.bridgelabz.employeePayrollServiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class EmployeePayrollService {

	   public static void main(String[] args) throws SQLException {
	        System.out.println("welcome to employee payroll data base connection ");

	        String jdbcUrl = "jdbc:mysql://localhost:3306/payroll_service";
	        String userName = "root";
	        String password = "vchutki2068vpc";
	        Connection connection = null;

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver loaded");
	            connection = DriverManager.getConnection(jdbcUrl, userName, password);

	        } 
	        catch (Exception e) 
	        {
	            System.out.println(e);
	        } 
	        finally 
	        {
	            connection.close();
	        }
	    }
	}
	


