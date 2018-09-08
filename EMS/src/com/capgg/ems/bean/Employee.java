package com.capgg.ems.bean;
//pojo class
public class Employee {

	private int eid;//properties should be private
	private String ename;//every property will have setter getter
	private double sal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	
	
}
