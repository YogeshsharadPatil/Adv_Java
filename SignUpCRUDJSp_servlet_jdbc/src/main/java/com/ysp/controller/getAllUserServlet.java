package com.ysp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysp.Entity.User;
import com.ysp.dao.Userdao;

/**
 * Servlet implementation class getAllUserServlet
 */
@WebServlet("/getAllUserServlet")
public class getAllUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public getAllUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Userdao dao = new Userdao();
		List<User> allUsers	=dao.getAllUsers();
		RequestDispatcher dispatcher = request.getRequestDispatcher("ShowUsers.jsp");
		request.setAttribute("allUsers", allUsers);
		dispatcher.forward(request, response);
	
	
	}


}
