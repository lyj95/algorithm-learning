package codingTest.programmers.test01;

public class SkillTestLevel2_1 {
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int total = brown + yellow;
        int hori, verti;
        
        for(int i=3; i<brown; i++) {
        	System.out.println(total/i);
        	if(i*2 + ((total/i)-2)*2 == brown && total%i == 0) {
        		hori = i;
        		verti = total/i;
        		if(hori < verti){
        			int tmp = hori;
        			hori = verti;
        			verti = tmp;
        		}
        		answer[0] = hori;
        		answer[1] = verti;
        		break;
        	}
        }
        
        return answer;
    }
}
