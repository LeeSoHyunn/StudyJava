package quiz;

import java.util.PriorityQueue;

public class Quiz_collection2 {

	public static void main(String[] args) {
		// 매운것을 좋아함
		int[] scoville = {2,1,3,9,12,10};
		int k =7;
		System.out.println("음식을 최소 몇번 섞었을 때 원하는 맵기가 될까?"
		+ solution(scoville, k));
		
	}
	
	public static int solution(int[] scoville, int k) {
		int answer= 0; //시도횟수
		
		//scoville 값을 저장 : 음식
		PriorityQueue<Integer> que = new PriorityQueue<>(); //PriorityQueu 제일 작은 값이 맨 앞으로 옴
		for (int i : scoville) {
			que.add(i);
		}
		System.out.println("PriorityQueue 내용 : "+que);
		
		while(true) {
			answer ++;
			int result = que.poll() + (que.poll()*2); //que.poll() 여기에 작은 값이 빠짐 /que.poll()*2 두번째로 작은 값이 들어감
			que.add(result);
			System.out.println(answer + "번째Que의 내용: " +que);
			//정해진 맵기 K값을 넘어서는 섞은 음식인 경우, 그 회사를 반환
			if(que.peek() >= k) return answer;
			//K이상으로 만들 수 없는 경우, 반환값은 -1
			if(que.size() == 1) return -1;
		}
		
	//	return answer;
		
	}

}
