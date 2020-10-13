package codingTest.programmers.codeChallenge02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 문자열의 아름다움
public class Solution4 {
	
	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution("baby"));
	}
	
	public long solution(String s) {
		long answer = 0;
		String[] str = s.split("");
		
		for(int i=0; i<s.length(); i++) {
			for(int j=i; j<s.length(); j++) {
//                System.out.println(i+", "+j);
				if(i != j) {
					answer += subStr(str, i, j);
				}
			}
		}
		return answer;
	}
	
	public int subStr(String[] s, int i, int j) {
	
		List<Integer> list =new ArrayList<Integer>();
		for(int x=i; x<=j-1; x++) {
			for(int y=x+1; y<=j; y++) {
				if(s[x].equals(s[y])) {
					list.add(0);
				}else {
					list.add(y-x);
				}
				
			}
		}

		Collections.sort(list);
		return list.get(list.size()-1);
	}
}
