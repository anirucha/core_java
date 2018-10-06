package com.capg.ems.service;

import com.capg.ems.bean.Employee;
import com.capg.ems.dao.EmpDAOImp;

public class EmpServiceImp implements IEmpService {
	
	EmpDAOImp  empDAO = new EmpDAOImp();

	@Override
	public int add(Employee e) {
		// TODO Auto-generated method stub
		return   empDAO.add(e);
	}

	@Override
	public Employee getEmp(int n) {
		// TODO Auto-generated method stub
		return   empDAO.getEmp(n);
	}

	
	
	
	
	 // validate() for validations ...
	
}
