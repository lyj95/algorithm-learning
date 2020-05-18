package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ConnectedComponent {

	private static LinkedList<Integer>[] list;	
	private static boolean visited[];
	private static int N, M;		// N : 정점의 개수, M : 간선의 개수
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		list = new LinkedList[N+1];	
		visited = new boolean[N+1];
		
		for(int i=0; i<=N; i++) {
			list[i] = new LinkedList<Integer>();	// 초기화
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());
			
			list[node1].add(node2);		// 연결된 정점끼리 추가
			list[node2].add(node1);		// 
			
		}
		
		int cnt=0;
		for(int i=1; i<= N; i++) {
			if(!visited[i]) {	// 해당하는 정점을 방문 안했으면 연결요소 검색
				check(i);		
				cnt++;			// 연결된 정점 방문 후 cnt 증가
			}
		}
		
		System.out.println(cnt);
	}
	
	public static void check(int i) {
		if(visited[i]) {		// 만약 해당 정점 방문 했으면 반환
			return;
		}	
		
		visited[i] = true;
		
		for(int nextNode : list[i]) {
			check(nextNode);
		}
	}
}
