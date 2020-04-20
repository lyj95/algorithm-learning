package algorithm;

import java.util.Arrays;
import java.util.Scanner;


/**
 * [알고리즘] 이진탐색
 * @author Yeji
 *
 */
public class BinarySearch {
	/** 
	 * 반복문을 이용한 이진탐색
	 * @param a 이진탐색을 할 배열
	 * @param n 요솟수
	 * @param key 찾을 값
	 * @return 몇번 째 인덱스에 있는지 반환 / 검색 실패시 -1반환
	 */
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n - 1; // 검색 범위의 끝 인덱스

		do {
			int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
			if (a[pc] == key)
				return pc; // 검색 성공!
			else if (a[pc] < key)
				pl = pc + 1; // 검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색 범위를 앞쪽 절반으로 좁힘
		} while (pl <= pr);
		
		return -1; // 검색 실패!
	}
	
	
	/**
	 * 재귀함수 사용한 이진 탐색
	 * @param arr 배열
	 * @param target 검색할 값
	 * @param low 검색 범위 맨 앞의 인덱스
	 * @param high 검색 범위 맨 끝의 인덱스
	 * @return 
	 */
	static int binSearchRecursive(int arr[], int target, int low, int high) {
	    if (low > high)
	        return -1;

	    int mid = (low + high) / 2;
	    if (arr[mid] == target)
	        return mid;
	    else if (arr[mid] > target)
	        return binSearchRecursive(arr, target, low, mid-1);
	    else
	        return binSearchRecursive(arr, target, mid+1, high);
	}

	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = scanner.nextInt();
		int[] x = new int[num]; // 요솟수가 num인 배열

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]："); // 첫 요소 입력
		x[0] = scanner.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]：");
				x[i] = scanner.nextInt();
			} while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력
		}

		System.out.print("검색할 값："); // 키값을 입력
		int ky = scanner.nextInt();

		// 반복문 사용
//		int idx = binSearch(x, num, ky); // 배열x에서 값이 ky인 요소를 검색
		
		// 재귀함수 사용
//		int idx = binSearchRecursive(x, ky, 0, num);
		
		// java.util.Arrays 클래스가 제공하는 메서드 사용
		int idx = Arrays.binarySearch(x, ky);	// 배열 x에서 키 값이 ky인 요소를 검색

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		
		scanner.close();
	}
}
