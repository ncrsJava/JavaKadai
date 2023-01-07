<%@page import="java.util.Date"%>
<%@page import="org.apache.jasper.tagplugins.jstl.Util"%>
<%@page import="java.util.Date, java.text.SimpleDateFormat" %>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String message = "こんにちは！";
Date time1 = new Date();
SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd");
SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
String today1 = dateFormat1.format(time1);
String today2 = dateFormat2.format(time1);

%>

<h1><%=message%></h1>
  
YYMMDD形式：<%=today1%><br>
年月日 時刻表示：<%=today2 %></span>

<form method="post" action="SampleServlet" >
<p>現在時刻を表示します</p>
<input type="submit" value="取得">
</form>
</body>
</html>