package codingTest.programmers.test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {

	public static void main(String args[]) {
		int[] answers = { 1, 2, 3, 4, 5 };
		System.out.println(solution(answers));
	}

	public static int[] solution(int[] answers) {

		// 학생별 찍은 답지 초기화
		int[] student1 = { 1, 2, 3, 4, 5 };
		int[] student2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] student3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		// 학생별 몇개 맞았는지 cnt[]에 저장
		int[] cnt = { 0, 0, 0 };
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == student1[i % 5]) {
				cnt[0]++;
			}
			if (answers[i] == student2[i % 8]) {
				cnt[1]++;
			}
			if (answers[i] == student3[i % 10]) {
				cnt[2]++;
			}
		}
		// 가장 많이 맞춘 학생의 갯수 구하기
		int max = cnt[0];
		if (cnt[1] > max) {
			max = cnt[1];
		} else if (cnt[2] > max) {
			max = cnt[2];
		}

		///// 만약에 다 틀리는 경우에는 ??????

		// list에 가장 많이 맞춘 학생의 번호 넣기
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == max && cnt[i] > 0) {
				list.add(i + 1);
			}
		}
		Collections.sort(list);
		
		// list를 array에 담기
		int[] answer = {};
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
