package codingTest.programmers.test01;

import java.util.HashMap;
import java.util.Stack;

public class Running {
	public String solution(String[] participant, String[] completion) {
        String answer = "";

        // 효율성에서 실패 (시간초과)
        for(int i=0 ; i<participant.length ; i++) {
        	for(int j=0 ; j<completion.length ; j++) {
        		if(participant[i].equals(completion[j])) {
        			participant[i] = "0";
        			completion[i] = "1";
        			break;
        		}
        	}
        }
        
        for(int i=0; i<participant.length ; i++) {
        	if(!participant[i].equals("0")) {
    			answer = participant[i];
    		}
        }
        
        return answer;
    }
}
