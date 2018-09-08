package com.capgg.ems.service;

import java.util.ArrayList;

import com.capgg.ems.bean.Employee;
import com.capgg.ems.dao.EmployeeDAOImp;

public class EmployeeServiceImp implements EmployeeService {

	EmployeeDAOImp dao=new EmployeeDAOImp();
	@Override
	public int addEmp(Employee e) {
		
		return dao.addEmp(e);
	}

	@Override
	public ArrayList<Employee> displayAll() {
		
		return dao.displayAll();
	}

}
