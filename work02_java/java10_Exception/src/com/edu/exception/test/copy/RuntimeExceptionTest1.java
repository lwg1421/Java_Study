package com.edu.exception.test.copy;

/*
 * 컴파일 O -> 예외 발생 시 컴파일은 되지만 컴파일러가 인식을 못함
 * 실행시 X -> 실행시 터짐
 * 
 * 명시적으로 예외를 처리(try~catch)할 필요가 없음
 * 코드를 수정하면 된다.
 */

public class RuntimeExceptionTest1 {

	public static void main(String[] args) {
		String[] str = {
			"Hello",
			"No, I mean it",
			"Nice to meet you",
		};
		int i = 0;
		while(i<=3) {
			try {
				System.out.println(str[i]);				
			} catch(ArrayIndexOutOfBoundsException e) {
				// 예외가 잡혔을 때 처리할 내용을 처리함
				System.out.println("Nice Catch~!");
			} catch(ArithmeticException e) {
				System.out.println("Nice Catch~!");
			}
			i++;
		}
		
		System.out.println("while looping end...");
	}

}
