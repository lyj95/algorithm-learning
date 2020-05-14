package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSandBFS {
	public static boolean[] visited;
	public static LinkedList<Integer>[] nodeList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());;
		int v = Integer.parseInt(st.nextToken());;

		nodeList = new LinkedList[n + 1];
		visited = new boolean[n + 1];

		for (int i = 0; i <= n; i++) {
			nodeList[i] = new LinkedList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());

			nodeList[node1].add(node2);
			nodeList[node2].add(node1);

		}
		for (int j = 0; j < nodeList.length; j++) {
			Collections.sort(nodeList[j]);
		}

		dfs(v);
		System.out.println();
		Arrays.fill(visited, false);
		bfs(v);
	}

	public static void dfs(int node) {
		if (visited[node])
			return; // node를 이미 방문했으면 끝

		visited[node] = true; // node를 방문
		System.out.print(node + " "); // 방문한 노드 출력

		for (int nextNode : nodeList[node]) {
			dfs(nextNode); // 해당 노드의 다음 노드를 탐색
		}
	}

	public static void bfs(int node) {
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.offer(node);		// 탐색 시작 노드 큐에 저장
		visited[node] = true;	// 방문했으면 true

		while (!queue.isEmpty()) {
			int temp = queue.poll();
			System.out.print(temp + " ");

			for (int nextNode : nodeList[temp]) {
				if (!visited[nextNode]) {
					queue.offer(nextNode);
					visited[nextNode] = true;
				}
			}
		}
	}
}
