package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 1003번 : 피보나치 함수
public class Fibonacci {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] testCase = new int[N];
		for(int i=0; i<N; i++) {
			testCase[i] = Integer.parseInt(br.readLine());
		}
		
		int[] zero = new int[41];
		int[] one = new int[41];
		
		zero[0] = 1;
		zero[1] = 0;
		one[0] = 0;
		one[1] = 1;
		
		for(int i=2; i<=40; i++) {
			zero[i] = zero[i-1] + zero[i-2];
			one[i] = one[i-1] + one[i-2];
		}
		
		for(int t : testCase) {
			System.out.println(zero[t] +" "+ one[t]);
		}
	}
}

