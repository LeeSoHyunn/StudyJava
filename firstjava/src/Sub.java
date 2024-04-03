import obj.modifier.Super;

public class Sub extends Super {
	
	private int num5 = 50;
	public void print() {
		System.out.println("Super num1 = " + num1);
		System.out.println("Super num2 = " + num2);
//		System.out.println("Super num3 = " + num3); //default로 되어있어서 같은 패키지가 아니어서 참조안됨
//		System.out.println("Super num4 = " + num4); // private이라 접근X / 같은 클래스 내에서만 접근가능
		System.out.println("Super num4 = " + getNum4()); //getNum4는 접근제한자를 넘겨줌
		System.out.println("Sub num5 = " +num5);
	}
}
