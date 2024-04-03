package quiz;

import java.util.Scanner;

public class Quiz_240308_AM {

	public static void main(String[] args) {
		
		
		// 1번 
		//1~101미만의 임의의 정수를 생성하고, 그 숫자가 짝수인지 홀수인지 출력(3항 연산식 사용)

		int number = (int)(Math.random()*100) +1; //0부터 출력해서 99까지
		System.out.println("랜덤 수는 : " +number);
		System.out.println("3항 연산의 결과 : " +(number%2==0 ? "짝수" : "홀수"));
		
		
		//2번
		//-5~5 사이의 임의의 정수를 생성하고, 삼항연산식을 사용하여 절대값을 출력
		//0 <= x <=10 일때, y가 -5<= y <=5의 식을 구하세요와 같은 => 5-x=y
		int num2 = 5-(int)(Math.random()*11);
		System.out.println("랜덤 수는 : " +num2);
		int abs = (num2 >=0 ? num2 : -num2); // -num2 == num2* -1
		System.out.println(num2+"의 절댓값은 : " + abs);
		
		
		
		//3번
		//정수를 입력받아 그 수가 짝수인지 홀수인지 출력하는 프로그램 작성(3항연산식 사용)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("하나의 정수를 입력하세요.");
		int num = scan.nextInt();
		
		System.out.println(num%2==0 ? "짝수입니다" : "홀수입니다");

		/*
		 * 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("하나의 정수를 입력하세요.");
		int num = scan.nextInt();
		String result = num%2==0 ? "짝수입니다" : "홀수입니다"
		System.out.println(num+"은 " + result);
		
		
		 * */
		
		
		//4번
		//키와 나이를 입력받아서 키는 140이상, 나이는 8상이상인 경우만 놀이기구에 탑승 여부를 결정하는 프로그램 작성
		
		System.out.print("키를 입력하세요.");
		double hei = scan.nextDouble();
		
		System.out.print("나이를 입력하세요.");
		int age = scan.nextInt();
		
		if(hei>=140 && age >=8) {
			System.out.println("놀이기구 탑승 가능합니다");
		}else {
			System.out.println("놀이기구 탑승 불가합니다.");
		}
		
		
		
		//5번
		//정수 2개를 입력받아 큰수를 출력. 같은 경우에는 같다고 출력하는 프로그램을 작성
		
		System.out.print("하니의 정수를 입력하세요.");
		int a = scan.nextInt();
		
		System.out.print("하나의 정수를 입력하세요.");
		int b = scan.nextInt();
		
		if(a==b) {
			System.out.println("같은 수 입니다.");
		}else if(a>b) {
			System.out.println(a+"정수가 더 큽니다");
		}else {
			System.out.println(b+"정수가 더 큽니다");
		}
		
		
		
		//6번
		//정수를 입력받아서 양의 정수인 경우에는 짝수, 홀수를 구분하고, 0이면 0입니다.를 출력
		//음수인 경우에는 음의 정수입니다.를 출력하는 프로그램 작성
		
		System.out.println("정수를 입력하세요");
		System.out.print(" > ");
		int num6 = scan.nextInt();
		if(num6 > 0) { //양의 정수
			if(num6%2 ==0) System.out.println(num6 + "은(는) 짝수입니다.");
			else System.out.println(num6 + "은(는) 홀수입니다.");
		}else if(num6 == 0) {//0인 경우
			System.out.println("입력한 정수는 0입니다.");
		}else {
			System.out.println(num6 + "은(는) 음의 정수입니다.");
		}
		
		//7번
		//switch를 사용하여 수박,사과,멜론,포도 귤을 구매시 가격을 출력하는 프로그램을 작성
		
		System.out.print("과일입력");
		String str = scan.next();
		
		switch(str) {
		case "수박":
			System.out.println(str + "의 만원 입니다.");
			break;
		case "사과":
			System.out.println(str + "의 만원 입니다.");
			break;
		case "멜론":
			System.out.println(str + "의 만원 입니다.");
			break;
		case "귤":
			System.out.println(str + "의 만원 입니다.");
			break;
		default:
			System.out.println("입력한 과일이없습니다.");
		}		
		
		scan.close(); //메모리때문에 그냥 클로즈

	}

}
