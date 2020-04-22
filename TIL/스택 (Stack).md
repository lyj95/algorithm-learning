## 스택 (Stack)

#### 스택이란?

스택은 데이터를 일시적으로 저장하기 위해 사용하는 자료구조로, 데이터의 입출력 순서는 후입선출(LIFO, Last In First Out)입니다. (가장 나중에 넣은 데이터를 가장 먼저 꺼냅니다.)

스택에 데이터를 넣는 작업을 푸시(push)라 하고, 데이터를 꺼내는 작업은 팝(pop)이라고 합니다. 푸시와 팝을 하는 위치를 꼭대기(top)라 하고, 가장 아랫부분을 바닥(bottom)이라고 합니다.



> Java프로그램에서 메서드를 호출하고 실행할 때 프로그램 내부에서는 스택을 사용함



#### 스택의 활용 예

수식계산, 수식괄호검사, 웹브라우저의 뒤로/앞으로



#### 스택의 구현

- 배열을 이용한 스택 구현

```java
public class ArrayStack {
	private int max;			// 스택 용량
	private int ptr;			// 스택 포인터
	private int[] stk;			// 스택 본체

	// 생성자
	public ArrayStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];				// 스택 본체용 배열을  생성
		} catch (OutOfMemoryError e) {		// 생성할 수 없음
			max = 0;
		}
	}

	// 푸시(push)
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max)									// 스택이 가득 참
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	// 팝(pop)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)									// 스택이 비어 있음
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄) 
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)									// 스택이 비어 있음
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	// 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--)				// 정상 쪽에서 선형 검색
			if (stk[i] == x)
				return i;								// 검색 성공
		return -1;										// 검색 실패
	}

	// 스택을 비움
	public void clear() {
		ptr = 0;
	}

	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}

	// 스택에 쌓여 있는 데이터 수를 반환
	public int size() {
		return ptr;
	}

	// 스택이 비어 있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}

	// 스택 안의 모든 데이터를 바닥 → 꼭대기 순서로 출력
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
    
    	// 실행 시 예외 : 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() { }
	}

	// 실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() { }
	}
```



- java.util.Stack 이용한 스택 구현

```java
Stack st = new Stack();
		
st.push("0");
st.push("1");
st.push("2");

while(!st.isEmpty()) {		//Stack이 비어있는지 알려줌
	System.out.println(st.pop());
}
```









> "자료구조와 함께 배우는 알고리즘 입문-자바편(Bohyoh Shibata 지음, 강민 옮김)" 참고
>
> "Java의 정석(남궁 성 지음)" 참고