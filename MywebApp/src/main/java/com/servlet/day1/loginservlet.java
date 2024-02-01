package com.servlet.day1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/login.cdac")
public class loginservlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//login.cdac is path after the port Number
		//here also we have request and responce parameter
		//we have to collect data from the form
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		
		//now we got the data check it in database but here we will check hardcored value
		if(email.equals("ysp@gmail.com") && password.equals("ysp")) {
			response.sendRedirect("welcome.html");
		}else {
			response.sendRedirect("login.html");
		}
	
	}



}
