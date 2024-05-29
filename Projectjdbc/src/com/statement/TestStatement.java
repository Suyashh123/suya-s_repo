package com.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestStatement {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt=null;
		try {
		 con=DriverManager.getConnection("jdbc:mysql://localhost/J38db","root","Suyash@123");

				 if(con==null)
					 System.out.println("Connection is not established");
				 else
					 System.out.println("Connection is established");
				 
				 String sql="creat table book(id int,name varchar(20),price int,primary key(id)";
				 
				 stmt=con.createStatement();
				 
				stmt.execute(sql); 
				System.out.println("Table creataed");
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
	}

}
