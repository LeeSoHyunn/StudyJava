

class University {
	
	int num;
	static String name;
	
	//static 내부 클래스 - static 붙은 멤버와 동일하게 사용이 가능함.
	//이 내부 클래스는 static 이 붙어있기 때문에 static 붙은 멤버에만 접근가능
	//접근 방식에 의해서 객체 생성 방법에서 차이가 생기게 된다..
	//static이 없는 멤버 이너클래스는 외부 객체를 생성한 후에 내부 클래스에 접근이 가능함
	//static이 있는 경우에는 외부클래스 객체 생성 없이 바로 호출이 가능함
	
	static class Student{
		
	}
}

class HighSchool {
	//멤버 이너 클래스
	class Student{
		
	}
}


public class D04_staticInner {

	public static void main(String[] args) {
		//static이 있는 경우..
		University.Student us = new University.Student();
		
		//static이 없는 경우
//		HighSchool.Student high = new HighSchool.Student(); //안됨
		HighSchool high = new HighSchool();            //외부객체 생성
		HighSchool.Student hs = high.new Student();   //내부객체 생성
	}

}
