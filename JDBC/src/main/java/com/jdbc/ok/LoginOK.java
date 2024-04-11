package com.jdbc.ok;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jdbc.domain.UserDAO;
import com.jdbc.domain.UserVO;

@WebServlet("/login_ok")
public class LoginOK extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginOK() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//폼데이터 처리
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		/*
		 * 1.UserVO객체 생성 
		 * 2. DAO에 login(id, pw) 메서드를 생성 
		 *   > sql = select* from user where id = ? and pw =?
		 * 3. login 메서드 안에서 excuteQuery() 구문으로 실행
		 *   > rs.next() 결과가 있으면 1, 없으면 0을 반환
		 * 4. login_ok에서는 세션을 id 로 저장하고 화면으로 이동
		 * 	  결과가 1인 경우, mypage.jsp
		 *     -> XXX님 환영합니다.
		 * 	  결과가 0인 경우, login_fail.jsp로 이동
		 *     -> 로그인 실패했습니다. 로그인 페이지로 이동 링크 생성
		 */
		
		//DAO 객체생성
		UserDAO dao = UserDAO.getInstance();
		
		//VO 객체생성
		int result = dao.login(id, pw);
		
		if(result == 1) {
			//자바에서 세션 사용방법
			HttpSession session =request.getSession();
			session.setAttribute("user_id", id);
			
			response.sendRedirect("mypage.jsp");
		}else { //실패시 처리
			response.sendRedirect("login_fail.jsp");
		}
	}

	
//	if(result == 1) {
//		response.sendRedirect("mypage.jsp");
//	}else { //실패시 처리
//		response.sendRedirect("join_fail.jsp");
//	}
}
