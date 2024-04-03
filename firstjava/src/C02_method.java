
public class C02_method {
	
	//메서드 method
	// 클래스의 행동 및 기능을 나타낸다. 다른 언어에서는 함수라고도 불리지만, 자바에서는 클래스 내부에만 정의할수 있기 때문에 메서드라고 함!!
	
	//메서드의 특징
	// -어떤 단어 뒤에 ()가 붙는 경우 -> 메서드
	// -한번 만들어 두면 여러번 사용할 수 있음 = 코드의 재사용
	// -여러 기능들을 묶어서 이름을 붙여 놓은 것이 메서드
	// -값을 반환할 수 있다.
	
	//메서드 형식
	//(접근 제한자) (static여부)-정적 반환타입 메서드명(매개변수타입, 매개변수이름) {
	//    여러가지 기능을 구현 ..
	// }
	//
	//반환타입 : 메서드가 모든 기능을 수행한 후에 전달할 반환 값의 타입을 지정
	//         반환할때 사용하는 키워드는 return을 이용한다 ex)return 10(반환할값);
	// - 반환 타입 종류 : int , String , Student, char, float, double, boolean...void
	// - void 타입을 지정한 경우 함수의 반환값이 없음... 즉, return으로 전달할 값이 없다는 의미
	//메서드명 : 메서드를 호출할때 사용한 이름(동사, 명사 ,형용사 섞어서 사용)
	//매개변수 : 함수를 호출하면서 () 안에 전달해 주는 값을 의미함.
	//매개변수 타입 : 매개변수의 타입을 지정...
	
	
	static int getInteger() {
		final int seed = 5;
		
		double result= 1;  // --int가 아니라 double이면 변경해여됨
		
		for(int i =1; i< seed; i++) {
			result = seed* result;
		}
		//반환값....
		return (int)result;
	}
	
	static void createRabbit() {
		System.out.println("================");
		System.out.println("    /) /)");  
		System.out.println("   (  . .)");
		System.out.println("   (    >♡");
		System.out.println("Have a Good Time");
		System.out.println("================");
	}
	
	static String makeBanner(String msg) {
		return "****"+msg+"****";
	}
	
	public static void main(String[] args) {
		//메서드 정보 확인 : 메서드를 가리키고 F2를 누르면 함수 정보 보기가 됨
		//메서드 정의된 곳으로 이동: 메서드를 가리키고 F3를 누르면 정의된 곳으로 이동
		
		//호출하면 콘솔에 토끼 출력하는 함수
		for(int i =0; i<10;i++) {
			createRabbit();
			
			//문자열을 넣으면 *를 붙여서 반환하는 메서드
			String result = makeBanner("알림");
			System.out.println(result);
			System.out.println(makeBanner("오늘 할일"));
			
			//정수형 값을 받는 메서드
			System.out.println(getInteger());
		}
	}

}
