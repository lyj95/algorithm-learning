package algorithm;

import java.util.ArrayList;

public class PrimeNumber {
	public static void main(String[] args) {
		getPrime1(30000);
		getPrime2(30000);
	}
	
	/** 
	 * [문제] 
	 * n을 입력받아 n전까지의 소수 모두 구하기 
	 * @author yeji 
	 * @param n까지 소수 구하기
	 */
	public static void getPrime1(int n) {
		for (int i = 2; i <= n; i++) {
			boolean isPrime = true; // 초기 값
			// for(int j=2; j<=i/2; j++) {
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					// 소수가 아니다.
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				// 소수 일때만 값을 출력
				System.out.print(i + " ");
			}
		}
	}

	public static void getPrime2(int num){
		ArrayList<Integer> prime = new ArrayList<Integer>(); 
		int cnt = 0;
        prime.add(2);
        for(int i=2; i <= num; i++){
            for(int j=0; j<prime.size(); j++){
                if(i%prime.get(j)==0){
                    break;
                }
                if(j+1 == prime.size()){
                    prime.add(i);
                }
            }
        }
        for(int i = 0; i<prime.size(); i++){
            cnt++;
            System.out.println(prime.get(i));
        }
        System.out.println("소수 개수 : " + cnt);
	}
}
