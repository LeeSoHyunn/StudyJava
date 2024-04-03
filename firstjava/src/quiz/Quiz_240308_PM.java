package quiz;

public class Quiz_240308_PM {
	public static void main(String[] args) {
		//1번
		//100부터 1까지 순서대로 출력하세요
		for(int i = 100; i>0; i--) {
			System.out.print(i+ " ");
		}
		
		
		//2번
		//1~200사이의 수 중에서 2 또는 3의 배수가 아닌 수들의 총합을 구하세요
		int sum = 0;
		for(int k=1; k <=200; k++) {
			if(!(k%2 ==0 || k%3 ==0)) {
				sum +=k;
			}
		}
		System.out.println();
			System.out.println("2 또는 3의 배수가 아닌 수들의 총합: " + sum);
		
		
		//3번
		//1 + (2+2) + (1+2+3) + (1+2+3+4) + ..... + (1+2+3+4+5+6+7+8+9+10)의 결과를 구해보세요
		sum =0;
		int sum1 =0;
		for(int i =1 ; i<=10; i++) {
			if(i!=1) System.out.print("+(");
			for(int j=1; j<=i; j++) {
				sum+=j;
				System.out.print(j);
				if(j!=i) System.out.print("+");
			}
			if(i !=1) System.out.print(")");
		}
		System.out.println("\n반복문 두개를 사용하여 풀어본 결과 : "+sum);
		
		
		//
		sum =0;
		int sum2 =0;
		for(int i =1; i<=10; i++) {
			sum+=i;
			sum2+=sum;
		}
		System.out.println(sum2);
		
		
		//내가품
		int result=0;
		for(int x =1 ; x<=10; x++) {
			for(int y=1; y<x; y++) {
				result +=y;
			}
			result +=x;
		}
		System.out.println("합은 " +result);
	}

}
