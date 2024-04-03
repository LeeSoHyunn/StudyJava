package quiz;

import java.util.HashMap;

public class Quiz_collection1 {

	public static void main(String[] args) {
		// 참가자
		String[] first_pa = {"leo","kiki","eden"};
		String[] second_pa = {"marina","josipa","nikola","vinko","filipa"};
		String[] third_pa = {"mislav","sanko","mislav","ana"};
		
		// 완주자
		String[] first_com = {"kiki","eden"};
		String[] second_com = {"marina","josipa","nikola","filipa"};
		String[] third_com = {"mislav","sanko","ana"};
		
		System.out.println("첫번째 사례 : "+solution(first_pa, first_com));  //leo
		System.out.println("첫번째 사례 : "+solution(second_pa, second_com));
		System.out.println("첫번째 사례 : "+solution(third_pa, third_com));
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for (String player: participant) hm.put(player, hm.getOrDefault(player, 0)+1); //사람이 중복될수 있음
		System.out.println("참가자 결과 : " + hm);
		for (String player: completion) hm.put(player, hm.get(player) - 1);//완주했을 때 빼기 완주자만 = 0,완주 못하면 1
		System.out.println("완주자 처리 결과 : " + hm);
		for (String key : hm.keySet()) { //set진화된 for문 사용가능
			if(hm.get(key) != 0) {
				answer = key;
			}
		}
		return answer;
	}

}