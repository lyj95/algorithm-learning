package codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

// 1427번 : 소트인사이드
public class SortInside {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String N = scanner.nextLine();
		String[] arr = N.split("");
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i-- ) {
			System.out.print(arr[i]);
		}
		scanner.close();
	}

}
