package codingTest.programmers.test01;

/**
 * [문제] 행렬의 덧셈
 * 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하라
 * @author Yeji
 *
 */
public class SumMatrix {
	
	/**
	 * @param arr1 행렬1
	 * @param arr2 행렬2
	 * @return 두 행렬 덧셈의 결과
	 */
	public int[][] sumMatrix(int[][] arr1, int[][] arr2) {
	      int[][] answer = new int[arr1.length][arr1[0].length];
	      
//	      int row = Math.max(arr1.length, arr2.length);
//	      int col = Math.max(arr1[0].length, arr2[0].length);
	      
	      for(int i = 0 ; i < arr1.length ; i++){
	          for(int j = 0 ; j < arr1[i].length ; j++) {
	        	  answer[i][j] = arr1[i][j] + arr2[i][j];
	          }
	      }
	      
	      return answer;
	  }
	
	// 테스트로 출력
    public static void main(String[] args) {
        SumMatrix c = new SumMatrix();
        int[][] A = { { 1, 2 }, { 2, 3 } };
        int[][] B = { { 3, 4 }, { 5, 6 } };
        int[][] answer = c.sumMatrix(A, B);
        if (answer[0][0] == 4 && answer[0][1] == 6 && 
                answer[1][0] == 7 && answer[1][1] == 9) {
            System.out.println("맞았습니다.");
        } else {
            System.out.println("틀렸습니다.");
        }
    }
}
