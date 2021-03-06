/*
 * author : @tridib2003
 */

package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	
	// Database URL, username and password
	static final String url = "jdbc:mysql://localhost:3306/testjdbc";
	static final String unameDB = "root";
	static final String passDB = "passtridib123";
	
	// Query to fetch username and password from db
	static final String query = "select * from LoginDB where uname=? and pass=?";
	
	public boolean verifyUser(String uname, String password) {
		
		// for debug purpose
		System.out.println("~~~~~ INFO: inside verifyUser() - LoginDAO.java ~~~~~");
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, unameDB, passDB);
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, uname);
			pst.setString(2, password);
			
			ResultSet rs = pst.executeQuery();
			
			if (rs.next()) {
				
				// for debug purpose
				System.out.println("~~~~~ INFO: exit from LoginDAO.java ~~~~~");
				
				return true;
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// for debug purpose
		System.out.println("~~~~~ INFO: exit from LoginDAO.java ~~~~~");
		
		return false;
	}
	
}
