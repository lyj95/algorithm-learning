package codingTest.programmers.greedy;

//체육복 문제
class GreedyUniform {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n-lost.length;
        int count = 0;
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (reserve[j] == lost[i]) {
					reserve[j] = -1;
					lost[i] = -1;
					count++;
					break;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
					reserve[j] = -1;
					count++;
					break;
				}
			}
		}
		answer += count;
		System.out.println(answer);
		return answer;
	}
}