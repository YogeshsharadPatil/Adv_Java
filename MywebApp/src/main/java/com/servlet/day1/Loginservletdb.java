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
@WebServlet("/Loginservletdb")
public class Loginservletdb extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("On Servlet Page");
		//take the data from the form
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","cdac");
	
			//fetch email and password from database
			String selectquery = "select email,password from tb_login";
			PreparedStatement stmt = conn.prepareStatement(selectquery);
			 ResultSet rs = stmt.executeQuery();
			 String emlfrmdb ="";
			 String pwdfrmdb ="";
			 while(rs.next()) {
				  emlfrmdb = rs.getString("email");
				  pwdfrmdb = rs.getString("password");
			 }
			 //check and if matched then redirect
			 if(email.equals(emlfrmdb) && password.equals(pwdfrmdb)) {
				 System.out.println("Login Successfull");
				 response.sendRedirect("welcome.html");
			
			 }else {
				response.sendRedirect("login.html");
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
