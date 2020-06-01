package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin0 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");	// default가 " " ?
		
		int N = Integer.parseInt(st.nextToken());			// 동전의 종류
		int K = Integer.parseInt(st.nextToken());			// 동전의 합으로 만들어야하는 수
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());		// N개의 동전의 가치
		}
		
		int tmp=K;	// 큰 동전 부터 뺐을 때 남은 값
		int cnt=0;	// 필요한 동전의 개수
		
		for(int i=N-1; i>=0; i--) {
			if(tmp/arr[i] > 0) {	
//				System.out.println(arr[i]+" : "+tmp/arr[i]);
				cnt += tmp/arr[i];		
				tmp %= arr[i];
			}
			if(tmp <= 0){
				break;
			}
		}
		System.out.println(cnt);
	}

}
