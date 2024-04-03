
public class B02_ifExample4 {
	
	public static void main(String[] args) {
		//중첩(중복) if : if문 안에 if문이 존재하는 경우
		
		int jumsu = (int)(Math.random()*110); //0~109 사이에 잇는 정수
		
		System.out.println("점수 : " + jumsu);
		
		if(jumsu >= 90) {
			if(jumsu > 100) {
				System.out.println("잘못 입력된 점수입니다.");
			}else {
				System.out.println("당신의 학점은 A입니다.");
			}
		}else if(jumsu >= 80){
			System.out.println("당신의 학점은 B");
		}else if(jumsu >= 70){
			System.out.println("당신의 학점은 C");
		}else if(jumsu >= 60){
			System.out.println("당신의 학점은 D");
		}else {
			System.out.println("당신의 학점은 F");
			System.out.println("당신의 재수강 대상자입니다");
		}
	}

}
