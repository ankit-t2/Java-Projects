<!DOCTYPE html>
<%@ page import="java.util.*" %>
<html>

<head>
	<title>Sample JSP Page</title>
</head>
	
<body>
<jsp:useBean id="user" class="testBeans.UserData" scope="session"/>
<jsp:setProperty name="user" property="*"/> 

<jsp:useBean id="partyClass" class="testBeans.PartyClassificationData" scope="session"/>

<h1>Sample JSP Page</h1>
<h2>Time on server: <%= new Date() %></h2>
<p>
This is a simple JSP page for populating new bean
</p>

<%
		ArrayList<String> newArrayList = new ArrayList<String>();
		newArrayList.add("String1");
		newArrayList.add("String4");
		newArrayList.add("String6");
		partyClass.setPartyClassification(newArrayList);
		
%>
<p> <A HREF="index.jsp">Continue</A>


</body></html>