package com.capg.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.capg.ems.bean.Employee;

public class EmpDAOImp implements IEmpDAO {

	@Override
	public int add(Employee e) {
		// TODO Auto-generated method stub
		int n = 0;
		
		
	Connection conn =		DBUtil.getConnection();
	
	
	
	
	
				try {
				PreparedStatement pstmt =	conn.prepareStatement(QueryMapper.INSERT_QUERY);
					
					pstmt.setInt(1, e.getEid());
					pstmt.setString(2, e.getEname());
					pstmt.setDouble(3, e.getSal());
				
			n =	pstmt.executeUpdate();
				
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
		
		
		return n;
	}

	@Override
	public Employee getEmp(int n) {
		// TODO Auto-generated method stub
		return null;
	}

}
