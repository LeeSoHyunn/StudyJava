<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("utf-8");

String name = request.getParameter("name");
Double hei = Double.parseDouble(request.getParameter("hei"));
Double wei = Double.parseDouble(request.getParameter("wei"));

double bmi = wei / (hei/100 * hei/100); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <!--  1. 
	  form태그를 이용해서 post형식으로 이름, 키와 몸무게를 입력받음
      2. req_quiz_result.jsp로 전송
      3. 해당 페이지 에서는 넘어간 값을 BMI지수를 처리
      4. BMI공식 = kg / (cm/100 * cm/100)  
      -> String형식으로 넘어가기 떄문에 Integer.parseInt(값)-> Double.parseDouble(값)
      화면에 이름, 키, 몸무게 BMI지수를 출력
      if을 통해 BMI지수가 25이상 과체중, 18 이하라면 저체중, 나머지는 정상으로 출력 -->
	이름:<%=name %><br>
	키:<%=hei %><br>
	몸무게:<%=wei %><br>
	bmi : <%=bmi %><br>
	
	<%
	if(bmi >=25){
	%>
		과체중
	<% 	
	}else if(bmi <=18){
	%>
		저체중
	<%	 
	}else{
	%>
		정상
	<% 
	}
	%>
</body>
</html>