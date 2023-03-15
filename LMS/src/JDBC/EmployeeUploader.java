package JDBC;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class EmployeeUploader 
{
	private Connection conn;
    private java.sql.Statement stmt;

    // Constructor to establish database connection
    public void EmpUploader() {
        try {
        	 Class.forName("com.mysql.cj.jdbc.Driver");
            	String url="jdbc:mysql://localhost:3306/Company";
            	String username="root";
    	     String password="Surya@135";
             conn = DriverManager.getConnection(url, username, password);
             stmt = conn.createStatement();
         } catch (ClassNotFoundException | SQLException e) {
             e.printStackTrace();
         }
        }
 // Method to load department details into department table
    public void storeDepartmentDetails(int deptId, String deptName, String deptHead) {
        try {
            String query = "INSERT INTO department VALUES (" + deptId + ", '" + deptName + "', '" + deptHead + "')";
            stmt.executeUpdate(query);
            System.out.println("Department data inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to load employee details into employee table
    public void storeEmployeeDetails(int empId, String empName, String empContact, String empAddress, int deptId) {
        try {
            String query = "INSERT INTO employee VALUES (" + empId + ", '" + empName + "', '" + empContact + "', '" + empAddress + "', " + deptId + ")";
            stmt.executeUpdate(query);
            System.out.println("Employee data inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Main method to test the program
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EmployeeUploader empUploader = new EmployeeUploader();
        empUploader.storeDepartmentDetails(101, "IT", "Shailesh");
        empUploader.storeDepartmentDetails(102, "HR", "Sandeep");
        empUploader.storeEmployeeDetails(201, "Amar", "1234567890", "hyderabad", 101);
        empUploader.storeEmployeeDetails(202, "Perumal", "0987654321", "banglore", 102);
	}

}
