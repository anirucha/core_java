package com.capg.ems.ui;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.capg.ems.bean.Employee;
import com.capg.ems.service.EmpServiceImp;

public class EmpMain {
	
	public static Logger logger = Logger.getRootLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("resources//log4j.properties");
		
		EmpServiceImp empService = new EmpServiceImp();
		
		System.out.println("WELCOME TO EMS ***");
		
		logger.info("Application started....");
		
		System.out.println("Enter 1 Add Emp");
		System.out.println("Enter 2 Get Emp Details ");
		System.out.println("3. Exit");
		
		
		Scanner sc = new Scanner(System.in);
		
	int choice =	sc.nextInt();
	
	switch (choice) {
	case 1:
		
			System.out.println("Enter ID");
				int  eid =	sc.nextInt();
			System.out.println("Enter Ename");	
				String ename = sc.next();
			System.out.println("Enter Sal");
			double sal = sc.nextDouble();
			
			Employee e = new Employee();
			
				e.setEid(eid);
				e.setEname(ename);
				e.setSal(sal);
				
				
				
		int n =	empService.add(e);
			
				
			if(n>0){
			System.out.println(n+" employee is added");
			
			logger.info("Employee Added");
			}
			
			else{
				
				
					logger.error("Emp not added...");
				
			}
		
		
		break;
	case 2:
		
		break;
	case 3:
	
	break;

	default:
		break;
	}
		
		
		
		
		
		
		

	}

}
