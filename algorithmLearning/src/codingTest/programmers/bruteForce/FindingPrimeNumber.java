package codingTest.programmers.bruteForce;

import java.util.ArrayList;
import java.util.List;

// 소수 찾기
public class FindingPrimeNumber {
	
	public static void main(String args[]) {
		FindingPrimeNumber fpn = new FindingPrimeNumber();
		System.out.println(fpn.solution("17"));
	}
	
	
	public int solution(String numbers) {
		int answer = 0;
		
		String[] numArr = numbers.split("");
		
		List<Integer> list = new ArrayList<Integer>();
		
		
//		for(int i=0; i<numArr.length; i++) {
//			Integer.parseInt(numArr[i]);
//		}
		
		return answer;
	}
	
	public boolean primeNumber(int num) {
		
//		boolean check = false;
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
