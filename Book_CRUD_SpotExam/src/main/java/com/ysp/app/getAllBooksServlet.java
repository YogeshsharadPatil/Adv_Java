package com.ysp.app;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysp.dao.Bookdao;
import com.ysp.entity.Book;

/**
 * Servlet implementation class getAllBooksServlet
 */
@WebServlet("/getAllBooksServlet")
public class getAllBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAllBooksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Bookdao dao = new Bookdao();
		List<Book> booklist= 	dao.getAllBooks();
		RequestDispatcher dispatcher = request.getRequestDispatcher("ShowBooks.jsp");
		request.setAttribute("booklist", booklist);
		dispatcher.forward(request, response);
	}


}
