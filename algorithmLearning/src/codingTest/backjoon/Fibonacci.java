package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 1003번 : 피보나치 함수
public class Fibonacci {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());	// testCase의 개수			
		int[] testCase = new int[T];				// 각 테스트 케이스의 값의 배열
		for(int i=0; i<T; i++) {
			testCase[i] = Integer.parseInt(br.readLine());
		}
		
		int[] zero = new int[41];		
		int[] one = new int[41];
		
		zero[0] = 1;						// 0일 때 0의 개수는 1개
		zero[1] = 0;						// 1일 때 0의 개수는 0개
		one[0] = 0;							// 0일 때 1의 개수는 0개
		one[1] = 1;							// 1일 때 1의 개수는 1개
		
		for(int i=2; i<=40; i++) {			// 2~40까지의 자연수의 0(zero)과 1(one)이 출력되는 횟수를 저장
			zero[i] = zero[i-1] + zero[i-2];
			one[i] = one[i-1] + one[i-2];
		}
		
		for(int t : testCase) {				// 각 테스트 케이스의 값의 0, 1이 출력되는 횟수 출력
			System.out.println(zero[t] +" "+ one[t]);
		}
	}
}

