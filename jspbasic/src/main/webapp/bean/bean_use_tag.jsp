<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id = "user" class="com.bean.User" scope="request"></jsp:useBean>
	<jsp:getProperty property="id" name="user" />
	<jsp:getProperty property="name" name="user" />
</body>
</html>