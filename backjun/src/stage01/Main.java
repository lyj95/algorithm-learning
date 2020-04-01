package stage01;
import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input1 = br.readLine();
			String[] str1 = input1.split(" ");
			int n = Integer.parseInt(str1[0]);
			int k = Integer.parseInt(str1[1]);
		
			String input2 = br.readLine();
			String[] str2 = input2.split(" ");
	
			int res;
			if(k == 1) {
				res = Integer.parseInt(str2[n-1])-Integer.parseInt(str2[0]);
				System.out.println(res);
			}else if(k == n) {
				System.out.println(0);
			}else {
				for(int i=1; i<=k; i++) {
					res=0;
				}
				
			}
			
	}
}