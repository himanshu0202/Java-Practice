<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
public int add(int a,int b){
	return a + b;
}
%>
<% int i=1;
   int j=2;
   int k;
   k=i+j;
%>
The value of k is: <%= k %>

<%
k=add(34567,34567);
%>

<br>

<%= k %>
</body>
</html>