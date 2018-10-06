package com.capg.ems.dao;

public interface QueryMapper {
	
	public static final String INSERT_QUERY = "insert into employee values(?,?,?,SYSDATE)";

	
	public static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public static final String UNAME ="SYSTEM";
	public static final String PASSWORD ="orcl11g";
	
}
