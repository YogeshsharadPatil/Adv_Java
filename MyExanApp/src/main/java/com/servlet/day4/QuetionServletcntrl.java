package com.servlet.day4;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/QuetionServletcntrl")
public class QuetionServletcntrl extends HttpServlet {
	int qno;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//load the data from the model
		QuetionLoader loader = new QuetionLoader();
			List<Quetion> list =loader.loadQuestions();
		//get the one quetion
	if(qno<list.size()){
		Quetion q 	= list.get(qno++);
		//store this in Session
	HttpSession session = request.getSession();
	session.setAttribute("currQue", q);
	
	response.sendRedirect("viewQuetion.jsp");
	}else {
		response.sendRedirect("Score.jsp");
	}
			
	}



}
