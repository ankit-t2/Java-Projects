<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="testBeans.UserData" scope="session"/> 
<jsp:setProperty name="user" property="*"/> 

<jsp:useBean id="partyClass" class="testBeans.PartyClassificationData" scope="session"/>

<%!
    Date getDate()
    {
	    Date theDate = new Date();
        System.out.println( "In getDate() method" );
        return theDate;
    }
%>
<%
System.out.println("Evaluating jsp");
Date date = new Date();
out.println("Testing out.println");
out.println("<br>");
out.println(request.getRemoteHost()+ "<BR>");
int n=5;
%>

Hello World <%=getDate() %><BR>
You entered<BR>
Name: <%= user.getUsername() %><BR>
Email: <%= user.getEmail() %><BR>
Age: <%= user.getAge() %><BR>
<TABLE BORDER=2>
<%
    ArrayList<String> partyClassification = partyClass.getPartyClassification();
	int partyClassifiationSize = partyClassification.size();
	for ( int i = 0; i < partyClassifiationSize; i++ ) {
    	
        %>
        <TR>
        <TD>Number</TD>
        <TD><%= partyClassification.get(i) %></TD>
        </TR>
        <%
    }
%>
</TABLE>

<jsp:include page="hello.jsp"/>

</body>
</html>