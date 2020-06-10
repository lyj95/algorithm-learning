package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 6359번 : 만취한 상범
public class DrunkenSangBum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());
		int[] floor = new int[T];
		for (int i = 0; i < T; i++) {
			floor[i] = Integer.parseInt(br.readLine());
		}

		for (int n : floor) {
			System.out.println(playGame(n));
		}
	}

	public static int playGame(int n) {

		boolean[] room = new boolean[n];
		
		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < n+1; j++) {
				if (j % i == 0) {
					if (room[j - 1] == false) {
						room[j - 1] = true;
					} else {
						room[j - 1] = false;
					}
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (room[i] == true) {
				cnt++;
			}
		}
		return cnt;
	}

}
