package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContestOrIntern {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		/*
		 * 먼저 최대로 만들 수 있는 팀을 구한 뒤 인턴으로 빠지는 경우를 생각한다.
		 * */
		
		int team = 0;
		int rN = 0;		// 팀을 이룬 뒤 남은 여자의 수
		int rM = 0;		// 팀을 이룬 뒤 남은 남자의 수
		
		if(N/2 >= M) {	
			team = M;
			rN = N - team*2;
			if( K > rN ) {
				team -= Math.ceil((double)(K-rN)/3);		
			}
			
		}else {
			team = (int)N/2;
			rN = N%2;
			rM = M -team;
			if( rN+rM < K) {
				team -= Math.ceil((double)(K-rN-rM)/3);
			}
		}
		
		team = team < 0 ? 0:team;		
		System.out.println(team);
	}

}
