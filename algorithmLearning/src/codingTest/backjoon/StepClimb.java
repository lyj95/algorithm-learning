package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2579번 : 계단 오르기
public class StepClimb {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int n[] = new int[N+1];
		int climb[] = new int[N+1];
		
		for(int i=0; i<N; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		
		climb[0] = n[0];
		climb[1] = n[1]+n[0];
		climb[2] = Math.max(n[0]+n[2], n[1]+n[2]);
		
		if(N>=3) {
			for(int i=3; i<N+1; i++) {
				climb[i] = Math.max(climb[i-3]+n[i]+n[i-1], climb[i-2]+n[i]);	
			}
		}
		System.out.println(climb[N-1]);
	}

}
