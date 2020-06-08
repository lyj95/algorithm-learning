package codingTest.backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ship {
	static private ArrayList<Integer> nList = new ArrayList<Integer>(); // 각 크레인n의 무게 제한
	static private ArrayList<Integer> mList = new ArrayList<Integer>(); // 각 박스m의 무게
	static private int N, M;
	static private int cnt = 0;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 크레인 수
		for (int i = 0; i < N; i++) {
			nList.add(sc.nextInt());
		}

		M = sc.nextInt(); // 박스의 수
		for (int i = 0; i < M; i++) {
			mList.add(sc.nextInt());
		}

		Collections.sort(mList, Collections.reverseOrder());
		Collections.sort(nList, Collections.reverseOrder());
		// 박스 0번째                    크레인 0번째
		if (mList.get(0) > nList.get(0)) {	
			cnt = -1;		// 가장 큰 상자를 가장 큰 크레인으로 옮길 수 없으면 모든 상자를 옮길 수 없기 때문에 -1
		} else {
			carryBox();		// 해당 함수는 모든 상자를 옮길 수 있다는 전제로 시작

		}

		System.out.println(cnt);

	}

	static void carryBox() {		

		while (mList.size() > 0) {	// 옮길 상자가 더이상 없을 때 까지
			int index = 0;		// 크레인 인덱스
			
			for (int i = 0; i < mList.size(); i++) {	// 모든 박스 검사 
				
				if (index == nList.size() ) {		// 크래인 n개에 실을 수 있는 박스를 다 검사했을 경우 
					break;		//for문만 나가는거임
				}

				if (mList.get(i) <= nList.get(index)) {	//index째 크레인에 i번째 상자를 실을 수 있을 때
//					System.out.println(mList.get(i) + ",,," + nList.get(index));
					mList.remove(i);					// 해당 상자 없앰
					i--;								// 상자를 하나 없앴기 때문에 인덱스 하나 줄여주기
					index++;							// 다음 인덱스 크레인 검사
				} 

			}
			cnt++;		// 실을 수 있는 박스를 실었을 때 cnt 증가
		}

	}
}
