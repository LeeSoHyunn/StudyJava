import java.util.Scanner;

public class B06_whileExample {

	public static void main(String[] args) {
		// while문
		//for문 보다 좀 더 자유도가 높은 반복문(
		//왜 자유로움 ? for문(초기값;조건;증감값;)과 달리 while은 조건이 참인지 여부만 확인
		
		/*
		 * 
		 * 
		 * 
		 * (형식)
		 * while(condition){
		 *     조건이 참일때에 실행할 명령문들
		 * }
		 * 
		 *  //증감값에 위치에 따라 결과가 달라질수잇음
		 *
		 * 
		 * */

/*		int i=0; //시작값
		while(i<10) {
//			i++;
			System.out.println(i); //무한으로 실행시킬거 아니면 조건을 줘야됨ㅁ
			i++;
		}
*/
		int i=0;
		//while의 무한루프
		while(true) {
			System.out.println(i+=10000);
			if(i%20000 == 0)  //2만의결과값은 스킵
				continue;
			if(i<0)          //반복 종료시점..
				break;    //결과값이 음수가 되는 이유, 값의범위를 넘어서서 오버플로우
		}
		
		//do-while 거의안씀
		//반복할때에 무조건 한번 이상 실행해야 하는 경우..
		i=0;
		
		Scanner scan = new Scanner(System.in);

/*
		while((i = scan.nextInt()) !=0) {
			System.out.println("i가 0이 아닙니다.");
		}
*/
		
		do {
			System.out.println("> ");
			i= scan.nextInt();
			System.out.println("i가 0이어도 한번은 실행해요..");
		}while(i !=0);
		
		scan.close();
	}

}
