package codingTest.programmers.test01;

import java.util.Arrays;

public class Kim {
	
	// [문제] 서울에서 김서방 찾기
	public String solution(String[] seoul) {
		String answer = "";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + 1 + "에 있다";
				break;
			}
		}

		return answer;

	}
	
	// 더 간단한 풀이
	public String findKim(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+ x + "에 있다";
    }
}
