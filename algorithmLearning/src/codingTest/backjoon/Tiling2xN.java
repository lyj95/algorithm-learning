package codingTest.backjoon;

import java.util.Scanner;

// backjoon 11726번
public class Tiling2xN {

	static int[] d = new int[1001];
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();		
		System.out.println(dp(x));
		
	}
	public static int dp(int x) {
		if(x == 1) return 1;
		if(x == 2) return 2;
		if(d[x] !=0) return d[x];
		return d[x] = (dp(x -1)+ dp(x-2)) % 10007;
	}

}
