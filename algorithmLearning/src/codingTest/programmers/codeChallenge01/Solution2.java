package codingTest.programmers.codeChallenge01;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	public static void main(String args[]) {
		Solution2 s = new Solution2();
		s.solution(5);
	}

	public int[] solution(int n) {
		int res = 0;
		int direction = 1;
		int x = -1, y = 0;
		int[][] arr = new int[n][n];
		
		while(n >0) {
			if (direction == 1) {
				for (int i = 0; i < n; i++) {
					arr[++x][y] = ++res;
				}
				direction = 0;
				n--;
			} else if (direction == 0) {
				for (int i = 0; i < n; i++) {
					arr[x][++y] = ++res;
				}
				direction = -1;
				n--;
				
			} else if (direction == -1) {
				for (int i = 0; i < n; i++) {
					arr[--x][--y] = ++res;
				}
				direction = 1;
				n--;
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print("값: ");
//				System.out.print(arr[i][j]);
//				System.out.println();
				if(arr[i][j]!=0) {
					list.add(arr[i][j]);
				}
			}
		}

		int[] answer = new int[list.size()];
		int index = 0;
		for(int a : list) {
			answer[index++] = a;
		}
		return answer;
	}

}
