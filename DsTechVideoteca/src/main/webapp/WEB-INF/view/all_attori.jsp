<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>FILM</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>
</head>
<body>
<h2>Lista Attori</h2>	
	<table>
		<tr>
			<td>NOME</td><td>COGNOME</td><td>data_di_nascita</td><td>CF</td>
		</tr>
		<c:forEach items="${attori}" var="attori"  > 
			<tr>
			<td>${attori.nome}</td>
			<td>${attori.cognome}</td>
			<td>${attori.dataDiNascita}</td>
			<td>${attori.CF}</td>
			</tr>
		</c:forEach>
	</table>
	<br/>
</body>
</html>