<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%
	String date = (String)request.getAttribute("serverTime");

%>
<html>
<head>
	<title>Home</title>
	<meta charset="UTF-8">
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is <%=date %> </P>
테스트테스트!!!

<a href="Mybatis/board/list.do">Mybatis/board/list.do</a>

</body>
</html>










