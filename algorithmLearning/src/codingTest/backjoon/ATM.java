package codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		
		int res = 0;
		int tmp = 0;
		for(int i=0; i<arr.length; i++) {
			tmp += arr[i];
			res += tmp;
		}
		
		System.out.println(res);
	}

}
