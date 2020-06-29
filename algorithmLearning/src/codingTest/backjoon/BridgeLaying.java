package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1010번 : 다리 놓기
public class BridgeLaying {

	private static long[] f = new long[31];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());			// 테스트케이스의 개수
		int[][] site = new int[T][2];						// 각 테스트 케이스 서쪽과 동쪽에 있는 사이트 개수
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			site[i][0] = Integer.parseInt(st.nextToken());		// i번째 테스트케이스의 서쪽에 있는 사이트 개수 N
			site[i][1] = Integer.parseInt(st.nextToken());		// i번째 테스트케이스의 동쪽에 있는 사이트 개수 M
		}

		for (int[] s : site) {
			long res;	//결과
			if (s[1] == s[0]) {			// 동서쪽에 있는 사이트의 개수가 같으면 다리를 놓는 경우의 수는 1개 뿐
				res = 1;
			} else {
				int x = s[1] - s[0] >= s[0] ?  s[1] - s[0] :s[0];		// M-N or N 중 큰 값을 x
				int y = s[1] - s[0] >= s[0] ?  s[0] :s[1] - s[0];		// M-N or N 중 작은 값을 y
				
				long z = s[1];						
				for (int i = s[1] - 1; i > x; i--) {
					z *= i;								// M * M-1 * M-2 * ...* x-1 
				}
				res = z / factorial(y);					// M * M-1 * M-2 * ...* x-1 / y!
			}
			System.out.println(res);
		}
	}

	// n!을 구하는 함수
	public static long factorial(int n) {	// 처음에 펙토리얼로 할라고 만들고	
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		if (f[n] != 0)
			return f[n];
		return f[n] = n * factorial(n - 1);
	}

}
