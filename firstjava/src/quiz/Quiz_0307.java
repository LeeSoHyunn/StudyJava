package quiz;

public class Quiz_0307 {

	public static void main(String[] args) {
		System.out.println("Q1번");
		System.out.println("================");
		System.out.println("    /) /)");  //\t  /) /)
		System.out.println("   (  . .)");
		System.out.println("   (    >♡");
		System.out.println("Have a Good Time");
		System.out.println("================");

		System.out.println("Q2번");
		System.out.println("=====================================");
		System.out.println("이름      나이     전화번호        회비");
		System.out.println("=====================================");
		System.out.println("홍길동   \"15\"   010-123-1234   ￦20,000 ");
		System.out.println("임꺽정   \"20\"   010-123-1234   ￦30,000");
		System.out.println("김말이   \"28\"   010-123-1234   ￦50,000");
		System.out.println("-------------------------------------");
		System.out.println("총합계                        ￦100,000");
		System.out.println("===================================="
				);
		
		System.out.println("Q3번");
		//놀이공원까지 11개 지하철 역을 지남
		//출발역에서 도착역까지 37분 소요
		//한 역을 지나는데 걸리는 시간은?
		
		double stat = 11;
		int min = 37;
		double result = (int)((min/stat)*100)/100.0;
		System.out.println("한 역을 지나는데 걸린 시간은" + result + "분이 소요됨");
		
		
		System.out.println("제어문자 이용하여 출력");
		System.out.println("==============출력결과===============");
		
		String name="홍길동";
		int age = 20;
		String Tel = "010-1234-1234";
		double hei = 178.5;
		double wei = 75;
		String a = "O";
		
		
		System.out.printf("이름 : %s", name);
		System.out.printf("\n나이 : %d", age);
		System.out.printf("\nTel : %s", Tel);
		System.out.printf("\n키   : %.1f", hei );
		System.out.printf("\n몸무게 : %.0f", wei);
		System.out.printf("\n혈액형 : %s", a);
		 
		
		
	}

}
