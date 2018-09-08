package com.capgg.ems.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgg.ems.bean.Employee;
import com.capgg.ems.service.EmployeeServiceImp;

public class User {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeServiceImp service = new EmployeeServiceImp();
		
		System.out.println("******************");
		
		System.out.println("1.add emp");
		System.out.println("2.display");
		int choice =sc.nextInt();
		
		
		
		
		switch(choice) {
		case 1:
			
			System.out.println("Enetr id");
			int eid = sc.nextInt();//use same variable and column name
			System.out.println("Enetr name");
			String ename=sc.next();
			System.out.println("Enetr sal");
			double sal=sc.nextDouble();
			
			Employee e = new Employee();
			e.setEid(eid);
			e.setEname(ename);
			e.setSal(sal);
			
			int n = service.addEmp(e);
			
			System.out.println(n+" emp added");
			
			break;
			
		case 2:
			ArrayList<Employee> listEmp =service.displayAll();
			for (Employee emp : listEmp) {
				System.out.println(emp.getEid()+" "+emp.getEname()+" "+emp.getSal());
			}
			
			break;
			
		default:
			break;
		}
	}

}
