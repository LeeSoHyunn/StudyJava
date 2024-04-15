<%@page import="com.myweb.user.model.UserVO"%>
<%@page import="com.myweb.user.model.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String address = request.getParameter("address");
	
	//DAO 객체 생성
	UserDAO dao = UserDAO.getInstance();
	
	//VO 객체생성
	UserVO vo = new UserVO(id,pw,name,email,address,null);
	
	//회원가입 전에 아이디가 존재하는 아이디인지 검사..
	int result = dao.IdConfirm(id);
	
	if(result ==1){ //아이디 중복, 경고 띄우고 회원가입창으로 돌아가기 %>
		<script>
			alert("아이디가 중복되었습니다.")
			history.go(-1); //뒤로가기
		</script>
	<%}else { //중복이 없는 경우 .. 회원가입 처리 진행 
		//insert 진행(회원가입)
		int result2 =dao.join(vo);
		
		if(result2 ==1){  //회원가입 성공%>
		<script>
			alert("회원가입을 축하합니다.")
			location.href= "user_login.jsp";
		</script>		
		<%}else{ //회원사입 실패 %>
		<script>
			alert("회원가입이 실패했습니다.")
			history.go(-1);
		</script>
	<%} %>
<%} %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>