<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Secret Code</title>
</head>
<body style="text-align:center;">
	<c:if test="${!empty errors}">
		<p style="color:red;"><c:out value="${errors}"/></p>
	</c:if>
	<p>What is the code?</p>
	<form action="/process" method="POST">
		<input type="text" name="code">
		<br><br>
		<input type="submit" value="Try Code">
	</form>
</body>
</html>