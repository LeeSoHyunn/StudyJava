package _0320;
import java.util.LinkedList;
import java.util.Queue;

public class E06_qu {

	public static void main(String[] args) {
		//Queue
		Queue<Integer> qu = new LinkedList<>(); //구현체로 씀 
		qu.add(1);
		qu.offer(2);
		qu.add(3);
		qu.add(4);
		
		
		System.out.println(qu.toString());
		System.out.println(qu.remove(2));
		System.out.println(qu.toString());
		
		while(!qu.isEmpty()) {
			System.out.println(qu.poll());
		}
		
		
			}

}
