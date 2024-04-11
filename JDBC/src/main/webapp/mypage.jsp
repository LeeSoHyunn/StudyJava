<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	//세션을 이용해서 인증되지 않은 사람들을 login페이지로 리다이렉트
	if(session.getAttribute("user_id") == null){
		response.sendRedirect("login.jsp");
	}
	String id = (String)session.getAttribute("user_id");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=id %> 님 환영합니다.
	<a href="logout.jsp">로그아웃</a>
	<a href="modify.jsp">정보수정</a>
	<a href="delete.jsp">회원탈퇴</a>
</body>
</html>