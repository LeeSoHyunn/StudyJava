<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	//쿠키 사용하기
	Cookie[] arr= request.getCookies();  //반환타입 쿠키는 배열로 받음

	if(arr!=null){  //쿠키가 null이 아닌 경우 실행(즉, 쿠키가 존재할 때)
		for(int i =0; i<arr.length; i++){
			out.println(arr[i].getName()+"<br>");  //쿠키 이름 얻기
  			out.println(arr[i].getValue()+"<br>"); //쿠키 값 얻기
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>