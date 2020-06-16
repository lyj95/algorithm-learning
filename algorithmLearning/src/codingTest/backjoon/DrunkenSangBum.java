package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 6359번 : 만취한 상범
public class DrunkenSangBum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());		// 테스트 케이스 개수 
		int[] floor = new int[T];						// 각 테스트 케이스의 방의 개수
		for (int i = 0; i < T; i++) {
			floor[i] = Integer.parseInt(br.readLine());	
		}

		for (int n : floor) {
			System.out.println(playGame(n));	
		}
	}

	public static int playGame(int n) {

		boolean[] room = new boolean[n];		// 방의 갯수 만큼 room 배열 생성 
												// false이면 문이 닫힌 상태
		
		for (int i = 1; i < n+1; i++) {			// 총 n번의 라운드를 진행
			for (int j = 1; j < n+1; j++) {		// 한번의 라운드 마다 방의 번호를 검사
				if (j % i == 0) {				// i번째 라운드에서 i의 배수인 j번째 방일 때
					room[j - 1] = !room[j-1];
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (room[i] == true) {				// room 배열에 있는 true의 개수를 계산
				cnt++;
			}
		}
		return cnt;     
	}

}
