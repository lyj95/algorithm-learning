package test01;

import java.util.Arrays;
import java.util.Collections;


/**
 * ���ڿ� ������������ ��ġ�ϱ�
 * @author Yeji
 * @param �������� ���ڿ�
 * @return ������������ ���ĵ� ���ڿ�
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
