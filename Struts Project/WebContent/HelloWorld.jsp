<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Hello World</title>
</head>
<body>
<% System.out.println("Inside HelloWorld.jsp"); %>
   Hello World, <s:property value="name"/> <BR>

<% System.out.println("Now printing subject"); 
	out.println("Inside scriptlet " + request.getAttribute("subject"));
%>
<BR>
   Hello World, subject is <s:property value="subject"/>
</body>
</html>
