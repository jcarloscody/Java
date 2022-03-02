<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>HELLO JSP</title>
</head>
<body>

	<h1>HELLO JSP</h1>
	
	<%out.println("sou vencedor!"); %>
	<%--comentário --%>
	<p>Data: <%= new Date() %> </p>
	<%!int cont = 0; %>
	<p>Contador: <%=++cont %></p>
</body>
</html>