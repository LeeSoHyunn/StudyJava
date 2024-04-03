package customermanager;

import java.util.Scanner;

import customermanager.oop.Customer;

public class CustomerManager {
	
	//배열에 저장할 수 있는 최대 고객수
	static final int MAX  =100;
	
	//Customer 객체의 배열을 선언 
	static Customer[] cusList = new Customer[MAX];

	//배열을 참조하기 위해서 인덱스를 사용
	static int index =-1;
	
	static int count =0; //고객 정보 저장 개수
	
	static  Scanner scan= new Scanner(System.in);
	
		// 이전에 만들어 놓은 고객관리 프로그램을 OOP형식으로 변경하여 재프로그래밍을 진행!
		//1. Customer클래스를 생성하고,
		//2. 관련 프로그램을 위에 생성한 Customer 클래스 기준으로 재작성하세요.
		
		
		//고객 관리 프로그램의 메뉴
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
					if(count >= MAX) {
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
					System.out.println("데이터를 수정합니다");
					if((index >=0)&&(index <count)) {
						System.out.println(index + "번째 데이터를 수정합니다.");
						updateCustomerData(index);
					}else {
						System.out.println("수정할 데이터가 선택되지 않았습니다.");
					}
					break;
					
				case 'o' :
				case 'd' : 
					System.out.println("데이터를 삭제합니다.");
					if((index >=0)&&(index <count)) {
						System.out.println(index + "번째 데이터를 삭제합니다.");
						deleteCustomerData(index);
					}else {
						System.out.println("삭제할 데이터가 선택되지 않았습니다.");
					}
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
			Customer c1 = new Customer(name, gender, email, birthYear);
			cusList[count] = c1;
			/*
			 * 	Customer c1 = new Customer();
			 *  c1. setName(name);
			 *  c1. setGender(Gender);
			 *  c1. setEmail(email);
			 *  c1. setBirthYear(birthYear);
			 *  세터사용
			 *  
			 * */
			
			count++;  //count번째 배열에 객체 저장 후에 count값 증가...
					
			
		}
		
		public static void printCustomerData(int index) {   //인덱스값을 받아서 고객정보를 불러옴
			System.out.println("=================CUSTOMER INFO==================");
			System.out.println("이름 : " +cusList[index].getName());  //private한 상태라 직접접근이 안됨. get~ 붙어야함
			System.out.println("성별 : " +cusList[index].getGender());
			System.out.println("이메일 : " +cusList[index].getEmail());
			System.out.println("출생년도 : " +cusList[index].getBirthYear());
			System.out.println("================================================");
		}

		
		public static void updateCustomerData(int index) {
			System.out.println("---------UPDATE CUSTOMER INFO----------");
			System.out.println("이름("+cusList[index].getName()+"): ");
			String name = scan.next();
			if(name.length() != 0) {     //입력값 검증....
				cusList[index].setName(name);
			}
			System.out.println("성별("+cusList[index].getGender()+") : ");
			cusList[index].setGender(scan.next());
			System.out.println("이메일("+cusList[index].getEmail()+") : ");
			cusList[index].setEmail(scan.next());
			System.out.println("출생년도("+cusList[index].getBirthYear()+") : ");
			cusList[index].setBirthYear(scan.nextInt());
		}
		
		public static void deleteCustomerData(int index) {
			for (int i = index; i < count -1; i++) {
				cusList[i] = cusList[i+1];
				
			}
			count --;
		}

	
}
