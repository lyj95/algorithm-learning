package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1010번 : 다리 놓기
public class BridgeLaying {

	private static long[] f = new long[31];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] site = new int[T][2];
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			site[i][0] = Integer.parseInt(st.nextToken());
			site[i][1] = Integer.parseInt(st.nextToken());
		}

		for (int[] s : site) {
			long res;
			if (s[1] == s[0]) {
				res = 1;
			} else {
				int x = s[1] - s[0] >= s[0] ?  s[1] - s[0] :s[0];
				int y = s[1] - s[0] >= s[0] ?  s[0] :s[1] - s[0];
				long z = s[1];
				
				for (int i = s[1] - 1; i > x; i--) {
					z *= i;
				}
				res = z / factorial(y);
			}
			System.out.println(res);
		}
	}

	public static long factorial(int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		if (f[n] != 0)
			return f[n];
		return f[n] = n * factorial(n - 1);
	}

}
