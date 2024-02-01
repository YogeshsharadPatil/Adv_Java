<%@page import="com.ysp.entity.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Books</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  </head>
  <body>
   
  <div align="center">
 <div class="btn-group">
  <a href="http://localhost:8080/Book_CRUD_SpotExam/getAllBooksServlet" class="btn btn-primary active" aria-current="page">AllBooks</a>
  <a href="http://localhost:8080/Book_CRUD_SpotExam/addBook.jsp" class="btn btn-primary">Add Book</a> 
</div> 

	 <% List<Book> books = (List<Book>)request.getAttribute("booklist"); %> 
	<div>
	<table class="table">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Title</th>
      <th scope="col">Author</th>
      <th scope="col">price</th>
       <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  

 		<% for(Book book:books){ %>
    <tr>
    <th scope="row"><%= book.getId() %></th>
       <td><%= book.getTitle() %></td>
      <td><%= book.getAuthor() %></td>
      <td><%= book.getPrice() %></td> 
      <td>
      <a href="http://localhost:8080/Book_CRUD_SpotExam/EditForm.jsp?id=<%= book.getId()%>"><button type="button" class="btn btn-outline-primary">Update</button></a>
      <a href="http://localhost:8080/Book_CRUD_SpotExam/DeleteBookServlet?id=<%= book.getId()%>"><button type="button" class="btn btn-outline-danger">Delete</button></td></a>
    </tr>
    <%
    	
 } %> 
  
  </tbody>
</table>	
	</div>

</div>
  </body>
</html>