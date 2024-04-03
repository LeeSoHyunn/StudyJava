package obj;

public class Student {
	
	//클래스의 멤버변수, 속성, 필드
	//지역변수가 아님
	public int kor;
	public int eng;
	public int pro;
	public int his;
	
	public String name;

	
	//메서드
	public int getTotal() {
		return kor + eng + pro + his; //함수의 반환값, 넘겨줘야될때
	}
	
	public String getName() {
		return name;
	}
	
	}


