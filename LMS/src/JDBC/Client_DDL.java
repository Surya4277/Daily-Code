package JDBC;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Client_DDL {

	public static void main(String[] args) throws ClassNotFoundException
	{
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.cj.jdbc.Driver");
	     String url="jdbc:mysql://localhost:3306/Company";
	     String username="root";
	     String password="Surya@135";
	     try (Connection conn = DriverManager.getConnection(url, username, password);
	             java.sql.Statement st = conn.createStatement()){;           
	               String createDept = "CREATE TABLE Department ("
	            		   + "Department_ID int PRIMARY KEY, "
	            		   + "Department_Name VARCHAR(50), "
	            		   + "Department_Head VARCHAR(50), "
	            		   + "Department_Description VARCHAR(200))";
            st.executeUpdate(createDept);

            // create Employee table
            String createEmp = "CREATE TABLE Employee ("
                    + "Employee_Id int PRIMARY KEY, "
                    + "Employee_Name VARCHAR(50), "
                    + "Employee_Address VARCHAR(100), "
                    + "Employee_Salary DECIMAL(10, 2) CHECK (Employee_Salary BETWEEN 1000 AND 1000000), "
                    + "Employee_Contact_No int, "
                    + "Department_Id int,"
                    + "FOREIGN KEY (Department_Id) REFERENCES Department(Department_ID))";
            st.executeUpdate(createEmp);

            System.out.println("Tables created successfully!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
       }
	}

}
