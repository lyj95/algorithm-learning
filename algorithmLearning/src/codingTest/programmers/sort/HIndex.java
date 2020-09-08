package codingTest.programmers.sort;

import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {
		HIndex h = new HIndex();
		int[] ci = { 3, 0, 6, 1, 5 };
		System.out.println(h.solution(ci));
	}

	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);

		for (int i = 0; i < citations.length; i++) {
			int h = citations.length - i;
			System.out.println("h : "+h);
			
			if (citations[i] >= h) {
				answer = h;
				break;
			}
		}

		return answer;
	}

//	public int solution(int[] citations) {
//        
//        Arrays.sort(citations);
//        
//        int hIndex = citations.length;
//        
//        if(hIndex == 0) {
//        	return 0;
//        }else {
//        	while(true) {
//        		int up = 0, down = 0;
//        		for(int i=citations.length-1; i>=0; i--) {
//        			if(hIndex <= citations[i]) {
//        				up++;
//        			}else {
//        				down++;
//        			}
//        		
//        		}
//        		if(up >= hIndex || down >= hIndex) {
//        			return hIndex; 
//        		}
//        		hIndex--;	
//        	}
//        }
//    }

}
