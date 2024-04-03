import java.util.Scanner;

public class C00_customerManager {
	
	//고객 정보를 저장할 수 있는 배열 지정...
	
	static final int Max =100;  //final은 한번 입력된 값을 변경할 수 없음
	
	//고객 정보를 저장할 변수를 배열로 선언 : 이름, 성별, 이메일, 출생년도
	static String[] nameList = new String[Max]; //이름저장
	static String[] genderList = new String[Max]; //성별저장
	static String[] emailList = new String[Max]; //이메일저장
	static int[] birthYearList = new int[Max]; //출생년도 저장
	
	//배열을 참조하기 위해서 인덱스가 필요함..
	static int index = -1; //배열의 인덱스 시작은 0부터, 때분에 최소 인덱스 -1이되어야함. 처음 생성할때는 
	
	//배열의 처음 선언한 크기보다 같거나 작은 개수의 자료를 저장
	//때문에 현재 데이터가 몇개 저장되어 있는지 알 수 있는 변수가 필요
	static int count =0; //저장개수
	
	//기본 입력장치로부터 데이터를 입력 받기 위해서 Scanner 객체 생성
	static Scanner scan = new Scanner(System.in);

	// 기능 :조회 수정삭제 -> 메서드
	

	public static void main(String[] args) {
		// 고객 관리 프로그램 메뉴
		while(true) {   //무한루프 사용
			//고객 메뉴 ui(TEXT UI)
			System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count , index);
			System.out.println("메뉴를 입력하세요");
			System.out.println("(I)nesert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력");
			String menu = scan.next();
			menu = menu.toLowerCase();  //대소문자 구분없앰(사용자가 입력할때)
			
			//메뉴 선택시 동작을 구현
			switch(menu.charAt(0)) {
			case 'ㅑ':
			case 'i' : //인서트
				System.out.println("고객 정보 입력을 시작합니다.");
				if(count >= Max) {
					System.out.println("더 이상 저장할 수 없습니다.");
				}else {
				//	저장을 위한 메서드
					insertCustomerData();
					System.out.println("고객 정보를 저장했습니다.");
				}
				break;
			case 'ㅔ' : 
			case 'p' : //previous
				System.out.println("이전 데이터를 출력합니다.");
				if(index <=0 ) {   //이전 데이터가 존재하지 않는 경우, 인덱스 0값도 있기때문
					System.out.println("이전 데이터가 존재하지 않습니다.");
				}else {
					index --;
					printCustomerData(index);
				}
				break;
			case 'ㅜ' : 
			case 'n' : 
				System.out.println("다음 데이터를 출력합니다.");
				if(index >= count -1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");
				}else {
					index ++;
					printCustomerData(index);
				}
				break;
				
			case 'ㅊ' :
			case 'c' : 
				System.out.println("현재 데이터를 출력합니다.");
				if((index >=0)&&(index <count)) {
					printCustomerData(index);
				}else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
				
			case 'ㅕ' :
			case 'u' : 
				break;
				
			case 'o' :
			case 'd' : 
				break;
				
			case 'ㅂ' : 
			case 'q' : 
				System.out.println("프로그램 종료합니다.");
				scan.close();
				System.exit(0);  //프로세스 종료 코드는 0,정상종료
				break;
			default :System.out.println("메뉴를 잘못 입력했습니다. 다시 선택해주세요");
			}
		}

	}

	public static void insertCustomerData() {
		// 이름, 성별, 이메일, 출생년도 입력
		System.out.print("이름 : ");
		String name= scan.next();
		System.out.print("성별 : ");
		String gender= scan.next();
		System.out.print("이메일 : ");
		String email= scan.next();
		System.out.print("출생년도 : ");
		int birthYear= scan.nextInt();
		
		//고객 객체를 배열이 저장
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count]= email;
		birthYearList[count]=birthYear;
		count++;  //count번째 배열에 객체 저장 후에 count값 증가...
				
		
	}
	
	public static void printCustomerData(int index) {   //인덱스값을 받아서 고객정보를 불러옴
		System.out.println("=================CUSTOMER INFO==================");
		System.out.println("이름 : " +nameList[index]);
		System.out.println("성별 : " +genderList[index]);
		System.out.println("이메일 : " +emailList[index]);
		System.out.println("출생년도 : " +birthYearList[index]);
		System.out.println("================================================");
	}

	
	public static void updateCustomerData(int index) {
		System.out.println("---------UPDATE CUSTOMER INFO----------");
		System.out.println("이름("+nameList[index]+"): ");
		String name = scan.nextLine();
		if(name.length() != 0) {     //입력값 검증....
			nameList[index] = name;
		}
		System.out.println("성별("+genderList[index]+") : ");
		genderList[index] = scan.next();
		System.out.println("이메일("+emailList[index]+") : ");
		emailList[index] = scan.next();
		System.out.println("출생년도("+birthYearList[index]+") : ");
		birthYearList[index] = scan.nextInt();
	}
	
	public static void deleteCustomerData(int index) {
		for (int i = index; i < count -1; i++) {
			nameList[i] = nameList[i+1];
			genderList[i] = genderList[i+1];
			emailList[i] = emailList[i+1];
			birthYearList[i] = birthYearList[i+1];
			
		}
		count --;
	}
}
