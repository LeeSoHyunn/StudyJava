<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String num =request.getParameter("num");
	Integer sel = Integer.parseInt(num);
 
 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>req_video_ok.jsp</title>
</head>
<body>
	<%
	if(num ==null){
	%>
	잘못된 접근입니다.
	<%}else if(sel == 1){
	%>
	<div align="center">
		<h2>파이썬 수업</h2>
		<p>파이썬 수업 중에 하나..</p>
		<hr>
		<iframe width="640" height="480" src="https://www.youtube.com/embed/kWiCuklohdY" title="파이썬 코딩 무료 강의 (기본편) - 6시간 뒤면 여러분도 개발자가 될 수 있어요 [나도코딩]" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
	
	</div>
	<%
	}else if(sel==2){
	%>
	<div align="center">
		<h2>자바 수업을 리뉴얼했습니다.</h2>
		<p>생활코딩 자바 수업..</p>
		<hr>
		<iframe width="796" height="448" src="https://www.youtube.com/embed/NQq0dOoEPUM" title="자바 코딩 무료 강의 (기본편) - 9시간 뒤면 여러분도 개발자가 될 수 있어요" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
	<%
	}
	%>
	</div>
</body>
</html>