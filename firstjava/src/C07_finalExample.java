

/*
 * Uage Modifier final
 * 의미
 * - 일반적으로 final은 그 값이 변하지 않음을 의미함
 * - 변수에 final이 붙으면 그 값은 변경할 수 없어요. 때문에 static 하고 같이 사용시 상수로 사용
 * - 메서드에 final이 붙으면 그 메서드는 재정의할 수 없어요. 재정의 될 필요가 없는 메서드일때
 *   개발자가 재정의를 허용하지 않기 위해서 사용합니다
 * - 클래스에 final이 붙으면 그 클래스는 자식 클래스를 가질 수 없어요.
 * */

class MyDate {
	int year = 2024;
	int month = 3;
	int day = 15;
	
	public String toString() {
		return "[" + year + "-"+month+"-"+day+"]";
		
	}
	
	public void doIt(final int a) { //변수이기때문에 수정할 수없다.
//		a++; //The final local variable a cannot be assigned.
	}
}


final class Parent {
	public final void method() {
		System.out.println("Parent - method");
	}
}

/*
 * class Child extends Parent { //final 쓰면 상속 불가..
 * 
 * //부모가 final로 정의한 매서드는 Override 안돼요. public void method() {} //Cannot override
 * the final method from Parent
 * 
 * }
 * 
 */


class FinalInit {
	final int a;

	// 1) 선언과 동시에 초기화
	//final int a =10; 
	
	//2) 인스턴스 초기화자ㅣ {}
	
	/*
	 * { a=10; }
	 */
	
	// 3) 생성자를 이용
//	public FinalInit() {
//		a=10;
//	}
	
	FinalInit(int a){
		this.a=a; //ㅊ초기화자를 이용한 방식이 아님..동작은함..
	}
}


public class C07_finalExample {
	
	static final MyDate date = new MyDate(); //상수객체, 참조하는 객체 주소가 안 바뀜
	
	public int data =100;
			
	public static void main(String[] args) {

//		date = new MyDate(); //date변수로 새로운 객체생성X
		
		System.out.println(date.toString());
		date.year = 2025;
		System.out.println(date.toString());//값은 바뀜.but안에잇는객체가 안바뀜
		
		new C07_finalExample().doIt("홍길동");
		System.out.println(new FinalInit(100).a);
	
	}
	
	public void doIt(final String name) {
		final int age = 38; //내부 클래스에 전달되어야 할 지역변수는 final 꼭 붙여사용!!!
		class InnerLocal {//내부 클래스 중 하나...
			public void innerDoIt() {
				System.out.println("외부 클래스의 멤버변수 data : "+ data);
				System.out.println("외부 클래스의 파라미터 변수 name : "+name);
				System.out.println("외부 클래스의 지역변수 age : "+ age);
			}
		}
		new InnerLocal().innerDoIt();
	}

}
