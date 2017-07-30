<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Party Classification Detail Page</title>
</head>
<body>
<BR>
<BR>
<b>Party Classification Code:</b>       <c:out value="${partyClassification}"></c:out>
<BR>
<b>Party Classification Narrative:</b>  <c:out value="${partyClassificationNarrative}"></c:out>
<BR>
<BR>

<table border="1">
<tr>
<th>Segment ID</th>
<th>Range Type</th>
<th>Range Start</th>
<th>Range End</th>
</tr>

<c:forEach items="${segments}" var="segment">
<tr>
<td><c:out value="${segment.segmentID}"></c:out></td>
<td><c:out value="${segment.rangeType}"></c:out></td>
<td><c:out value="${segment.rangeStart}"></c:out></td>
<td><c:out value="${segment.rangeEnd}"></c:out></td>

</tr>
</c:forEach>
</table>
</body>
</html>