<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error_view.jsp"%>  <!-- 에러 발생시 보요질 페이지를 작성 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.getParameter("num").charAt(0);
	%>
</body>
</html>