package com.capg.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getConnection(){
		
		Connection con=null;
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			
			//step 2
			 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orcl11g");
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
		
	}
	
}
