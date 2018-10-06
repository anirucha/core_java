package com.capg.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableDemo {
	public static void main(String args[]){
		
		Connection con = DBUtil.getConnection();
		
		try {
			CallableStatement csmt = con.prepareCall("{CALL EMP_PRO}");//if function then call?=EMP_PRO
			
			csmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
