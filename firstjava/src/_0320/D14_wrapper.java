package _0320;

public class D14_wrapper {

	public static void main(String[] args) {
		// wrapper는 기본 자료형을 객체로 변경
		Object[] arrObj = new Object[10];
		
		arrObj[0] = new Byte((byte)127);
		arrObj[1] = new Short((short)32767);
		arrObj[2] = new Integer(2147483647);
		arrObj[3] = new Long(2147483647);
		arrObj[4] = new Float(3.5f); //오토박싱..그냥알아두기
//		System.out.println(((float)arrObj[4]).floatValue()); //자동으로 집어넣어짐,, 캐스팅노필요
		arrObj[5] = new Double(3.7);
		
		arrObj[6] = new Boolean(true);
		arrObj[7] = new Character('J');
		arrObj[8] = new String("Hello World!!");
		arrObj[9] = new java.util.Date();
		
		
		for(int i =0; i <arrObj.length; i++) {
			System.out.println(arrObj[i]);
		}
		int a = Integer.parseInt("100"); //문자열 값을 기본 데이터 형으로 변경!!
		System.out.println(a);
	}

}
