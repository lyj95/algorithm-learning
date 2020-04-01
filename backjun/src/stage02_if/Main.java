package stage02_if;

import java.util.Arrays;
import java.util.Scanner;

//10817
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] order = new int[3];
		int a = 0;

		for (int i = 0; i < order.length; i++) {
			a = sc.nextInt();
			order[i] = a;
		}

		Arrays.sort(order);
		System.out.println(order[1]);

//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		
//		if(n1 >= n2) {
//			if(n2 >= n3) {
//				System.out.println(n2);
//			}else {
//				if(n1 >= n3) {
//					System.out.println(n3);
//				} else {
//					System.out.println(n1);
//				}
//			}
//		}else {
//			if(n2 < n3) {
//				System.out.println(n2);
//			}else {
//				if(n1 < n3) {
//					System.out.println(n3);
//				}else {
//					System.out.println(n1);
//				}
//			}
//		}
		sc.close();
		
	}
}

class Main2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		if (m <= 59 && m >= 45) {
			System.out.println(h + " " + (m - 45));
		} else {
			if (h == 0) {
				System.out.println(23 + " " + (15 + m));
			} else {
				System.out.println((h - 1) + " " + (15 + m));
			}
		}
	}
}

class Main2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (year % 4 == 0) {
			if (year % 100 != 0 || year % 400 == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		} else {
			System.out.println("0");
		}
	}
}
