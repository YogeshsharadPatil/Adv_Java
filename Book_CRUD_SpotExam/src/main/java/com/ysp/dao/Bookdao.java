package com.ysp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ysp.entity.Book;

public class Bookdao {
	String url = "jdbc:mysql://localhost:3306/advjava";
	String username = "root";
	String pwd = "cdac";

	String insertbook = "insert into tbl_book(title,author,price) values (?,?,?)";
	String selectbooks = "select * from tbl_book";
	String updatebook = "update tbl_book set title=?, author=?, price = ? where id = ?";
	String deletebook = "delete from tbl_book where id = ?";

	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public void addBook(Book book) {
		try {
			Connection conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(insertbook);
			stmt.setString(1, book.getTitle());
			stmt.setString(2, book.getAuthor());
			stmt.setFloat(3, book.getPrice());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateBook(Book book) {
		try {
			Connection conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(updatebook);
			stmt.setString(1, book.getTitle());
			stmt.setString(2, book.getAuthor());
			stmt.setFloat(3, book.getPrice());
			stmt.setInt(4, book.getId());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Book> getAllBooks() {
		List<Book> booklist = new ArrayList<Book>();
		Book book = null;
		try {
			Connection conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(selectbooks);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				float price = rs.getFloat(4);
				book = new Book(id, title, author, price);
				booklist.add(book);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return booklist;
	}

	public void deleteBook(int id) {
		try {
			Connection conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(deletebook);
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
