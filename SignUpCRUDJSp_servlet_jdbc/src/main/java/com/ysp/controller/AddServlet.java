package com.ysp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysp.Entity.User;
import com.ysp.dao.Userdao;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setCountry(country);
		Userdao dao = new Userdao();
		dao.add(user);
		PrintWriter out = response.getWriter();
		out.write("Successfully registered...");
		/* response.sendRedirect("ShowUsers.jsp"); */
	}

}
