## Comparable와 Comparator

둘다 인터페이스로 컬렉션을 정렬하는데 필요한 메서드를 정의하고 있음



#### Comparable

기본 정렬기준을 구현하는데 사용

> Comparable은 java.lang 패키지에 있다.



- 실제 소스코드

```java
pulbic interface Comparable{
    public int compareTo(Object o);
}
```

compareTo()의 반환값은 두객체가 같으면 0, 비교하는 것보다 작으면 음수, 크면 양수를 반한하도록 구현해야한다.



#### Comparator 

기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용

> Comparator는 java.util 패키지에 있다.



- 실제 소스코드

```java
public interface Comparator{
    int compare(Object o1, Object o2);
    boolean equals(Object obj);
}
```





#### Comparator와 Comparable의 예제

```java
public class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};

		Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending()); // 역순 정렬(내림차순)
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}
```

- 출력

```
strArr=[Dog, cat, lion, tiger]
strArr=[cat, Dog, lion, tiger]
strArr=[tiger, lion, cat, Dog]
```



- ``` 
  static void sort(Object[] a)	
  // 객체 배열에 저장된 객체가 구현한 Comparable에 의한 정렬
  ```

- ```
  static void sort(Object[] a, Comparator c)
  // 지정한 Comparator에 의한 정렬
  // String.CASE_INSENSITIVE_ORDER => 대소문자 구분안함
  // new Descending() => 내림차순 정렬
  ```