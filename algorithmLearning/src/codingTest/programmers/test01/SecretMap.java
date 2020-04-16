package codingTest.programmers.test01;

/**
 * [문제] 카카오 블라인드 코테 - 비밀지도
 * 
 * @author Yeji
 * 
 */
public class SecretMap {
	/**
	 * @param n 지도의 한 변의 크기
	 * @param arr1 정수배열 (첫번째 지도)
	 * @param arr2 정수배열 (두번째 지도)
	 * @return
	 */
	// 비트연산자로 간단하게 구현
	public String[] solution2(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			answer[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i])).replace("1", "#").replace("0", " ");
		}

		return answer;
	}

	// solution2 함수와 동일
	public String[] solution3(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
		}

		for (int i = 0; i < n; i++) {
			answer[i] = String.format("%" + n + "s", answer[i]);
			answer[i] = answer[i].replaceAll("1", "#");
			answer[i] = answer[i].replaceAll("0", " ");
		}

		return answer;
	}

	// 재귀함수 사용 (시간이 더 효율적임)
	public String makeSharp(int n, int m) {
		if (n == 0) {
			if (m > 0) {
				String str = "";
				for (int i = 0; i < m; i++) {
					str += " ";
				}
				return str;
			} else
				return "";
		} else {
			return n % 2 == 0 ? makeSharp(n / 2, m - 1) + " " : makeSharp(n / 2, m - 1) + "#";
		}
	}

	public String[] solution4(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		int[] secretMap = new int[n];
		for (int i = 0; i < n; i++) {
			secretMap[i] = arr1[i] | arr2[i];
			answer[i] = makeSharp(secretMap[i], n);
		}
		return answer;
	}

}
