<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>login.jsp</title>
	<style type= "text/css">
		.wrap{
			width:257px;
			margin: 0 auto; /* 0은 상하마진, outo 좌우마진 */
			text-align: center;
		}
		.btn{
			width: 60px;
			height:50px;
			background-color:aqua;
		}
		
		table{
			border-collapse:collapse;
			border: 3px solid black;
		}
	</style>
</head>
<body>
<div class="wrap">
	<h2>리다이렉트 로그인 연습</h2>
	<hr>
	
		<form action="res_Login_ok.jsp" method="post">
			<table border="1">
				<tr>
					<td><input type="text" name="id" placeholder="아이디"></td>
					<td rowspan="2"><input type="submit" value="로그인" class="btn"></td>
					<!-- rowspan 위 아래로 합침 -->
				</tr>
				<tr>
					<td><input type="password" name="pw" placeholder="비밀번호"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>