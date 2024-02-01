<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.ysp.Entity.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Users</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  </head>
  <body>
    <h1>Hello, world!</h1>
  <div align="center">
 <div class="btn-group">
  <a href="http://localhost:8080/SignUpCRUDJSp_servlet_jdbc/EditForm.jsp" class="btn btn-primary active" aria-current="page">Users</a>
  <a href="http://localhost:8080/SignUpCRUDJSp_servlet_jdbc/signuppage.jsp" class="btn btn-primary">Add User</a>
</div>

	<% List<User> users = (List<User>)request.getAttribute("allUsers"); %>
	<div>
	<table class="table">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Country</th>
       <th scope="col">Action</th>
      
    </tr>
  </thead>
  <tbody>

 		<% for(User user:users){ %>
    <tr>
    <th scope="row"><%= user.getId() %></th>
       <td><%= user.getName() %></td>
      <td><%= user.getEmail() %></td>
      <td><%= user.getCountry() %></td> 
      <td>
      <a href="http://localhost:8080/SignUpCRUDJSp_servlet_jdbc/EditForm.jsp?id=<%= user.getId() %>"><button type="button" class="btn btn-outline-primary">Update</button></a>
      <a href="http://localhost:8080/SignUpCRUDJSp_servlet_jdbc/DeleteUserServlet?id=<%= user.getId() %>"><button type="button" class="btn btn-outline-danger">Delete</button></td></a>
    </tr>
    <%
    	
 } %>
   
  </tbody>
</table>
	
	
	</div>



</div>
  </body>
</html>