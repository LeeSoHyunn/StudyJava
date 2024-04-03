
public class A04_varTypes {

	public static void main(String[] args) {
		/*
		 *  정수형 : 양의 정수, 음의 정수, 0
		 *   - byte(1byte)
		 *   - char(2byte)  *주의 -한글자의 크기
		 *   - short(3byte)
		 *   - int(4byte)    **정수형 기본타입
		 *   - long(8byte)  *큰 정수값을 표기하기 위해서.. 21억 넘어갈거같으면 ㅋ
		 *  
		 *   1바이트는 8비트 비트는 0,1로 되어잇는 2진수(진수 불이켜질때)
		 *   바이트는 0~256의 숫자
		 *   
		 *   - 1byte(byte, char(C언어) )
		 *     signed: -128 ~ 127, unsigned : 0~255
		 *   - 2바이트(short, char(java)) 2의 16승
		 *     signed: -2^15 ~ + 2^15-1(0이 포함되기떄문에 -1) , unsigned : 0~65535
		 *   - 4바이트(int)
		 *     signed: -2^31 ~ 2^31-1, unsigned: 0~4,294,967,295
		 *   - 8바이트(long )
		 *     signed : -2^63 - +2^63-1
		 *   
		 */
		
	//	     변수      상수(바뀔수잇음)
		byte _byte = -128;    //1111 1111 <-128이거외에는 버린다
		short _short = 10;
		char _char = 65535;  //캐릭터타입 문자로 출력하기때문
		int _int = 2_100_000_000;   //언더바로 자릿수표시 21억넘어가면 int로 안됨
		long _long = 22_0000_0000L; //long은 정수뒤에 L을 붙여서 사용!
		
		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_char);
		System.out.println(_int);
		System.out.println(_long);
		
		/*
		 * 실수형(거의 그래픽 계에서 많이 사용됨)
		 *   - 복잡하고 정확한 수학 계산이 필요한 분야에서 주로 사용
		 *   - 부동소수점 방식을 사용
		 *   
		 *   float(4바이트)
		 *   double(8바이트) **기본타입
		 * 
		 * 
		 * */
		
		float _float = 1.234f;
		//float형 리터럴은 뒤에 f를 붙임
		double _double = 1.234;
		
		/*
		 * 참/거짓
		 *  boolean (true/false)
		 * 
		 * */
		boolean _true = true;
		boolean _false = false;
		
		boolean goon_pil = true;
		
		// 위에는 다 기본형자료
		
		
		/*
		 * 
		 * 참조형(클래스 타입)
		 *    String(문자열)
		 *    그외 모든 타입.. 대문자로 시작하는 모든타입..
		 * 
		 * */
		
		//데이터 타입이 소문자로 시작하는 타입 : 기본타입
		//데이터 타입이 대문자로 시작하는 타입 : 참조 타입(데이터의 주소값)
		String comment = "앞으로 약 35분 후에 점심";
		System.out.println(comment + goon_pil );
	}

}
