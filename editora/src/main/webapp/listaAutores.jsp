<%@page import="java.util.List, br.com.zup.editora.Autores"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Autores</title>
</head>
<body>

<h3>Lista Autores:</h3><br>

<ul>
	<c:forEach items="${autores}" var="autor">
		<li>
			Nome: ${autor.nome} </br>
			E-mail: ${autor.email}
			
		</li>
	</c:forEach>
</ul>

</body>
</html>