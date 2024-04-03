
public class B04_forExample2 {

	public static void main(String[] args) {
		// 이중(다중)  //보통 이중은 안넘음.. 삼중은 그래프 또는 데이터구할때??
		//for문 안에 for문이 들어있는 중첩
	
		for (int i=0; i <10; i++) {
			System.out.println("============================바깥 반복문" + i);
			
			for(int j= 0; j < 10; j++) {
				System.out.println("---------------------------------안쪽 반복문" +i+"-" +j);
				
				for(int k= 0; k < 10; k++) {
					System.out.println("++++ 제일 안쪽 반복문"+i+"-" +j +"-"+k);
			}
		}
		}
		
		
		//예제1 구구단 출력하기
		//2단부터 9단까지 각 단은 1~9
		for(int x =2; x <10; x++) {
			System.out.println(x+"x단 출력");
			for(int y=1; y <10; y++) {
				System.out.println(x +"x"+ y +"=" +(x*y));
			}
			System.out.println();
		}
		
		//예제2
/*			for(int y =2; y <10; y++) {
				for(int x =2; x <10; x++) {
					if(y == 0) System.out.println(x+"단 \t");
					else System.out.print(x+ "x" +y + "=" + (x*y)+ "\t");
				}
*/					
				for(int a = 1; a <=9 ; a++) {
					for (int b = 2; b<=9 ; b++) {
						System.out.print(b+"X"+a+"="+(a*b)+ "\t");
						}
						System.out.println();
			
			}
			
		}
	}
