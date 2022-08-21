package com.bridgelabz.employeePayrollServiceJDBC;

import java.sql.*;

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
	            System.out.println("Connection done...");
	            Statement statement = connection.createStatement();
	            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee_payroll");
	            while (resultSet.next()) {
	                System.out.println(resultSet.getInt("id") + " | " + resultSet.getString("name") + " | " + resultSet.getString("address") + " | " + resultSet.getString("department") + " | " + resultSet.getString("gender") + " | " + resultSet.getDate("start"));
	            }
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            connection.close();
	        }
	    }
	}

	        

	


