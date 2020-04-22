package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
	public static void main(String[] args) { 
		Stack st = new Stack();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		while(!st.isEmpty()) {	//Stack이 비어있는지 알려줌
			System.out.println(st.pop());
		}
		
		Queue q = new LinkedList();	//Queue인터페이스의 구현체인 LinkedList를 사용
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		
		while(!q.isEmpty()) {	
			System.out.println(q.poll());
		}
	}
}
