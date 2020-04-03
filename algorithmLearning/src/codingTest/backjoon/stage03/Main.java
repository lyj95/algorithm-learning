package codingTest.backjoon.stage03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
	}
}


class Main11021 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {
			String text = br.readLine();
            String[] str = text.split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int sum = a + b;

			bw.write("Case #"+i+": "+sum + "\n");
		}
		bw.flush();
		bw.close();
	}
}


class Main2742 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		for(int i=num; i>=1; i--) {
			System.out.println(i);
		}
	}
}



class Main2741 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
	}
}


class Main15552 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			String text = br.readLine();
            String[] str = text.split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int sum = a + b;

			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
	}
}

class Main8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}

class Main10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum[] = new int[num];

		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum[i] = a + b;
		}
		for (int i = 0; i < num; i++) {
			System.out.println(sum[i]);
		}
	}
}

class Main2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

		sc.close();
	}
}
