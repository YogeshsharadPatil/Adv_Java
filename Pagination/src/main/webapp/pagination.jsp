<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link rel ="stylesheet" href="pagination.css">
</head>
<body>
	<h1 style="text-align:center">Welcome in the World of Ysp</h1>
	
	<%! int offset = 0;
	%>
	
	<%
	String move =	request.getParameter("move");
	if(move!=null){
		if(move.equals("prev")){
			offset -= 5; 
		}else if(move.equals("next")){
			offset += 5; 
		}
	}
		Connection conn = null;
		try{
			//make connection
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","cdac");
			//fetch data	
			String getdata = "select id,name,quant,price from products limit 5 offset ?";
				PreparedStatement stmt = conn.prepareStatement(getdata);
				stmt.setInt(1, offset);
			//execut the select query
				ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int quant = rs.getInt(3);
				int price = rs.getInt(4);
%>
			<div class="card pg" style="width: 18rem;">
  				<div class="card-body">
   				 <h5 class="card-title"><%= name %></h5>
   				 <p class="card-text"> Id : <%= id %></p>
    			<p class="card-text"> Quantity : <%= quant %></p>
    			<p class="card-text"> price : <%= price %></p>
    			<a href="#" class="btn btn-primary">Buy</a>
  			</div>
			</div>
<% 
			}
			
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	%>

<div class="prevnext">
<a href="pagination.jsp?move=prev">Prev</a> |
<a href ="pagination.jsp?move=next">Next</a>
</div>


</body>
</html>