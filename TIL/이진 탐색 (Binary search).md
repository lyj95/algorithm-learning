## 이진 탐색 (Binary search)

#### 이진 탐색이란?

요소가 오름차순 또는 내림차순으로 정렬된 배열에서 검색하는 알고리즘입니다.

이 알고리즘을 적용하는 전제 조건은 데이터가 키 값으로 이미 정렬(sort)되어 있다는 것입니다.



#### 이진 탐색 시간 복잡도

탐색하는 데이터 집합의 크기를 n, 반복 횟수를 k로 두었을 때

n * (2/1)^k = 1
n = 2^k
k = log n

시간 복잡도 => O(log n)



#### 이진 탐색  장단점

`장점`

선형 탐색보다 탐색 시간이 빠르다.

- 선형 탐색 알고리즘 : O(n)
- 이진 탐색 알고리즘 : O(log n)

`단점`

정렬된 데이터에서만 사용할 수 있다.



#### 이진 탐색 알고리즘 구현

- 반복문을 사용한 이진 탐색

```java
static int binSearch(int[] a, int n, int key) {
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n - 1; // 검색 범위의 끝 인덱스

		do {
			int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
			if (a[pc] == key)
				return pc; // 검색 성공!
			else if (a[pc] < key)
				pl = pc + 1; // 검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색 범위를 앞쪽 절반으로 좁힘
		} while (pl <= pr);
		
		return -1; // 검색 실패!
	}
```



- 재귀함수를 사용한 이진 탐색

```java
static int binSearchRecursive(int arr[], int target, int low, int high) {
	    if (low > high)
	        return -1;

	    int mid = (low + high) / 2;
    
	    if (arr[mid] == target)
	        return mid;
	    else if (arr[mid] > target)	
	        return binSearchRecursive(arr, target, low, mid-1); 
	    else
	        return binSearchRecursive(arr, target, mid+1, high);
	}
```



- java.util.Arrays 클래스가 제공하는 메서드 사용하여 간단하게 구현

```java
int idx = Arrays.binarySearch(x, key);	// 배열 x에서 키 값이 key인 요소를 검색
```



