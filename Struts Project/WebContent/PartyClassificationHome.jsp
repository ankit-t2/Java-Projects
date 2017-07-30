<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
function onClick()
{
    var elt = document.getElementById("partyClassification");

    if (elt.selectedIndex == -1)
        return null;

    alert(elt.options[elt.selectedIndex].text);
}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Party Classification Home Page</title>
</head>
<body>
<h2>Welcome to the Party Classification Home Page </h2><BR>

<form action="getSegmentDetails">

Please select the Party Classification:
<select id="partyClassification" name="partyClassification">
	<c:forEach items="${partyClassifications}" var="partyClass">
		<option value=<c:out value="${partyClass.key}" />> <c:out value="${partyClass.value}" /></option>
	</c:forEach>
</select> 
<input name="partyClassificationNarrative" type="hidden">
<BR>
<BR>
Please select Range Type:
<select name="rangeType">
<option value="SCORE_RANGE">SCORE_RANGE</option>
<option value="LIMIT_RANGE">LIMIT_RANGE</option>
</select>

<button type="submit"> Search </button>

</form>

</body>
</html>