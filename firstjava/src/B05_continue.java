
public class B05_continue {

	public static void main(String[] args) {
		// continue
		//반복문 내부에서만 사용이 가능함
		//반복문에서 continue를 만나면 아래의 내용을 실행하지 않고, 다음 반복 회차로 이동..
		
		//1~100까지 짝수만 출력하기
		for(int i = 1; i<=100; i++) {
			if(i%2== 1) //초기값이 0인 경우.. i ==0인 경우도 if조건에 넣어야함
				continue; //
			System.out.println(i);
		}

		
		
		//continue로 5의 배수만 출력하기
		for(int i =0; i<=100; i++) {
			if(i% 5!=0 || i==0) //초기값이 0이먄 i==0해줘서 빼줘야됨 //continue는 스킵
				continue;
			System.out.println(i);
		}

	}

}
