package com.capgg.ems.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgg.ems.bean.Employee;

class EmployeeTest {

	Employee e=new Employee();
	@Test
	void testGetEid() {
		e.setEid(101);
		assertEquals(101,e.getEid());
	}

	@Test
	void testGetEname() {
		
		e.setEname("king");
		assertNotEquals("aaa",e.getEname());
	}

	@SuppressWarnings("deprecation")
	@Test
	void testGetSal() {
		
		e.setSal(20000.00);
		assertEquals(20000.00, e.getSal());
	}

}
