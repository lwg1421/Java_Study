package day2.stackQueue;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();	//스택 생성
		
		stack.push(100);	//스택에 값 삽입
		stack.push(200);	//스택에 값 삽입
		stack.add(300);	//스택에 값 삽입
		stack.add(400);	//스택에 값 삽입
		stack.add(500);	//스택에 값 삽입
		System.out.println("스택 값 확인: "+stack.toString());	// 스택의 내용 출력
		
		int top = stack.pop();	// top 변수에 stack의 맨 위의 값을 저장함과 동시에 스택에서 맨 위의 값을 삭제
		System.out.println("top 변수 값 : "+top);	// top 출력
		System.out.println("스택 값 확인: "+stack.toString());	// 스택에 담긴 값들을 출력
		
		System.out.println("맨 위의 값 : "+stack.peek());
		
		System.out.println("스택 값 하나씩 삭제하며 출력");
		while(!stack.isEmpty()) {	//스택이 비어있지 않다면
			System.out.println(stack.pop());	//스택에 맨 위의 값을 하나씩 삭제하며 출력
		}
		
		
	}

}
