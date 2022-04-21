package com.tns.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudDb {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://127.0.0.1:3306/sample";
		String dbUserName="root";
		String dbPassword="nikithacoco@98";
		try
		{
			Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			String sql = "INSERT INTO Employee (user_id,user_name,password,email) VALUES (?, ?, ?, ?)";
PreparedStatement p=c.prepareStatement(sql);
			p.setString(1, "101");
			p.setString(2, "Nikitha Singh");
			p.setString(3, "Pass@123");
			p.setString(4, "n@gmail.com");
			int row = p.executeUpdate();
		    if (row > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }
		    c.close();
			
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
			

	}
}



