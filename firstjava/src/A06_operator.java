
public class A06_operator {

	public static void main(String[] args) {
		// 연산자
		
		int a = 7 , b=3;
		// 산술연산자
		System.out.println("****산술연산자 ***");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);  //나누기는 같은 타입인 경우 해당 타입으로 출력
		System.out.println(a/3.0); //실수 타입과 정수가 연산하게 되면, 실수타입으로 출력
		System.out.println(a%b); //나머지 연산(mod) 난수생성
		System.out.println(a^b); //제곱승처리 아님.. 비트연산자..
		System.out.println((int)Math.pow(a,b)); //제곱
		
	
		// 비교연산자(비교 연산자의 결과는 boolean 타입) 참/거짓 밖에안나옴
		System.out.println("***비교 연산자***");
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b); //같은 경우 true
		System.out.println(a != b); //다를 경우 true
		
		
		// 논리연산자
		//&& : and 연산 둘 모두 true 일때 ture(두 가지 조건 모두 만족해야 true) "논리곱"
		//|| : or 연산 둘중 하나만 ture여도 ture(두가지 조건 중 하나만 만족시켜도 ture) "논리합"
		
		
		System.out.println("***논리얀산자***");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false&& false);
		System.out.println("결과 : " + (a >b && a/b ==2)); //ㄷ[드코드
		
		System.out.println(true || true);
		System.out.println(true|| false);
		System.out.println(false|| true);
		System.out.println(false || false);
		
		// 대입연산자
		System.out.println("***대입 연산자***");
		a = 10;
		System.out.println(a);
		
		// 복합대입연산자
		a += 2;
		System.out.println(a);
		a += 5;
		System.out.println(a);
		a += 10;
		System.out.println(a);
		a += 7;
		System.out.println(a);
		a += 3;
		System.out.println(a);
		
		// 삼항연산자
		// 비교 참:거짓
		a=7;
		b=4;
//		                1항          2항          3항
		String answer = a > b? "a가 큽니다." : "b가 큽니다";
		System.out.println(answer);
		
		int Value =a > b?10:5;
		System.out.println(Value);
		System.out.println();
		// 단항연산자
		a=10;
		
		System.out.println("**단항연산 **");
		a++;  //a의 값을 1 증가 시킵니다.(후치-값을 처리한 후 증가
		System.out.println(a);
		++a;
		System.out.println(a);
		--a;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		a=7;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println();
		
		
		// ! : boolean 타입에서만 사용 --연산자 우선순위 제일 높음
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(a > b); 
		System.out.println(!(a > b)); //괄호 넣어서 연산자 우선순위 만듷어도댐
		
		
		// ~ : 비트반전
		System.out.println(10);
		//2진수
		// 0|000 0000 0000 0000 0000 0000 0000 1010 => 10
		// 1|111 1111 1111 1111 1111 1111 1111 0101 => -11 <-보수관계
		// S| => signed bit(0이면 양수, 1이면 음수)
		System.out.println(~10);
		
		//비트연산
		//이진법으로 계산하는 연산
		//&, |, >>비트를왼쪽, <<비트를오른쪽, ^백타적논리학XO
		a= 7; // 0000 0111
		b=3;  // 0000 0011
		
		System.out.println("*** 비트 연산 ***");
		System.out.println(a & b);
		//      0000 0111
		//   &  0000 0011   &은 서로 비교 0+1 => false
		// ================
		//      0000 0011
		
		System.out.println(a | b);
		//      0000 0111
		//   |  0000 0011   
		// ================
		//      0000 0111
		
		System.out.println(a ^ b);
		//      0000 0111
		//   ^  0000 0011   서로 값이 같은것만 true
		// ================
		//      0000 0100  1 true 0 false
		
		System.out.println(a << b);
		//      0000 0111
		//   <<         3  
		// ================
		//      0011 1000                0= 2의 1승
		
		System.out.println(a >> b);
		//      0000 0111
		//   >>         3   
		// ================
		//      0000 0000 (111)<-밀림
	}

}
