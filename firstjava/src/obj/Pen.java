package obj;

public class Pen {
	
	//클래스 안에 코드
	//attribute(속성, 멤버변수),constructors(생성자), method(메서드)
	
	//멤버변수 - attribute
	public String color; // 패키지 관계 없이 불러올 수 있음..
	public int length;
	int price;            //같은 패키지 내에서 불러 올 수 있음 -default
	
	//메서드
	public void write() {
		System.out.println("Hello World!!!");
	}
	
	/*public Pen() { //기본 생성자
	super();  //부모
}*/

	
	/*
	 * 생성자...
	 * - 생성자는 반드시 클래스 안에 하나 이상 선언해야함
	 *   선언하지 않으면, JVM(java virtual Machine)이 대신해서 기본 생성자를 자동으로 만들어줌
	 * - 기본 생성자는 매개변수를 가지고 있지 않은 형태로, 자동으로 만들어지는 경우에는 내용이 없음
	 * 
	 * ## 생성자 만드는 규칙
	 *   1. 생성자 이름은 클래스 이름과 대소문자까지 정확히 같아야함
	 *      클래스 이름과 다른 이름으로 만들면 그것은 메서드 취급!
	 *   2. 생성자는 메서드와 달리 반환 유형을 적지 않습니다.
	 *   3. 생성자는 다른 유형으로 여러개 생성이 가능(생성자 오버로딩) (메서드 오버로딩-이름이 똑같은데 매개변수가 다름)
	 * 
	 * 
	 * */
	
	//생성자 생성 예시...
	public Pen() { //매개변수없음 매개변수 존재여부 등을 보고 확인->오버로딩
		color = "black";
	}
	
	//멤버 초기화 생성자!
	public Pen(String init_color) { //매개변수 포함
		color = init_color;
		System.out.println("생성자를 이용하여 color값 초기화");
	}

	public Pen(String init_color, int init_price) {
		color = init_color; //필드값
		price = init_price;
		System.out.println("생성자를 이용하여 color, price 값 초기화");
	}
	
	public Pen(String color, int lenght, int price) {
	//   속성          매개변수  를 구분하기위해 this 붙임
		this.color = color;
		this.length= length;
		this.price = price;
	}
	
	//오버로딩으로 구분되는 생성자 혹은 메서드는 매개변수의 숫자와 타입(데이터 타입 순서)의 의해서 결정!!
	//조건
	//1. 오버로딩을 위해서는 이름이 같아야함
	//2. 접근제한자나 반환유형은 오버로딩에 영향을 주지 않음
	//3. 매개변수의 유형(타입 int, double, float,,)이 달라야함
	//4. 매개변수의 개수가 달라야한다.
	//5. 매개변수의 순서가 달라야함
	public Pen(int lenght, String color ) {//String color, int lenght 오류남
			this.color = color;
			this.length= length;
		}
	
	public int getPrice() {//반환값
		return price;
	}
}
