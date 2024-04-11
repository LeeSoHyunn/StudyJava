<%@page import="java.util.Arrays"%>
<%@page import="java.util.UUID"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//자바 uuid 중복되지 않는 16진수 값 생성(16바이트 길이로 생성)
	UUID uuid = UUID.randomUUID();
	System.out.println(uuid);

	//split은 특정 문자열을 기준으로 자르는 메서드
	String struuid = uuid.toString();
	String[] arr = struuid.split("-");
	System.out.println(Arrays.toString(arr));
	
	session.setAttribute("auth", arr[1]);  //유효값 하나를 뺴서 auth에 저장
//	4바이트 -2바이트-2바이트
// c4df9c6e-f534-498d-ba5d-bda398d9e6ff	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>auth.jsp 예매하기인증</title>
</head>
<body>
	<h2>인증페이지</h2>
	<hr>
	<form action="auth_ok.jsp">
	<h3>인증문자 : <del><%=arr[1] %></del></h3>
	위 문자열을 입력하세요: <input type= "text" name="code" size="8">
	<input type="submit" value="인증">
	</form>
</body>
</html>