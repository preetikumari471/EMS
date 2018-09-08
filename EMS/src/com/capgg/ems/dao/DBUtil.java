package com.capgg.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getConn() {
		
		Connection conn=null ;
		//get connection
		try {
			
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn = DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg208","training208");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
