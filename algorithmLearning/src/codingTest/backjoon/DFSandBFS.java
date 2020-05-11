package codingTest.backjoon;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFSandBFS {
	public static int n, m, v;
	public static boolean[] dfsVisited;
	public static boolean[] bfsVisited;
	public static LinkedList<Integer>[] nodeList;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		v = sc.nextInt();
		
		nodeList = new LinkedList[n+1];
		dfsVisited = new boolean[n+1];
		bfsVisited = new boolean[n+1];

		for(int i=0; i<=n; i++) {
			nodeList[i] = new LinkedList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			int node1 = sc.nextInt();
			int node2 = sc.nextInt();
			
			nodeList[node1].add(node2);
			nodeList[node2].add(node1);
			
			Collections.sort(nodeList[node1]);
			Collections.sort(nodeList[node2]);
			
		}
		
		dfs(v);
		System.out.println();
		bfs(v);
	}
	
	public static void dfs(int node) {
		if(dfsVisited[node]) return;	// node를 이미 방문했으면 끝
		
		dfsVisited[node] = true;		// node를 방문
		System.out.print(node + " ");	// 방문한 노드 출력
		
		for(int nextNode : nodeList[node]) {
			dfs(nextNode);	// 해당 노드의 다음 노드를 탐색
		}
	}
	
	public static void bfs(int node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		
		queue.offer(node);
		
		bfsVisited[node] = true;
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			System.out.print(temp + " ");
			
			for(int i=0; i<=n; n++) {
				
				if(!bfsVisited[i]) {
					queue.offer(i);
					bfsVisited[i] = true;
				}
			}
		}
	}
}
