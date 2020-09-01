package codingTest.programmers.sort;

import java.util.Arrays;


public class KthNumber {

	public static void main(String[] args) {
		KthNumber s = new KthNumber();
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1}};
		System.out.println(s.solution(array, commands));
	}
	
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
        	answer[i]=cuttingSort(array, commands[i]);
        }

        return answer;
    }
	
	public int cuttingSort(int[] array, int[] command) {
		int[] arr = Arrays.copyOfRange(array, command[0]-1, command[1]);
		Arrays.sort(arr);
		return arr[command[2]-1];
	}

}
