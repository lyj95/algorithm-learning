package codingTest.programmers.hash;

import java.util.HashMap;
import java.util.Map.Entry;

// 완주하지 못한 선수
public class Running {
	public static void main(String[] args) {
		Running r = new Running();
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };
		System.out.println(r.solution(participant, completion));
	}

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for (String player : participant)
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		
		for(Entry<String, Integer> elem : hm.entrySet()){
            System.out.println("키 : " + elem.getKey() + "값 : " + elem.getValue());
        }
		
		for (String player : completion)
			hm.put(player, hm.get(player) - 1);

		
		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
			}
		}
		return answer;
	}

//	public String solution(String[] participant, String[] completion) {
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//			int i;
//        for ( i=0; i<completion.length; i++){
//
//            if (!participant[i].equals(completion[i])){
//                return participant[i];
//            }
//        }
//        return participant[i];
//    }

//	public String solution(String[] participant, String[] completion) {
//        String answer = "";
//
//        // 효율성에서 실패 (시간초과)
//        for(int i=0 ; i<participant.length ; i++) {
//        	for(int j=0 ; j<completion.length ; j++) {
//        		if(participant[i].equals(completion[j])) {
//        			participant[i] = "0";
//        			completion[i] = "1";
//        			break;
//        		}
//        	}
//        }
//        
//        for(int i=0; i<participant.length ; i++) {
//        	if(!participant[i].equals("0")) {
//    			answer = participant[i];
//    		}
//        }
//        
//        return answer;
//    }
}
