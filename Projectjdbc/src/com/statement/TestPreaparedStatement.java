package com.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestPreaparedStatement {

	public static void main(String[] args) throws SQLException {
		
		Connection con=null;
		PreparedStatement ptmt=null;
		try {
			
		 con=DriverManager.getConnection("jdbc:mysql://localhost/J38","root","root");

				 if(con==null)
					 System.out.println("Connection is not established");
				 
				 else
					 System.out.println("Connection is established");
				 String sql= "insert into book values(?,?,?)";
				  ptmt=con.prepareStatement(sql);
				  
				  ptmt.setInt(1, 103);
				  ptmt.setString(2, "C++ Book");
				  ptmt.setInt(3, 300);
				  

				 ptmt.executeUpdate();
				 }catch(SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			con.close();
		}
				
	

}
}
