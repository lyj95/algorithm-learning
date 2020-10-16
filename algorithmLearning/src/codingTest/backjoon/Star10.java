package codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Star10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		
		while(N >= 3) {
			list.add(N);
			N=N/3;
		}
		for(int i=0; i<list.get(0); i++) {
			for(int j=0; j<list.get(0); j++) {

				boolean check = true;
				for(int k=0; k<list.size(); k++) {
					int n = list.get(k)/3;
					if(i >= list.get(k)-n*2 && i <list.get(k) - n
							&& j >= list.get(k)-n*2 && j <list.get(k) - n ) {
						System.out.print(" ");
						check=false;
						break;
					}
				}
				if(check == true) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
