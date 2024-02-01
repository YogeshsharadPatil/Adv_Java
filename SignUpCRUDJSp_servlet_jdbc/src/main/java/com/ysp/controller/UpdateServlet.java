package com.ysp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysp.Entity.User;
import com.ysp.dao.Userdao;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id 	= Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		user.setCountry(country);

		Userdao dao = new Userdao();
		boolean res =dao.update(user);
		
		if(res==true) {
			System.out.println("Updated Successfully");
		}
	}

}
