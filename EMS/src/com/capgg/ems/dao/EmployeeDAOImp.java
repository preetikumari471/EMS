package com.capgg.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.capgg.ems.bean.Employee;

public class EmployeeDAOImp implements EmployeeDAO {

	@Override
	public int addEmp(Employee e) {
		// TODO Auto-generated method stub
		Connection conn=DBUtil.getConn();
		int n=0;
		String insertQuery = "insert into empl values(?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);
			pstmt.setInt(1, e.getEid());
			pstmt.setString(2, e.getEname());
			pstmt.setDouble(3, e.getSal());
			
			n=pstmt.executeUpdate();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return n;
	}

	@Override
	public ArrayList<Employee> displayAll() {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		Connection conn=DBUtil.getConn();
		
		String selectQuery = "select * from empl";
		try {
			PreparedStatement pstmt=conn.prepareStatement(selectQuery);
			
			 ResultSet rs = pstmt.executeQuery();
			 
			 while(rs.next()) {
				 int eid = rs.getInt(1);
				 String ename=rs.getString(2);
				 double sal=rs.getDouble(3);
				 
				 //no. of records=no. of bean objects created
				 
				 Employee e = new Employee();
				 
				 e.setEid(eid);
				 e.setEname(ename);
				 e.setSal(sal);
				 
				 listEmp.add(e);
				 
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listEmp;
	}

}
