package mariaDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class PersonsDAO1 {
	
	//멤버변수
	private String url = "jdbc:mariadb://localhost:13306/testdb";
	private String user = "root";
	private String password = "root1234";
	
	//DB 연동을 위한 객체 선언
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	//생성자
	public PersonsDAO1() {
		try {
			//드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("connection 객체생성!");
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
			System.out.println(ce.getMessage());
		}catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		}
	}
	
	public PersonsDAO1(String url, String user, String password) {
		try {
			
			this.url = url;
			this.user = user;
			this.password = password;
			
			//드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
			System.out.println(ce.getMessage());
		}catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		}
	}

	//insert
	public int insertPersons(PersonsVO1 vo) {
		int result = 0;
		
		String sql = "insert into Persons(lastname, firstname, age, city)"
				+ "values('"+vo.getLastname()+"', '"+vo.getFirstname()+"',"+vo.getAge()+" ,'"+vo.getCity()+"')";
		
		try {
			//Statement 객체 생성
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("SQL 연동 에러");
			System.out.println(e.getMessage());
			
		}finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		return result;
	}
	
	
	//selectAll
	
	public List<PersonsVO1> selectAll() {
		List<PersonsVO1> list = new ArrayList<>();
		
		String sql = "select * from Persons Order by id desc";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String lastName = rs.getString("lastname");
				String firstName = rs.getString("firstname");
				int age = rs.getInt("age");
				String city = rs.getString("city");
				
				PersonsVO1 vo = new PersonsVO1(id, firstName, lastName, age, city);
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {}
		}
		
		return list;
	}
	
	//selectOne , id값 가지고 작업
	public PersonsVO1 selectOne(int id) {
		PersonsVO1 vo = null;
		
		String sql = "select * from persons where id = '"+id+"'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				vo = new PersonsVO1();
				vo.setId(rs.getInt("id"));
				vo.setLastname(rs.getString("lastname"));
				vo.setFirstname(rs.getString("firstname"));
				vo.setAge(rs.getInt("age"));
				vo.setCity(rs.getString("city"));
			}else {
				System.out.println("찾는 DB가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {}
		}
		
		return vo;
	}
	//update
	public int updatePersons(PersonsVO1 vo) {
		int result = 0;
		
		String sql = "update persons set firstname = '"+vo.getFirstname()+"',"
				+"lastname = '"+vo.getLastname()+"',age = "+vo.getAge()+
				",city = '"+vo.getCity()+"' where id = "+vo.getId();
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
		}finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}
	
	//delete
	public int deletePersons(int id) {  //고유값만 넘김
		int result = 0;
		
		String sql = "delete from persons where id = '"+id+"'";
		
				try {
					stmt = conn.createStatement();
					result = stmt.executeUpdate(sql);
				} catch (Exception e) { 				//Exception이 제일 상위 클래스
					System.out.println("SQL 연동 실패");
					System.out.println(e.getMessage());
				}finally {
					try {
						if(stmt != null) stmt.close();
					} catch (Exception e2) {}
				}
				
				return result;
			}
	}
	
