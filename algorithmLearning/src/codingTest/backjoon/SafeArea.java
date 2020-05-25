package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class SafeArea {
	private static int N;
	private static int arr[][];
	private static boolean visited[][];
	private static int[] dx = { 0, 0, 1, -1 };
	private static int[] dy = { 1, -1, 0, 0 };
	private static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());

		arr = new int[N][N];
		visited = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}


		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				hs.add(arr[i][j]);
			}
		}

		Iterator it = hs.iterator();


//		ArrayList list = new ArrayList<Integer>();
		int count[] = new int[hs.size()];
		int index=0;
		while (it.hasNext()) {
			int height = (int) it.next();
			for (int i = 0; i < N; i++) {
				Arrays.fill(visited[i], false);
				for (int j = 0; j < N; j++) {
					if (!visited[i][j] && arr[i][j] > height) {
						cnt=1;
						checkSafe(i, j, height);
					}
				
				}
				
			}
			count[index++] = cnt;
			System.out.println(cnt);

		}
		Arrays.sort(count);
		System.out.println(count[0]);
	}

	public static void checkSafe(int x, int y, int height) {

		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {		
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if (!visited[nx][ny] && arr[nx][ny] > height) {
					cnt++;					
					checkSafe(nx, ny, height);
				}
			}

		}


	}

}
