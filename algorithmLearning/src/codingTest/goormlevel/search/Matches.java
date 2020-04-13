package codingTest.goormlevel.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;

 /**
 * [문제] 리그 경기 횟수 구하기
 * @author Yeji
 * 입력 -> 리그에 참여하는 팀의 수
 * 출력 -> 리그에서 치루어 지는 경기의 수
 */
public class Matches {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int res = 1;
		for(int i=2 ; i<Integer.parseInt(input) ; i++){
			res += i;
		}
		
		System.out.println(res);
	}
}
