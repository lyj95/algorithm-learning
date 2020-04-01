package test01;

public class HarshadNumber {
	public boolean solution(int x) {
	      
	      String[] arr = Integer.toString(x).split("");
	      
	      int sum = 0;
	      for(int i=0; i<arr.length; i++) {
	    	  sum += Integer.parseInt(arr[i]);
	      }
	      
	      return sum%x == 0? true:false;
	  }
	
	public boolean anotherSoultion(int num) {
		String[] temp = String.valueOf(num).split("");

	    int sum = 0;
	    for (String s : temp) {
	        sum += Integer.parseInt(s);
	    }

	    if (num % sum == 0) {
	            return true;
	    } else {
	      return false;
	    }
	    }
	
}
