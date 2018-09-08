package com.capgg.ems.dao;

import java.util.ArrayList;

import com.capgg.ems.bean.Employee;

public interface EmployeeDAO {

	public int addEmp(Employee e);
	
	public ArrayList<Employee> displayAll();

}
