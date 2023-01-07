<%@page import="java.util.Date"%>
<%@page import="org.apache.jasper.tagplugins.jstl.Util"%>
<%@page import="java.util.Date, java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String message=(String)request.getAttribute("message");
String sb=(String)request.getAttribute("sb");
%>
<h1><%=message%></h1>
<%=sb%><br>
</body>
</html>