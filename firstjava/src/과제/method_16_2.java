package 과제;

import java.util.Scanner;

public class method_16_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] ka = new String[100];
		
		int i =0;
		while(true) {
			System.out.print("입력할 카카오친구 > ");
			String fr = scan.next();
			
			System.out.println(fr + "입력 성공!");
			
			ka[i] = fr;
			
			for (int n = 0; n < i; n++) {
				if(fr.equals("그만")) {
					System.out.println(n +"명의 카카오 친구가 입력되었습니다.");
					
			}
		}
		
		
	}
	}
}
