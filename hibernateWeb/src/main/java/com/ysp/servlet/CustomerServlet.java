package com.ysp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysp.Entity.Customer;
import com.ysp.dao.Customerdao;


public class CustomerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer customer = new Customer();
		customer.setName(request.getParameter("name"));
		customer.setEmail(request.getParameter("email"));
		customer.setCity(request.getParameter("city"));
		String dob = request.getParameter("dateOfBirth");
		//parse in Local date formatter
		LocalDate dt = LocalDate.parse(dob, DateTimeFormatter.ISO_LOCAL_DATE);

		customer.setDate_of_Birth(dt);		
		//now add this customer to database
		Customerdao dao = new Customerdao();
		dao.add(customer);
		PrintWriter out = response.getWriter();
		out.write("Data Inserted SuccessFully...!");
	
	}


	

}
