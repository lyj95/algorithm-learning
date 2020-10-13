package codingTest.programmers.codeChallenge02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 3진법 뒤집기
public class Solution {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(45));
	}
	public int solution(int n) {
		
		List<Integer> ternary = new ArrayList<Integer>();
		
		while(n>=3) {
			ternary.add(n%3);
			n = n/3;
		}
		ternary.add(n%3);
		
		Collections.reverse(ternary);
		System.out.println(ternary.toString());
		
		int answer = 0;
		for(int i=0; i<ternary.size(); i++) {
//			System.out.println(ternary.get(i)+",,  "+Math.pow(3, i));
			answer += ternary.get(i) * (int)Math.pow(3, i);
		}
		return answer;
	}
}
