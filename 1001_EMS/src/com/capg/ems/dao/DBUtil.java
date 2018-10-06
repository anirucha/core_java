package com.capg.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.capg.ems.ui.EmpMain;

public class DBUtil {
	
	public static Connection getConnection(){
		Connection conn = null;
		
		
		try {
			//DriverManager.registerDriver(new  oracle.jdbc.driver.OracleDriver());
			
		Class.forName(QueryMapper.DRIVER_CLASS);
				conn =		DriverManager.getConnection(QueryMapper.URL,QueryMapper.UNAME,QueryMapper.PASSWORD);
			
			
				EmpMain.logger.info("DB CONNECTION ESTABLISHED");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	

}
