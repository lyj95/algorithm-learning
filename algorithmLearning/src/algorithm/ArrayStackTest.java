package algorithm;

import java.util.Scanner;

public class ArrayStackTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayStack s = new ArrayStack(64);	// 최대 64개를 푸시할 수 있는 스택

		while (true) {
			System.out.println("현재 데이터 수：" + s.size() + " / "
															  + s.capacity());
			System.out.print("(1)푸시　(2)팝　(3)피크　" +
								  "(4)덤프　(0)종료：");

			int menu = scanner.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
			 case 1: 							// 푸시
				System.out.print("데이터：");
				x = scanner.nextInt();
				try {
					s.push(x);
			 	} catch (ArrayStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			 case 2: 							// 팝
				try {
			 		x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
			 	} catch (ArrayStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 3: 							// 피크
				try {
			 		x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
			 	} catch (ArrayStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 4: 							// 덤프
				s.dump();
				break;
			}
		}
		
		scanner.close();
	}
}
