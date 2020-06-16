package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2579번 : 계단 오르기
public class StepClimb {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); 	// 계단의 개수
		int[] step = new int[N]; 					// 각 계단의 점수
		int[] climb = new int[N]; 					// 계단을 오를 때 마다 최대값

		for (int i = 0; i < N; i++) {
			step[i] = Integer.parseInt(br.readLine());
		}

		climb[0] = step[0]; 						// 계단이 1개일 땐 최대값은 첫계단 뿐
		if(N >= 2)									// 계단이 2개 일 때 최대값은 두계단을 합한 값뿐
			climb[1] = step[1] + step[0];

		if (N >= 3)					
			climb[2] = Math.max(step[0] + step[2], step[1] + step[2]);	
		
		if (N >= 4) {
			for (int i = 3; i < N; i++) {
				climb[i] = Math.max(climb[i - 3] + step[i - 1] + step[i], climb[i - 2] + step[i]);
			}					     
		}
		System.out.println(climb[N - 1]);

	}
}
