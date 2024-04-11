package com.jdbc.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Result;

public class UserDAO {
	// 데이터베이스와 연동해서 작업

	// 싱글톤 패턴은 하나의 객체만 생성하여 사용하도록 만드는 패턴 - 객체를 1개로 제한.
	// 여러개의 객체가 생성되게하면 메모리 과부하가 올 수 있는 경우에 사용.
	// DAO객체는 DB연동을 담당하는 클래스로 싱글톤 방식을 생성..

	// 1. 스스로의 객체를 멤버변수로 선언하고 1개로 제한.
	private static UserDAO instance = new UserDAO(); // static클래스 멤버변수로 바뀜

	// 2. 외부에서 객체를 생성할 수 없게 생성자에 private 설정
	private UserDAO() {
		// 생성자가 한번 동작할떄 다음과 같은 동작처리 ... 드라이버와 연결
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 호출시 에러 생성");
		}

	}

	// 3. 외부에서 객체를 요구할 때 getter를 써서 반환
	public static UserDAO getInstance() {
		return instance;
	}

	// -------- 중복되는 코드를 멤버변수로 선언------
	private String url = "jdbc:mysql://localhost:3306/jdbctest?serverTimezone=Asia/Seoul";
	private String user = "jdbc";
	private String password = "jdbc";

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	// --------기능을 메서드로 선언
	//회원가입
	public int join(UserVO vo) {
		int result =0;
		
		String sql = "insert into user values(?,?,?,?,?,?)";
		
		try {
			//Connection 객체생성
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getPhone1());
			pstmt.setString(5, vo.getPhone2());
			pstmt.setString(6, vo.getGender());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return result;
	}
	
	
	//로그인메서드
	public int login(String id, String pw) {
		int result = 0;
		
		String sql = "select* from user where id = ? and pw =?";
		
		try {
			//Connection 객체생성
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();

	        if (rs.next()) {
	            result = 1; 
	        } else {
	            result = 0; 
	        }
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return result;
	}
}





