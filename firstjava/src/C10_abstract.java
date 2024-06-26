

/*
 * 
 * #의미
 *  -abstract 제한자는 아직 구현되지 않았다는 의미를 가짐.
 *  -abstract 제한자는 클래스, 메서드에 사용합니다. 변수에는 사용하지 않아요!!
 *  
 * #클래스에 사용하는 경우, 
 *  > 객체를 생성할 수 없습니다.
 *  > 다형성을 통해서 추상클래스의 자료형으로 가지는 객체를 생성할 수 있습니다.
 *  > 추상 클래스가 됩니다.
 *  > 반드시 상속을 받아서 사용해야합니다.
 *  
 * # 메서드에 사용하는 경우,
 *  > 추상 메서드가 됩니다.
 *  > 메서드의 구현부분이 없음
 *  
 *  ** 추상메서드를 하나라도 포함하는 클래스는 추상 클래스가 되어야합니다.
 *  ** 그러나, 추상클래스가 꼭 추상 메서드를 가져야할 필요는 없습니다.*/


abstract class Shape { //추상클래스
	private int x;
	private int y;
	
	public Shape() {} // 기본생성자...
	public Shape(int x, int y) {
		this.x= x;
		this.y=y;
		
	}
	
	public abstract double getArea(); //추상메서드..면적
	
		public String position() {
			return "[x="+x+" ,y="+y+"]";
		}
	
}

class Circle extends Shape {
	
	private int radius;
	
	public Circle(int r) {
		this(0, 0, r);
		
	}
	
	public Circle(int x, int y, int r) {
		super(x,y);
		this.radius = r;
	}

	@Override
	public double getArea() {
		return (Math.PI * radius * radius);
	}
	
	
}


class Rectangle extends Shape {
	
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int x, int y,int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	
	
}

class Triangle extends Shape {
	int width;
	int height;
	
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Triangle(int x, int y,int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (width * height) *0.5;
	}
	
	
	
	
	


}




//Shape를 부모로 하는 사각형(rectangle), 삼각형(triangle) 클래스를 만들어보세요.

public class C10_abstract {

	public static void main(String[] args) {
		Shape circle = new Circle(10);
		
		System.out.println("원의 넓이는 : "+circle.getArea());
		System.out.println("도형의 위치는 : "+circle.position());
		
		Shape Rectangle = new Rectangle(10,5);
		
		System.out.println("원의 넓이는 : "+Rectangle.getArea());
		System.out.println("도형의 위치는 : "+Rectangle.position());
		
		Shape Triangle = new Triangle(20,5);
		
		System.out.println("원의 넓이는 : "+Triangle.getArea());
		System.out.println("도형의 위치는 : "+Triangle.position());
		
	}

}
