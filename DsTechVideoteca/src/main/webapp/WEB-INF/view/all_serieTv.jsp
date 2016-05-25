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
<h2>Lista Serie TV</h2>	
	<table>
		<tr>
			<td>TITOLO</td><td>CATEGORIA</td>
		</tr>
		<c:forEach items="${serieTv}" var="serieTv"  > 
			<tr>
			<td>${serieTv.titolo}</td>
			<td>${serieTv.categoria.nome}</td>
			</tr>
		</c:forEach>
	</table>
	<br/>
</body>
</html>