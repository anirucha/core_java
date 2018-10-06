package com.capg.ems.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capg.ems.bean.Employee;
import com.capg.ems.dao.EmpDAOImp;

public class EmpDAOImpTest {
	
	public static EmpDAOImp empDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
			//empDAO = new EmpDAOImp();
			
			
		
	}
	

	@Test
	public void testAdd() {
	
		Employee e = new Employee();

		e.setEid(101);
		e.setEname("king");
		e.setSal(4000);
		
		assertNotNull(empDAO);
		
		assertEquals(1, empDAO.add(e));
		
	}

	@Test
	public void testGetEmp() {
		

}
}