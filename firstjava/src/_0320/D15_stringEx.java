//문자열테스트
package _0320;

import java.util.Arrays;

public class D15_stringEx {

	public static void main(String[] args) {
		//String 메서드 사용 예
		String str ="Hello, world!! 1234567890";
		System.out.println(str);

		//1. substring : 문자열을 원하는 만큼 자르는 메서드
		System.out.println(str.substring(0));
		System.out.println(str.substring(1));
		System.out.println(str.substring(2));
		System.out.println(str.substring(3));
		System.out.println(str.substring(4));
		
		System.out.println(str.substring(0, 5)); //5번인덱스 포함X
		System.out.println(str.substring(5));
		System.out.println(str.substring(7,12));

		//2.split : 문자열을 원하는 기준으로 자른다. -> 배열로 반환
		str = "apple/banana/kiwi/lemon/orange";
		String[] fruit = str.split("/");
		
		for(int i = 0; i<fruit.length; i++) {
			System.out.println(fruit[i]);
		}
		System.out.println(Arrays.toString(fruit));
		
		//3.indexOf : 원하는 문자의 인덱스를 반환(못찾는 경우 -1)
		int orangeIndex = str.indexOf("orange");
		System.out.println("오렌지 위치 : "+orangeIndex);
		System.out.println("첫번째 o의 위치: "+str.indexOf('o'));
		System.out.println("두번째 o의 위치: " +str.indexOf('o', str.indexOf('o')+1));
		System.out.println("첫번째 x의 위치: "+str.indexOf('x')); //x가 없다 = -1
		
		//4.charAt : 원하는 위치의 문자를 가져옴..
		char ch = str.charAt(str.indexOf("orange"));
		
		String orange = str.substring(str.indexOf("orange"), str.indexOf("orange")+"orange".length()); 
		System.out.println(ch);
		System.out.println(orange);
		
		//5. contains : 해당 문자가 문자열에 포함되어 있는지 확인..
		if(str.contains("apple")) {
			System.out.println("사과도 과일이군요.");
		}else {
			System.out.println("사과는 과일이 아니군요");
		}
		
		//6.length() - 문자열 길이, equals() - 문자열 비교
		//배열의 length는 멤버변수, 문자열은 메서드
		
		//7.replace : 원하는 문자를 치환
		//문자열은 객체를 새로 만듦 (메모리 소모 큼)
		str = "abc@naver.com";
		
		str = str.replace("naver", "gmail");
		System.out.println(str);
		str = "abc@naver.com";
		str = str.replaceFirst("naver", "korea"); //naver가 아니면 안찾음
		System.out.println(str);
		
		//8.lastIndexOf : 해당 문자열을 뒤에서부터 찾아서 위치를 반환
		str = "abcd    dcba";
		System.out.println("indexOf(d): "+str.indexOf('d'));
		System.out.println("lastIndexOf: "+str.lastIndexOf('d'));
		
		//9. toUpperCase, toLowerCase : 대/소 문자로 변환...
		
		//10. trim : 문자열 바깥 쪽 공백제거
		String id_1 = "    abc   123 ";
		String id_2=  " abc   123    ";
		
		System.out.println("before1: "+id_1);
		System.out.println("before2: "+id_2);
		
		System.out.println("equals: "+id_1.equals(id_2));
		
		id_1 = id_1.trim();
		id_2 = id_2.trim();
		

		System.out.println("after1: "+id_1);
		System.out.println("after2: "+id_2);
		
		System.out.println("equals: "+id_1.equals(id_2));
		
		//1.format : 서식문자열을 이용하여 문자열을 만들어서 반환
		str = String.format("%d:%d:%d", 11,14,50); //prinf와 비슷
		System.out.println(str);
		
		//12.endsWith : 지정된 문자로 끝나는지 검사(확장자 체크할 때 사용)
		str = "오늘할일.html";
		
		if(str.endsWith(".txt")) {
			System.out.println("확장자가 올바른 텍스트 파일입니다.");
		}else if(str.endsWith(".html") || str.endsWith(".htm")) {
			System.out.println("웹페이지입니다.");
		}else {
			System.out.println("텍스트파일이 아닙니다.");
		}

	}

}
