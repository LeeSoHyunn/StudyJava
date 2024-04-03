
public class B08_variableLifeTime {
	
	static int c; //클래스 멤버변수(클래스에서 하나만 만들어짐,클래스가 만들어져야 사용가능) -클래스에 직접 사용하는 변수로 객체 생성과 상관X
	              // 안쪽까지 사용가능
	int b =8; //인스턴스 멤버변수(필드,속성...) --객체가 생성되어야 쓸수잇음

	public static void main(String[] args) {
		// 변수 수명
		
		//{} 블럭 내부에서 선언된 변수는 지역변수 로 {}을 벗어나면 사라진다.
		//변수가 살아있는 범위를 변수의 영역(Scope)라고 부릅니다
		//변수의 영역만 겹치치 않는다면 같은 이름의 변수를 사용할 수 있다.
		
		
		int b=5; //지역변수
		System.out.println("main method의 b: " + b);
		c=10;
		System.out.println("Class 멤버변수 c : "+c);
		
		//객체 생성
		B08_variableLifeTime obj = new B08_variableLifeTime(); //객체생성
		System.out.println("class의 b(인스턴스 멤버변수) : " + obj.b);
		B08_variableLifeTime obj2 = new B08_variableLifeTime();
		
		obj2.b = 100;//객체 ,obj2 객체의 b인스턴스 변수에 값을 수정 .. 객체는 다른 
		System.out.println("class의 b(obj 멤버변수) : " + obj.b);
		System.out.println("class의 b(obj2 인스턴스 멤버변수) : " + obj2.b);
		
		//클래스 변수...
		System.out.println("obj.c에 값을 대입하기 전: "+obj.c);
		obj.c=20;
		System.out.println("obj.c에 값을 대입하기 후: "+obj.c);
		System.out.println("대입한 후 obj2.c : "+ obj2.c);
		
/*		B08_variableLifeTime.c = 200;  //모든 클래스가 영향을 받음
		System.out.println("대입한후 obj.c: "+obj.c);
		System.out.println("대입한 후 obj2.c : "+ obj2.c);
*/
		if(true) {    //무조건 실행
			int a = 10; //지역변수
			System.out.println(a);
			a=7;
			System.out.println("main 메서드의 b : "+b);
		}//블록은 영역범위
//		a=7;
		if(true) {
			int a =20;
			System.out.println(a);
		}
		
		for (int i =0; i <10; i++) {
			//for문에서 사용되는 int i (초기값){}내에서 선언된 지역변수
			//int i 의 값은 for문을 벗어날 수 없음...
		}
		
	}

}
