package _0326;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class G09_streamEx2 {

	/*

	Stream은 BaseStream 인터페이스를 최상위로 Stream(Object),
	IntStream, LongStream, DoubleStream을 가지고 있다.
	각 자료 타입에 따라서 Stream을 구분하여 사용할 수 있음.
	
	*/
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Arrays.strem() IntStream 생성하기");
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println("IntStream.of로 IntStream 만들기");
		IntStream intstream2 = IntStream.of(arr);
		intstream2.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println("IntStream.range(1,6) IntStream 만들기");  //range는 끝값 포함X
		IntStream intstream3 = IntStream.range(1, 6);
		intstream3.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println("IntStream.rangeClosed(1,6)로 IntStream 만들기"); //이건 끝값 포함
		IntStream intstream4 = IntStream.rangeClosed(1, 6);
		intstream4.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//난수 Stream 생성하기
		System.out.println("int 형 난수 스트림 : ");
		IntStream isr = new Random().ints(3);
		isr.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		isr = new Random().ints(10,0,3);  //끝값 포함 안함
		isr.forEach(s -> System.out.print(s + " "));
		
		System.out.println("long 형 난수 스트림 : ");
		LongStream lsr = new Random().longs(3,0,10);
		lsr.forEach(s -> System.out.print(s + " "));
		
		System.out.println("Double 형 난수 스트림 : ");
		DoubleStream dsr = new Random().doubles(3);
		dsr.forEach(s -> System.out.print(s + " "));
		
		//문자열을 Stream으로 처리... chars() 메서드의 사용
		String str = "자바 세상을 만들자";
		//Stream 객체 생성
		isr = str.chars();  //IntStream 을 사용한 이유 => char는 정수 계산이 가능!
		
		isr.forEach(s -> System.out.print((char)s)); //다만 숫자로 출력되기 때문에 , 캐스팅을 해서 문자로 바꿈
	}

}
