## 재귀 알고리즘

#### 재귀란?

어떤 사건이 자기 자신을 포함하고 다시 자기 자신을 사용하여 정의될 때 재귀적(recursive)이라고 한다.



#### 재귀의 기본 - 팩토리얼 구하기

음이 아닌 정수의 팩토리얼(factorial)을 구하는 프로그램 구현 

음이 아닌 정수 n의 팩토리얼(n!)은 아래처럼 재귀적으로 정의 할 수 있음

> 1. 0 != 1
> 2. n > 0 ㅣ이면 n! = n * (n-1)!



```java
public class Factorial {

	public static int factorial(int n) {
		
		if(n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println(n+"! = "+ factorial(n));
	}
}
```



#### 유클리드 호제법

**유클리드 호제법** 또는 **유클리드 알고리즘**은 2개의 자연수의 최대공약수를 구하는 알고리즘의 하나이다. 호제법이란 말은 두 수가 서로 상대방 수를 나누어서 결국 원하는 수를 얻는 알고리즘을 나타낸다. 

ex )  78696과 19332의 최대공약수를 구하면,

![image-20200427154106670](https://user-images.githubusercontent.com/58761111/81143842-c70f3c00-8fad-11ea-8c36-7bb2e3e07040.png)

따라서, 최대공약수는 36이다.



- a과 b의 최대공약수 구하기

```java
public static int gcd(int a, int b) {
	if (a % b == 0)
		return b;
	return gcd(b, a % b);
}
```





> "자료구조와 함께 배우는 알고리즘 입문-자바편(Bohyoh Shibata 지음, 강민 옮김)" 참고
>
> https://ko.wikipedia.org/wiki 참고