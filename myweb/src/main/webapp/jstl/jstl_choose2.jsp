<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.num >= 90}">
			A
		</c:when>
		<c:when test="${param.num >= 80}">
			B
		</c:when>
		<c:when test="${param.num >= 70}">
			C
		</c:when>
		<c:when test="${param.num >= 60}">
			D
		</c:when>
		<c:when test="${param.num < 60}">
			F
		</c:when>
	</c:choose>
</body>
</html>