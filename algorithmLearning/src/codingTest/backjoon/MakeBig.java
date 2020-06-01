package codingTest.backjoon;

import java.util.Scanner;

public class MakeBig {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), t = 0;
		char c, s[] = new char[n];

		String str = sc.next();

		while (n-- > 0) {
			do {
				c = str.charAt(str.length() - n - 1);
			} while (c < 48 || 57 < c);
			while (k > 0 && t > 0 && s[t - 1] < c) {
				t--;
				k--;
			}
			s[t++] = c;
		}
		t -= k;
		sc.close();

		for (k = 0; k < t; k++)
			System.out.print(s[k]);
	}
}
//
//public class MakeBig {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		int N = Integer.parseInt(st.nextToken());
//		int K = Integer.parseInt(st.nextToken());
//		
//		st = new StringTokenizer(br.readLine());
//		String[] num = st.nextToken().split("");
//		
//		// 큰 수 N-K개 구하고
//		// 큰 수들 나열??
//		
//		LinkedList<Integer>[] maxList = new LinkedList[N-K];
//		
//		for(int i=0; i<N-K; i++) {
//			maxList[i] = new LinkedList<Integer>();	// 초기화
//		}
//		for(int i=0; i<N; i++) {
//		}
//		
//		
//		System.out.println(maxList.toString());
////		for(int i=0; i<N; i++) {
////			
////		}
//		
//		
//		
//	}
//
//}
