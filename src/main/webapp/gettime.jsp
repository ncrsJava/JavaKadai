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
String date3=(String)request.getAttribute("date3");
String date4=(String)request.getAttribute("date4");
%>
<h1><%=message%></h1>
YYMMDD形式：<%=date3%><br>
年月日 時刻表示：<%=date4 %></span>
</body>
</html>