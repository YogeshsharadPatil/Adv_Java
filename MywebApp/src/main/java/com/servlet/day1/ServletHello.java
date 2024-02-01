package com.servlet.day1;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletHello
 */
@WebServlet("/ServletHello")
public class ServletHello extends HttpServlet {

      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Hello from Server</h1>");
		LocalDate dt = LocalDate.now();
		out.write("<h3>Todays date is "+dt+"</h3>");
		out.write("</html></body>");
		
	}




}
