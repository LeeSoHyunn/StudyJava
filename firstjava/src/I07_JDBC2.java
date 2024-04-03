import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class I07_JDBC2 {

	public static void main(String[] args) {
		// select 처리..

		// 객체 생성
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connection 객체 생성 - DriverManager.getConnection()
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root1234");
			// 3. Statement 객체 생성
			stmt = conn.createStatement();

			// 4. SQL 작성
			String sql = "select * from persons";

			// 5. Statement 객체를 통한 동작 - executeQuery() -> ResultSet 객체
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id"); // id이면 전달해주세요
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				int age = rs.getInt("age");
				String city = rs.getString("city");

				System.out.printf("id : %d, 성 : %s , 이름 : %s , 나이: %d , 도시 : %s \n", id, firstname, lastname, age,
						city);
			}
			rs.close();
			
			// 입력 값을 받아서 해당 결과를 출력하는 프로그램을 만드세요.
			// 1. id 값을 입력 받아 출력 - 결과가 없으면 없다고 출력
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("id를 입력하세요. ");
			
			int inputid = scan.nextInt();
			
			//sql 작성
			String sql1 = "select * from persons where id= "+inputid;
			
			rs = stmt.executeQuery(sql1);
			
			if(rs.next())  {//결과값이 하나만 나와서 if문 사용
				System.out.printf("id : %d, 성 : %s , 이름 : %s , 나이: %d , 도시 : %s \n",
						rs.getInt("id"), rs.getString("lastname"), rs.getString("firstname"),
						rs.getInt("age"), rs.getString("city"));
			}else {
				System.out.println("입력한 id의 결과가 없습니다.");
			}
			
			
			// 2. 이름을 통한 내용을 출력 - 단 ,이름에 일부를 입력해도 출력해야 합니다.
			System.out.println("이름 입력을 통한 내용 출력");
			//2번
			System.out.print("검색할 이름을 입력하세요:");
			String searchName =scan.next();
			
			//SQL 구문
			String sql2 = "select * from persons where firstname like '%"
					+searchName+"%'";
			//SQL 실행
			rs = stmt.executeQuery(sql2);
			while (rs.next()) {
				int id = rs.getInt("id"); // id이면 전달해주세요
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				int age = rs.getInt("age");
				String city = rs.getString("city");

				System.out.printf("id : %d, 성 : %s , 이름 : %s , 나이: %d , 도시 : %s \n", id, firstname, lastname, age,
						city);
			}

		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("SQL연동 실패");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		}
	}
