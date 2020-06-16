package codingTest.backjoon;

import java.util.Scanner;

// 14852번 : 타일 채우기 3
public class TileFilling3 {
	private static long[][] d = new long[1000001][2];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(dp(x));
	}
	
	public static long dp(int x) {
		d[0][0] = 0;
		d[1][0] = 2;
		d[2][0] = 7;
		d[2][1] = 1;
		
		for(int i=3; i<=x; i++) {
			d[i][1] = (d[i-1][1] + d[i-3][0]) % 1000000007;
			d[i][0] = (3 * d[i-2][0] + 2*d[i-1][0] + 2*d[i][1]) % 1000000007;
		}
		return d[x][0];
	}
}




/* 시간 초과 !!
public class TileFilling3 {
	static long[] d = new long[1000001];

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.println(dp(x));

	}
	public static long dp(int x) {
		if(x == 0) return 1;
		if(x == 1) return 2;
		if(x == 2) return 7;
		if(d[x] != 0) return d[x];
		
		long result = 3 * dp(x-2) + 2 * dp(x-1);
		
		for(int i=3; i<=x; i++) {
			result += (2*dp(x-i)) % 100000007;
		}
		return d[x] = result % 100000007;
	}
}
*/
