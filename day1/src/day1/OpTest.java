package day1;

public class OpTest {

	public static void main(String[] args) {
		// 연산자
		int a = 100;
		int b = 3;
		
		// 산술연산자
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // 정수형 나누기 정수형을 하면 자바는 정수형만 뱉음. //33을 뱉음
		System.out.println(a%b); // 나머지 연산자
		System.out.println(a++); // 후위형 연산자 //해당 라인에서 우선순위가 꼴찌 //값100 그대로 출력
		System.out.println(a);	 // a값에 1이 추가되어있음.
		System.out.println(++b); // 전위형 연산자 //해당 라인에서 우선순위가 일등 //3+1인 4를 출력
		
		// 비교연산자
		System.out.println(a > b); // true
		System.out.println(a < b); // false
		
		// 논리연산자
		System.out.println(a>b && --a>100);  // &&는 '그리고'의 의미 // 앞 조건이 false이면 뒤의 조건은 보지 않음.
		System.out.println(a>b || a>100);   // ||는 '또는'의 의미 // 앞 조건이 true이면 뒤의 조건은 보지 않음
	}
}
