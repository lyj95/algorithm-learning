package codingTest.backjoon;

import java.util.Scanner;

public class Virus {
	public static int arr[][];
	public static int n;
	public static int m;
	public static int cnt=0;
	public static int visited[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n+1][n+1];
		visited = new int[n+1];
		
		for(int i=0; i<m; i++) {
			int node1 = sc.nextInt();
			int node2 = sc.nextInt();
			
			arr[node1][node2]=1;	// 인접한 노드들은 1로
			arr[node2][node1]=1;
			
		}
		checkVirus(1);
		System.out.println(cnt);
	}
	
	public static void checkVirus(int node) {
		visited[node] = 1;	// 해당 노드를 방문
		for(int i=1; i<n+1; i++) {
				if(arr[node][i] == 1 && visited[i]==0) {
					cnt++;
					checkVirus(i);
				}
		}
		
	}
}
