package codingTest.programmers.test01;

//체육복 문제
public class GreedyUniform {
	    public int solution(int n, int[] lost, int[] reserve) {
	         int answer = n;
	        int chk = 0;
	        for(int i=0; i<lost.length; i++) {
	            chk=0;
	        	for(int j=0; j<reserve.length; j++) {  
	        		if(reserve[j] == lost[i]-1 || reserve[j] == lost[i]+1) {
	        			chk=1;
	                    break;
	        		}
	        	}
	        }
	     if(chk == 0){
	            answer--;
	        }
	        System.out.println(answer);
	        return answer;
	    }
}
