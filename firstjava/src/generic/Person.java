package generic;

public class Person<E> {
	private E name;
	private int age;
	
	//필드생성자
	public Person(E name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//getter, setter
	public E getName() {
		return name;
	}

	public void setName(E name) {
		this.name = name;
	}
	
	//메서드
	//<> 이건 다 제너릭
	//클래스 선언부에서 정의(정의된것은 = E)되지 않은 유형 매개변수를 사용하는 방법
	public <T extends Object> T test(T t) {  //T는 오브젝트를 상속받앗다 T는 객체, 리턴타입은 제너릭
		return t;
	}
	
	
}
