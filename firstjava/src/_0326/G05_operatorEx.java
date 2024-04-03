package _0326;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class G05_operatorEx {
/*	
	Operator는 Function과 마찬가지로 매개변수와 리턴값 모두 존재.
	Function 하위 인터페이스로 보통 매개변수값을 연산하고 그 결과를 리턴하는 경우 사용
	
	인터페이스                   추상메서드
	BinaryOperator<T>        T apply(T t1, T t2)
	UnaryOperator<T>         T apply(T t)
	xxxBinaryOperator        xxx applyAsXXX(xxx,xxx)
	xxxUnaryOperator         xxx applyAsXXX(xxx)
*/
	
	//Student
	static Student[] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신", 95, 70, "통계"),
			new Student("김유신", 100, 60, "빅데이터")
	};
	
	public static void main(String[] args) {
		System.out.print("최대 수학 점수: ");
		int max = maxOrMinMath((a,b) -> {   //정의를 내릴 뿐 int max = maxOrMinMath((a,b) 불러다가 작업중
			if(a >= b) return a;
			else return b;
		});
		System.out.println(max);
		
		System.out.print("최소 수학 점수 : ");
		System.out.println(maxOrMinMath((a,b) -> (a<=b?a:b))); //삼항연산식, 결과값하나만 딱 떨어지면 결과값(그래서 return 안씀)
		
		System.out.print("최대 평균 점수 : ");
		System.out.println(maxOrMinavg((a,b) -> (a>=b? a:b)) );
		
		System.out.print("최소 평균 점수 : ");
		System.out.println(maxOrMinavg((a,b) -> (a<=b? a:b)) );
		
	}

	//두 개의 int 값을 입력하여 int값 리턴
	private static int maxOrMinMath(IntBinaryOperator op) { //두개값을 받아서 하나의 값을 반환
		//intBinaryOperator op = (a,b) -> {if(a >= b) return a;else return b; }); 와 같다
		 int result = list[0].getMath();
		 for(Student s : list) {
			 result = op.applyAsInt(result, s.getMath());
		 }
		 return result;
	}
	//두 개의 double 값을 연산하여 double값을 리턴
	private static double maxOrMinavg(DoubleBinaryOperator op) {
		double result = (list[0].getMath() + list[0].getEng()) / 2.0;
		for (Student s : list) {
			result = op.applyAsDouble(result, (s.getMath()+s.getEng())/2.0);
		}
		return result;
	}
}

class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	
	//필드생성자
	public Student(String name, int eng, int math, String major) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}

	//getter만 생성
	public String getName() {
		return name;
	}


	public int getEng() {
		return eng;
	}


	public int getMath() {
		return math;
	}


	public String getMajor() {
		return major;
	}
	
	
}
