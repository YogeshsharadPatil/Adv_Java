<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>Edit Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            box-sizing: border-box;
        }

        button {
            background-color: #4caf50;
            color: #fff;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <form action="UpdateServlet" method="Get">
    <% int id = Integer.parseInt(request.getParameter("id")); %>
     <input type="hidden" name="id" value="<%= id %>">
        <h2>Edit Form</h2>
        <label for="username">Username:</label>
        <input type="text" id="username" name="name" >

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" >

        <label for="confirm_password">country</label>
        <input type="text" id="confirm_password" name="country" >

        <button type="submit">Register</button> 
        <a href="http://localhost:8080/SignUpCRUDJSp_servlet_jdbc/getAllUserServlet"><button type="button" class="btn btn-outline-info">See User</button></a>
        
    </form>

</body>
</html>
