package codingTest.backjoon;

import java.util.Scanner;

public class Tomato {
	
	public static int[][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		arr = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j]==1) {
					tomato(i,j);
				}
			}
		}
		
		
	}
	
	public void tomato(int k, int m) {
		
	}
	
}
