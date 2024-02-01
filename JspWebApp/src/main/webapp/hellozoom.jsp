<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="hellozoom.css">
</head>
<body>
	<div class="hello">
	<%
		for(int i = 0 ;i<8;i++){
	%>
			<font size=<%= i %>>Hello Everyone</font><br>
	
	<%
		}
	%>
		</div>
	<div class="tbl">
	
	<h3>Table of 2 is </h3>
	<%! 
		int table = 2;
	%>
	
	<%
		for(int i = 1 ;i<=10;i++){
			
	%>
	<h4>2 *  <%= i %> = <%= 2*i %></h4>
	<%
		}
	%>
	</div>
	

	
	

</body>
</html>