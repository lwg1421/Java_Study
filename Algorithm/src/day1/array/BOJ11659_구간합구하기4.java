package day1.array;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ11659_구간합구하기4 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    
	    int[] accumArr = new int[N + 1];
	    
	    // 0번 인덱스부터 N번 인덱스 사용        
	    // 누적합 배열 생성
	    for (int i = 1; i <= N; i++) {
	        accumArr[i] = accumArr[i - 1] + sc.nextInt();
	    }
	    
	    // M번 반복으로 start ~ end 까지의 합
	    for (int i = 0; i < M; i++) {
	        int start = sc.nextInt();
	        int end = sc.nextInt();
	        
	        System.out.println(accumArr[end] - accumArr[start - 1]);
	    }
	}
}
