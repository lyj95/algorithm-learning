package codingTest.programmers.test01;

//최대공약수 최소공배수 
public class GcdLcm {
	public int[] solution(int n, int m) {
	      int[] answer = new int[2];

	      answer[0] = gcd(n,m);
	      answer[1] = n*m/answer[0];
	      
	      return answer;
	  }
	  public int gcd(int a,int b){
	      if(a % b == 0)
	          return b;
	      return gcd(b,a%b);
	  }
}
