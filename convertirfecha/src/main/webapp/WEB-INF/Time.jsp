<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time</title>
<link rel="stylesheet" type="text/css" href="/css/Style.css">
<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<h1 id="hora"> <c:out value="${hora} "></c:out> </h1>
</body>
</html>