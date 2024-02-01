package com.ysp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ysp.Entity.User;

public class Userdao {
	String url = "jdbc:mysql://localhost:3306/advjava";
	String username =  "root";
	String pwd= "cdac";

	String insertUsr = "insert into signup(name,email,country) values (?,?,?)";
	String updateUsr = "update signup set name =?, email=?,country=?where id = ?";
	String deleteUsr = "delete from signup where id = ?";
	String selectusrs = "select * from signup";
	String selectuserById = "select * from signup where id =?";

	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void add(User user) {
		try {
			Connection conn	= getConnection();
			PreparedStatement stmt = conn.prepareStatement(insertUsr);
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getEmail());
			stmt.setString(3, user.getCountry());
			stmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public boolean update(User user ) {
		boolean rowupdated = false;
		try {
		Connection conn =	getConnection();
		PreparedStatement stmt = conn.prepareStatement(updateUsr);
		stmt.setString(1, user.getName());
		stmt.setString(2, user.getEmail());
		stmt.setString(3, user.getCountry());
		stmt.setInt(4, user.getId());
		rowupdated=stmt.executeUpdate()>0;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rowupdated;
	}
	
	public User getUsersById(int i) {
		User user = null;
		try {
			Connection conn =getConnection();
			PreparedStatement stmt = conn.prepareStatement(selectuserById);
			stmt.setInt(1, i);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			String name = rs.getString("name");
			String email = rs.getString("email");
			String country = rs.getString("country");
			user = new User(name,email,country);
		}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public List<User> getAllUsers() {
		List<User> userlist = new ArrayList();
		User user = null;
		try {
			Connection conn =getConnection();
			PreparedStatement stmt = conn.prepareStatement(selectusrs);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String country = rs.getString("country");
			user = new User(id,name,email,country);
			userlist.add(user);
		}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return userlist;
	}
	
	public boolean deleteuser(int id) {
		boolean rowupdated = false;
		try {
		Connection conn =	getConnection();
		PreparedStatement stmt = conn.prepareStatement(deleteUsr);
		stmt.setInt(1, id);
		rowupdated=stmt.executeUpdate()>0;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rowupdated;
	}
		
}
