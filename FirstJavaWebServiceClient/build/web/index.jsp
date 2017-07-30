<%-- 
    Document   : index
    Created on : Nov 14, 2016, 3:52:26 PM
    Author     : an268536
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.wipro.NoNameWebService_Service service = new com.wipro.NoNameWebService_Service();
	com.wipro.NoNameWebService port = service.getNoNameWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = "Raka and Sabu";
	// TODO process result here
	java.lang.String result = port.hello(name);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
