package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_0311마지막교시 {

	public static void main(String[] args) {
		// 1. 1000개짜리 int형 배열을 생성한 뒤 모든 값을 1 - 100사이의 
		//    램덤 숫자로 채워보세요
		
		//배열 선언 및 초기화
		int[] num = new int[1000]; //int = 4바이트 =>4천바이트의 저장공간 생성 
		
		//random 1~100사이 값으로 대입..
		for(int i = 0; i <1000; i++) {
			num[i] = (int)(Math.random()*100) +1; //1-100사이의 임의값!
		}
		System.out.println(Arrays.toString(num));
		System.out.println(num.length);
		
		
		
		
		// 2. 1000개의 램덤 숫자들 중 각 숫자가 몇번씩 나왔는지 세어 출력하세요 
		int[] cnt = new int[100];
		
		for(int j =1; j<=100; j++) { //1-100 사이에 나온 숫자의 회차
			for(int i =0; i<num.length; i++) {  //0-999사이의 인덱스 참조..
				if(j == num[i]) {
					cnt[j-1]++;  //인덱스 1을 빼서 0으로 만들기위해 ->j-1
				}
			}
			
		}
		
		//검증
		int check =0;
		for(int i =0; i<cnt.length; i++) {
			System.out.println(i+1+"이 나온 횟수: " +cnt[i]);
			check += cnt[i];
		}
		System.out.println(check);      ///check값은 1000이되어야함
		
		
			// 다이아몬드 찍기
			// 1. 다음과 같은 형태로 별직기를 진행해 보세요.  
			/*          힌트  : 공백, 별, 단(줄)   sp(공백)=dan/2; ==> 반이 되는 구간 st(별) =1;
			      
			      *
			     ***      
			    *****            +2  st +2 /sp=-1
			   *******
			  *********
			   *******
			    *****            -2
			     ***
			      *
			 */
		
/*		int dan=5;
		for (int i =0; i<dan; i++) { //5줄
			//space 공백
			for(int j=0; j<dan-i-1; j++)
				System.out.print(" ");
			
			//별찍기
			for(int j=0; j< i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i =0; i<dan; i++) { //5줄
			//space 공백
			for(int j=0; j< i; j++)
				System.out.print(" ");
			
			//별찍기
			for(int j=0; j< 2*dan-(2*i) -1; j++) { //(2*i) <-0,1,2일때/... 집어넣음
				System.out.print("*");
			}
			System.out.println();
		}
		
*/		

			// 2. 1번의 코드를 활용하여 줄 수를 입력 받아서 그 줄 수 에 맞는 다이아몬드 별을 찍는 
	 		//   프로그램을 작성해 보세요. (단, 줄은 홀수로만 입력 받아야 합니다.)
		Scanner scan = new Scanner(System.in);

		// 줄 수 입력 받는 부분... 
		System.out.print("줄 수 를 입력해주세요 : ");
		int dan = scan.nextInt();

//		for (int i = 0; i < dan; i++) {
//			for(int j = 0; j < dan - i - 1; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i * 2 + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i < dan - 1; i ++) {
//			for(int j = 0; j < i + 1; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j < 2 * (dan - i - 1) -1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
/*		
		for (int i =0; i<dan1; i++) { 
			//space 공백
			for(int j=0; j<dan1-i-1; j++)
				System.out.print(" ");
			
			
			//별찍기
			for(int j=0; j< i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i =0; i<dan1-1; i++) { //5줄
			//space 공백
			for(int j=0; j< i+1; j++)
				System.out.print(" ");
			
			//별찍기
			for(int j=0; j< 2*(dan1-i-1) -1; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
*/
		
		//변수선언 :sp 여백, st 별, 반전을 위한 flag(boolean)- true(삼각형), false(역삼각형)
		int sp = dan/2;
		int st = 1;
		boolean flag = true;

/*		for (int i = 1 ; i < 9 ; i ++ ) {

			// 여백처리... 
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			// 별찍기... 
			for (int j = 0; j < st; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i == (dan/2)) flag = false; //반전
			if(flag) {
				sp -= 1; st += 2;
			}else {
				sp += 1; st -= 2;
			}

		}
		
*/		
		//다이아몬드 공백
		
		
		for (int i = 1 ; i < 9 ; i ++ ) {

			// 여백처리... 
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			// 별찍기... 
			for (int j = 0; j < st; j++) {
				if(j ==0 || j ==st-1)
				System.out.print("*");
				else{
					if(j%2==0) System.out.print("$");
				else System.out.print(" ");
			}
		}
			System.out.println();
			if(i == (dan/2)) flag = false; //반전
			if(flag) {
				sp -= 1; st += 2;
			}else {
				sp += 1; st -= 2;
			}

		}
		

		scan.close();

	}

	}
