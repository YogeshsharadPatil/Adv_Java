<%@page import="com.servlet.day4.Quetion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
		<%  
			Quetion q	=(Quetion)session.getAttribute("currQue");
		%>
		Q. <%= q.getQuetion() %><br>
		<form action="CalculateScore">
		<input type="radio" name = "op" value="1"><%= q.getOption1() %><br>
		<input type="radio" name = "op" value="2"><%= q.getOption2() %><br>
	 	<input type="radio" name = "op" value="3">.<%= q.getOption3() %><br>
		<input type="radio" name = "op" value="4"><%=q.getOption4() %><br>
		<button type="submit">Next Quetion</button>
		</form>
		<!-- <a href="QuetionServletcntrl">Next Quetion</a> -->
</body>
</html>