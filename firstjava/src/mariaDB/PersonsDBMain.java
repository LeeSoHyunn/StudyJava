package mariaDB;
import java.util.List;
import java.util.Scanner;

public class PersonsDBMain {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("[PersonsDB 처리 프로그램]");
			System.out.println("1. 전체 조회");
			System.out.println("2. 선택 조회");
			System.out.println("3. 레코드 추가");
			System.out.println("4. 레코드 수정");
			System.out.println("5. 레코드 삭제");
			System.out.println("0. 종료");
			System.out.println("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			switch(sel) {
			case 1:
				selectAll();
				break;
			case 2:
				selectOne();
				break;
			case 3:
				insert();
				break;
			case 4:
				update();
				break;
			case 5:
				delete();
				break;
			case 0:
				System.out.println("프로그램 종료합니다");
				System.exit(0);
			default:
				System.out.println("잘못된 값을 입력했습니다.");
			}
		}
	}
	
	static void selectAll() {
		PersonsDAO1 dao = new PersonsDAO1();
		List<PersonsVO1> list = dao.selectAll();
		for (PersonsVO1 vo : list) {
			System.out.println(vo);
		}
	}

	static void selectOne() {
		PersonsDAO1 dao = new PersonsDAO1();
		System.out.println("출력할 레코드의 ID를 입력하세요.");
		int id = scan.nextInt();
		PersonsVO1 vo = dao.selectOne(id);
		System.out.println(vo);
	}

	static void insert() {
		PersonsDAO1 dao = new PersonsDAO1();
		PersonsVO1 vo = new PersonsVO1();
		System.out.println("레코드 추가하기!!");
		System.out.println("lastName(성) 입력: ");
		vo.setLastname(scan.next());
		System.out.println("firstname(이름) 입력: ");
		vo.setFirstname(scan.next());
		System.out.println("age(나이) 입력: ");
		vo.setAge(scan.nextInt());
		System.out.println("city(도시) 입력: ");
		vo.setCity(scan.next());
		
		int result = dao.insertPersons(vo);
		if(result !=0) System.out.println("레코드 추가를 성공했습니다.");
		else System.out.println("레코드 추가를 실패했습니다.");
	}

	static void update() {
		PersonsDAO1 dao = new PersonsDAO1();
		PersonsVO1 vo = new PersonsVO1();
		System.out.println("레코드 수정하기!!");
		
		//기존 정보 불러오기
		System.out.print("수정할 레코드 id를 입력하세요: ");
		vo = dao.selectOne(scan.nextInt());
		
		System.out.println("lastname("+vo.getLastname()+") 수정: ");
		vo.setLastname(scan.next());
		System.out.println("firstname("+vo.getFirstname()+") 수정: ");
		vo.setFirstname(scan.next());
		System.out.println("age("+vo.getAge()+") 수정: ");
		vo.setAge(scan.nextInt());
		System.out.println("city("+vo.getCity()+") 수정: ");
		vo.setCity(scan.next());
		
		PersonsDAO1 dao2 = new PersonsDAO1();
		int result = dao2.insertPersons(vo);
		if(result !=0) System.out.println("레코드 수정에 성공했습니다.");
		else System.out.println("레코드 수정에 실패했습니다.");
		

	}
	static void delete() {
		PersonsDAO1 dao = new PersonsDAO1();
		System.out.print("삭제할 ID를 입력하세요 : ");
		dao.deletePersons(scan.nextInt());
		System.out.println("삭제했습니다.");
	}

}