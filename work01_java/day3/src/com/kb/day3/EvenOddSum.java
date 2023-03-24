package com.kb.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) throws FileNotFoundException {
		// 입력
			// 1. 키보드
//			Scanner s = new Scanner(System.in);


//			
			// 2. 파일
			Scanner s = new Scanner(new File("data.txt"));  // 경로의 기준점은 프로젝트 폴더이다.
			int size = s.nextInt();
			int[][] su = new int[size][size];
			for (int r = 0; r<size; r++) {
				for (int c = 0; c<size; c++) {
					su[r][c] = s.nextInt();
				}
			}
			
			int total = 0;
		// 처리
			// 1. 이차원배열 완전 탐색
			for (int r = 0; r<size; r++) {
				for (int c = 0; c<size; c++) {
					// 2. 상하좌우의 합을 구한다.(경계를 넘으면 무시)
					int sum = 0;
					
					if( r-1 >=0 ) sum = sum+su[r-1][c];
					if( r+1 < size ) sum = sum+su[r+1][c];
					if( c-1 >=0 ) sum = sum+su[r][c-1];
					if( c+1 < size ) sum = sum+su[r][c+1];
					
					if( (sum) % 2 == 0 ) {
						total += su[r][c];
					}
				}
			}	
			System.out.println(total);
			// 3. 합이 짝수면 전체합에 더한다.
			
			
		// 출력 
			// 전체합 출력
			
	}

}
