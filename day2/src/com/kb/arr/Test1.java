package com.kb.arr;

import java.lang.reflect.Array;

public class Test1 {

	public static void main(String[] args) {
		// 배열 선언
		int[] s;
		int a[];
		
		// 배열 생성
		s = new int[5];
		
		// 배열의 선언과 생성을 한번에 하기
		int[] b = new int[5];
		
		// 배열 값 할당
		s[0] = 11;
		s[1] = 22;
		
		// 배열 선언과 생성과 값 할당을 한번에 하기
		int c[] = {11,22,33,44,55};
		int d[] = new int[] {11,22,33,44,55};
		
		// 배열을 파라미터로 받는 메서드에 배열 값을 줄 때
		m(c);
		m(d);
		m(new int[] {11,22,33,44,55});
//		m({11,22,33,44,55);	// 에러 발생
		
		// 검색
		System.out.println(s[1]);
		System.out.println(c[0]);
		
		// 배열 전체 출력 : for-each 문 활용
		for (int cc : c) {
			System.out.print(cc+" ");
		}
	}
	
	public static void m(int[] s) {
		
	}

}
