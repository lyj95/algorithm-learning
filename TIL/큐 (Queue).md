## 큐 (Queue)

#### 큐란?

큐는 스택과 마찬가지로 데이터를 일시적으로 쌓아 놓는 자료구로, 가장 먼저 넣은 데이터를 가장 먼저 꺼내는 선입선출(FIFO, First In First Out)입니다.

데이터를 꺼내는 쪽을 프런트(front)라 하고, 데이터를 넣는 쪽을 리어(rear)라고 합니다.

#### 큐에서 지원하는 연산

- insert, enqueue, offer : queue의 rear에 새로운 원소를 삽입
- remove, dequeue, poll : queue의 fron에 있는 원소를 삭제하고 반환
- peek, element, front : queue의 front에 있는 원소를 제거하지 않고 반환



#### 큐의 활용 예

인쇄작업 대기목록, 버퍼(buffer), cpu 스케쥴링



#### 큐의 구현

- LinkedList를 이용한 큐 구현

```java
Queue q = new LinkedList();	//Queue인터페이스의 구현체인 LinkedList를 사용
		
q.offer("0");
q.offer("1");
q.offer("2");

		
while(!q.isEmpty()) {	
	System.out.println(q.poll());
}
```



- 배열을 이용한 큐 구현

```java
public class ArrayQueue {

	private int max; // 큐의 용량
	private int num; // 현재의 데이터 수
	private int[] que; // 큐의 본체

	// 생성자
	public ArrayQueue(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max]; // 큐 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없습니다.
			max = 0;
		}
	}

	// 큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntAryQueueException {
		if (num >= max)
			throw new OverflowIntAryQueueException(); // 큐가 가득 참
		que[num++] = x;
		return x;
	}

	// 큐에서 데이터를 디큐
	public int deque() throws EmptyIntAryQueueException {
		if (num <= 0)
			throw new EmptyIntAryQueueException(); // 큐가 비어 있음
		int x = que[0];
		for (int i = 0; i < num - 1; i++)
			que[i] = que[i + 1];
		num--;
		return x;
	}

	// 큐에서 데이터를 피크(머리 데이터를 살펴봄)
	public int peek() throws EmptyIntAryQueueException {
		if (num <= 0)
			throw new EmptyIntAryQueueException(); // 큐가 비어 있음
		return que[num - 1];
	}

	// 큐에서 x를 검색하여 index(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++)
			if (que[i] == x) // 검색성공
				return i;
		return -1; // 검색실패
	}

	// 큐를 비움
	public void clear() {
		num = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓인 데이터 수를 반환
	public int size() {
		return num;
	}

	// 큐가 비어 있는가?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 찼는가?
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 데이터를 머리→꼬리의 차례로 출력함
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비었습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[i] + " ");
			System.out.println();
		}
	}
}
```





> "자료구조와 함께 배우는 알고리즘 입문-자바편(Bohyoh Shibata 지음, 강민 옮김)" 참고
>
> "Java의 정석(남궁 성 지음)" 참고

