package com.tns.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) {
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://127.0.0.1:3306/Capgemini1";
		String dbUserName="root";
		String dbpassword="nikithacoco@98";
		String query="select *EnggStud";
		try 
		{
			 Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			 e.printStackTrace();
			 
		}
try
		{
			Connection c=DriverManager.getConnection(dbURL,dbUserName,dbpassword);
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery(query);
		
			while(rs.next())
			{
				String Stud_data=" ";
				for(int i=1;i<=2;i++)
				{
					Stud_data=Stud_data+" "+rs.getString(i);
				}
				System.out.println(Stud_data);
			}
		}
		catch(SQLException e)
		{
			System.out.println("An error occurred.Maybe password/user name is invalid");
			e.printStackTrace();
		}
	
			
			
		

	}


	}


