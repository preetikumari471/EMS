package com.capgg.ems.service;

import java.util.ArrayList;

import com.capgg.ems.bean.Employee;

public interface EmployeeService {
	
	public int addEmp(Employee e);
	
	public ArrayList<Employee> displayAll();
	
	/*public int deleteEmp(int eid);
	
	public Employee displayEmp(int eid);*/

}
