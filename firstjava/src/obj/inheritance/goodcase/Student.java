package obj.inheritance.goodcase;

import obj.inheritance.Person;

public class Student extends Person {
	
	public String studentId;
	public String major;
	
	
	/*
	 * 
	 * this 와 super
	 * - this
	 *   > this는 현재 객체(자기자신)
	 *   >this.  (.은 참조연산자)
	 *     -변수 또는 메서드를 참조
	 *     -this.name => 자기 자신의 name 멤버변수를 참조
	 *     -this.go() => 자기자신의 go() 메서드를 참조하겟다....
	 *   >this() 
	 *     -자기 자신 클래스 내의 다른 생성자를 참조
	 *     -this();   => 기본 생성자를 참조
	 *     -this("hello");  => 자신이 가지고 있는 생성자를 호출. 인자 값을 처리하는 생성자
	 *     
	 * - super
	 *   >super는 현재 객체의 부모 객체. 한단계 위 부모를 의미함
	 *   >super.
	 *      - 부모의 변수 또는 메서드를 참조
	 *      - super.name => 부모의 name 멤버변수를 참조
	 *      - super.go() => 부모의 go() 메서드를 참조
	 *   >super()
	 *      -부모 생성자를 참조
	 *      -super() => 부모의 기본 생성자를 참조
	 *      -super(10,20) => 부모의 해당 인자값을 처리하는 생성자를 참조
	 *      -super("hello")
	 * */
	public Student() {
		
	}
	
	public Student(String name, int age) {
		super(name, age);  //부모의 생성자를 불러와서 나만의 생성자로 만듦-> 자식생성자
	}
	
	public  Student(String name, int age, String studentId, String major) {
		this(name,age); //위에 것을 가져와
		height = 179.6f;  //부모(Person)의 멤버중 protected 멤버변수
//		weight = 100.0f; //default로 참조가 되지 않아요..
 		this.studentId = studentId; //자기자신에 참조
		this.major = major;
	}
	
	public void study() {
		System.out.println(name + "은/는 공부합니다.");
	}
	
	// Overriding이란?
	// 부모 클래스로부터 상속받은 메서드를 자식 클래스에서 행위(Method)를 바꾸거나 보완하기 위해서 다시 정의해서 사용하는 것(재정의)
	// 
	// 재정의 규칙
	// -상속을 전제로 함
	// -리턴 타입, 메서드 이름, 파라미터 변수 선언이 일치해야함..
	// -접근 제한자는 같거나 more public 해야함
	//  ㄴ private < default < protected < public (좀더큰쪽으로 바꿔야됨)
	
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "[이름: " + name + "\t나이 : "+ age + "\t학번: "+ studentId+"\t전공: "+major+"]";
	}
	
	public String getName() {
		return this.name;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getMajor() {
		return major;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
