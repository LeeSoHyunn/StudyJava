
public class B03_switchExample1 {

	public static void main(String[] args) {
		// switch(수식) ~case
		
		int jumsu = (int)(Math.random()*100);
		System.out.println("점수 : " + jumsu);
		
		switch(jumsu / 10) {
		case 9 : 
			System.out.println("당신의 학점은 A");
			break; //switch case 구문에서 나가야 하기 때문에 break를 사용
		case 8:
			System.out.println("당신의 학점은 B");
			break;
		case 7:
			System.out.println("당신의 학점은 C");
			break;
		case 6:
			System.out.println("당신의 학점은 D");
			break;
		default:
			System.out.println("당신의 학점은 F");
			System.out.println("당신은 재수강 대상자");
		
			
		}

	}

}
