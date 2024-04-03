package _0320;

public class D13_systemEx {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("시작시간: "+start);
		System.out.println(System.getProperties());
		
		//시간지연..
		int a = 0;
		for(int i =0; i <1000000; i++) a+=i;
		System.gc(); //가비지컬렉터 삭제
		
		long end = System.currentTimeMillis();
		System.out.println("종료시간 : "+end);
	}

}
