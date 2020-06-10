package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2579번 : 계단 오르기
public class StepClimb {
	private static int[] n;
	private static boolean[] check;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		n = new int[N];
		check = new boolean[N];
		for(int i=0; i<N; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		
	}
	
	public static void climb() {
		
	}

}
