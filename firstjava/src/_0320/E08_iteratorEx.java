package _0320;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class E08_iteratorEx {

	public static void main(String[] args) {
		// Iterator : 컬렉션을 값을 순차적으로 접근하려고 할때 사용하는 인터페이스
		
		Set set = new HashSet();
		set.add("three");
		set.add("two");
		set.add("four");
		set.add("five");
		set.add(new Integer(4));
		
		Iterator it = set.iterator(); // Set에서 Iterator객체 생성 메서드
		while(it.hasNext()) {
			System.out.println(it.next()); //값 불러오기
		}
		
		List list = new ArrayList();
		list.add(10);
		list.add(50);
		list.add(20);
		list.add(40);
		list.add(30);

		Iterator it2 = list.listIterator();
		while(it2.hasNext()) {
			System.out.print(it2.next()+"\t");
		}
	}

}
