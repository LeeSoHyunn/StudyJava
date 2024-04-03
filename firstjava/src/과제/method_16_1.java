package 과제;

import java.util.Scanner;

public class method_16_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] foodArr = new String[100];

		System.out.println("먹고 싶은 음식을 입력하세요! ");
		System.out.println("입력을 중지하려면 <그만>이라고 입력하세요");

		int i = 0;
		while (true) {

			System.out.print("> ");
			String food = scan.next();

			foodArr[i] = food;

			if (food.equals("그만")) {
				System.out.println("입력 종료");
				System.out.print("내가 먹고싶은 음식들 : [");
			
			for (int n = 0; n < i; n++) {
				System.out.print( foodArr[n]);
			}
			System.out.println("]");
			break;
			}
			
			i++;
			
		}

	}

}
