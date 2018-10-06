package com.capg.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
public class PSDemo {
	
	public static void main(String args[]){
		//step1
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			//step 2
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orcl11g");
			
			String INSERT_QUERY = "insert into EMP1 values(?,?,?)";
			String UPDATE_QUERY = "update EMP1 set name = ? , age = ? where eid = ?";
			final String SELECT_QUERY = "select * from emp1 where eid = ?";
			
			PreparedStatement psmt= con.prepareStatement(INSERT_QUERY);
			
			
			
			//Date date = new Date("08/02/1996");
			
			psmt.setString(1, "ABC");//write getter methods as arg2
			psmt.setInt(2,101);
			psmt.setInt(3, 45);
			
			ResultSet res = psmt.executeQuery(); 
			
			/*while(res.next()){
				
				int EID = res.getInt("eid");
				String NAME = res.getString("name");
				int AGE = res.getInt("age");
				
				System.out.println(EID+ " "+NAME+ " " + AGE);
			}*/
			
		
			
			int n = psmt.executeUpdate();
			System.out.println(n+"result updated");
			psmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
