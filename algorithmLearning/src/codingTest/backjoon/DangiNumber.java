package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class DangiNumber {

	private static int dx[] = { 0, 0, 1, -1 };
	private static int dy[] = { 1, -1, 0, 0 };
	private static int N; // 지도의 가로세로 길이
	private static int[][] map; // N x N의 지도   
	private static boolean[][] visited; // 아파트 방문 여부
	private static int cnt = 0; 
	private static ArrayList<Integer> dangies = new ArrayList<Integer>();	// 단지 개수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());

		// 입력받은 수만큼 배열의 방 만들어주기
		map = new int[N][N];
		visited = new boolean[N][N];

		// 지도 채우기
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(str.charAt(j) + "");		// 집이 있는 곳 :1, 없는 곳 : 0
			}
		}

		// 아파트 단지 찾기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j] && map[i][j] == 1) {
					cnt = 1;				// (i,j)의 아파트 
					dangi(i, j);
					dangies.add(cnt);		// 단지내 집 수 저장
				}
			}
		}

		Collections.sort(dangies);
		System.out.println(dangies.size());	// 총 단지 수 	

		for (int i = 0; i < dangies.size(); i++) {
			System.out.println(dangies.get(i));
		}
	}

	public static void dangi(int x, int y) {

		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {		// 현재 위치(x,y)의 상하좌우에 연결된 아파트가 있는 지 검사 
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if (map[nx][ny] == 1 && !visited[nx][ny]) {
					dangi(nx, ny);
					cnt++;					
				}
			}

		}

	}

}
