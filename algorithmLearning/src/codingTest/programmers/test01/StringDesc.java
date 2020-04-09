package codingTest.programmers.test01;

import java.util.Arrays;
import java.util.Collections;


/**
 * 문자열 내림차순으로 배치하기
 * @author Yeji
 * @param 무작위의 문자열
 * @return 내림차순으로 정렬된 문자열
 */
public class StringDesc {
	public String solution(String s) {
		String answer = "";
	      
	    String str[] = s.split("");
	    Arrays.sort(str, Collections.reverseOrder());
	    
	    for(int i=0; i<str.length; i++) {
            answer += str[i];
	     }
	    return answer;
	  }
}
