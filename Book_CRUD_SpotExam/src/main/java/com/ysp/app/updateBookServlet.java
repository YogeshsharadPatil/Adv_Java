package com.ysp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysp.dao.Bookdao;
import com.ysp.entity.Book;

/**
 * Servlet implementation class updateBookServlet
 */
@WebServlet("/updateBookServlet")
public class updateBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public updateBookServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id 	= Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		float price = Float.parseFloat(request.getParameter("price"));
		
		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setAuthor(author);
		book.setPrice(price);
		
		Bookdao dao = new Bookdao();
		dao.updateBook(book);
		
		
		
		PrintWriter out = response.getWriter();
		out.write("Book details updated  Successfully");
		
		
		
	}




}
