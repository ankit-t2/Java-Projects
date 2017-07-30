<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% System.out.println("Inside hello.jsp"); %>

<form id="myform" action="firstPage" >
	<input name="partyClassification" type="text" value="Ankitjsp1"/>
	<button type="submit">Party Classification</button>
</form>
<form id="myform" action="hello" >
	<input name="name" type="text" value="SECRET"/>
	<button type="submit">hello</button>
</form>

</body>
</html>