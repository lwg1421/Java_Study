package com.kb.arr;

public class Test3 {

	public static void main(String[] args) {
		int[] a = {10,20,30};
		System.out.println(a[0]);	// 배열 출력
		System.out.println(a.length);	// 배열의 길이 구하기
		for (int data : a) {
			System.out.print(data);
		}
		System.out.println();	// 줄바꿈
		
		// 2차원 배열
		int[][] b = {
				{10,20,30},
				{11,22,33}
				};
		System.out.println(b[0][1]);
		System.out.println(b.length);
		System.out.println(b[0].length);
		
		
		// 배열의 모든 값 출력 방법 1 : for each문 이용
		for(int[] bb : b) {
			for (int bbb : bb) {
				System.out.print(bbb+ " ");
			}
			System.out.println();	// 줄바꿈
		}
		
		// 배열의 모든 값 출력 방법 1 : for 문 이용
		for (int r = 0; r<b.length;r++) {	// 행의 수만큼 반복
			for (int c = 0; c<b[r].length; c++) {	// 열의 수만큼 반복
				System.out.print(b[r][c]+ " ");	// 값을 하나씩 출력
			}
			System.out.println(); // 줄바꿈
		}
	}

}
