package lesson;

public class Solution {
	public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int len = A.length;
        int[] B = new int[len];
        int num = K%len;
        
        for(int i=0; i<len; i++) {
        	if(i >= num) {
        		B[i] = A[len-num+i];
        	}else {
        		B[i] = A[i-num];
        	}
        }
        
        return B;
    }
}
