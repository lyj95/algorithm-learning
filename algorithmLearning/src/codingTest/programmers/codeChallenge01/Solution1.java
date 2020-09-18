package codingTest.programmers.codeChallenge01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Solution1 {
	public int[] solution(int[] numbers) {

		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		
		Iterator<Integer> it = set.iterator();
		int[] answer = new int[set.size()];
		int index=0;
		while(it.hasNext()) {
			answer[index++] = it.next();
		}

		Arrays.sort(answer);
		return answer;
	}
//	public int[] solution(int[] numbers) {
//		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(int i=0; i<numbers.length-1; i++) {
//			for(int j=i+1; j<numbers.length; j++) {
//				int sum = numbers[i] + numbers[j];
//				if(!list.contains(sum)) {
//					list.add(sum);
//				}
//			}
//		}
//		
//        int[] answer = new int[list.size()];
//        for(int i=0; i<list.size(); i++) {
//        	answer[i] = list.get(i);
//        }
//        
//        Arrays.sort(answer);
//        return answer;
//    }
}
