package com.servlet.day1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginservletdb
 */
@WebServlet("/signup.succ")
public class signupservlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("On Servlet Page");
		//take the data from the form
		String name = request.getParameter("name");
		String dt = request.getParameter("dob");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","cdac");
	
			//fetch email and password from database
			String insertquery = "insert into users(name,date_of_birth,city,email,password) values (?,?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(insertquery);
			
			stmt.setString(1, name);
			stmt.setString(2, dt);
			stmt.setString(3,city);
			stmt.setString(4, email);
			stmt.setString(5, password);
			
			int rowsaffected = stmt.executeUpdate();
			
			
			if(rowsaffected>0) {
				System.out.println("SignUp successfully");
				response.sendRedirect("loginservletdb.html");
			}else {
				response.sendRedirect("signup.html");
			}
			
			
			 
		}catch(ClassNotFoundException  | SQLException e ){
				e.printStackTrace();
		}
		finally {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			
		}
		
	}



}
