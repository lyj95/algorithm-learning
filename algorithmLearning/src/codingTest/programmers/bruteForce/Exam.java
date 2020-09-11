package codingTest.programmers.bruteForce;

import java.util.ArrayList;
import java.util.List;

// 모의고사
public class Exam {

	public static void main(String args[]) {
		int[] answers = { 1,3,2,4,2 };
		
		int[] answer = solution(answers);
		for(int a : answer) {
			System.out.println(a);
		}
	}

	public static int[] solution(int[] answers) {

		// 학생별 찍은 답지 초기화
		int[] student1 = { 1, 2, 3, 4, 5 };
		int[] student2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] student3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		// 학생별 몇개 맞았는지 score[]에 저장
		int[] score = { 0, 0, 0 };
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == student1[i % 5]) {
				score[0]++;
			}
			if (answers[i] == student2[i % 8]) {
				score[1]++;
			}
			if (answers[i] == student3[i % 10]) {
				score[2]++;
			}
		}
		
		// 가장 많이 맞춘 학생의 갯수 구하기
		int max = Math.max(Math.max(score[0], score[1]),score[2]); 

		// list에 가장 많이 맞춘 학생의 번호 찾아서 넣기
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < score.length; i++) {
			if (score[i] == max) {
				list.add(i + 1);
			}
		}
		
		// list를 array에 담기
		int[] answer = {};
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
