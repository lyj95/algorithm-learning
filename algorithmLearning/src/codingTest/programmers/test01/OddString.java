package codingTest.programmers.test01;

public class OddString {
	public String solution(String s) {
		String answer = "";

		//단어는 하나 이상의 공백문자로 구분되어 있다
		
		String str[] = s.split("");

		int cnt = 0;
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals(" ")) {
				cnt = 0;
			}else {
				if(cnt % 2== 0) {
					str[i] = str[i].toUpperCase();
				}else {
					str[i] = str[i].toLowerCase();
				}
				cnt++;
			}
			answer += str[i];
		}
		System.out.println(answer);

		return answer;
	}
	
	
	  public String anotherSolution(String s) {
		  	
		  	// 더 간단하게 풀이 가능
	        String answer = "";
	        int cnt = 0;
	        String[] array = s.split("");

	        for(String ss : array) {
	            cnt = ss.contains(" ") ? 0 : cnt + 1;
	            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
	        }
	      return answer;
	  }
}
