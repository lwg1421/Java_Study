package day1.array;

import java.util.Scanner;

public class BOJ2018_수들의합5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// 자연수 N을 입력받음
		// count = 0 초기화
		// 1부터 N까지 반복
		// 1부터 계속 더해봄
		// 합이 N이 되면 stop. count에 1을 더함.
		// 합이 N을 넘어가면 stop
		// 
		// 2부터 더해봄
		// 합이 N을 넘어가면 stop
		// .....
		
		
		int count = 0;	//성공횟수 초기화
		for (int i = 1; i<=N; i++) {
			int sum = 0; // 합계 초기화
			for (int j = 1; j <= i; j++) {
				sum +=j;
				if (sum == i) {
					count +=1;
					sum = 0;
					continue;
				}
				if (sum > i) {
					sum = 0;
					continue;
				}
			}
		}
		System.out.println(count);
		
//		int count = 0;	//성공횟수 초기화
//		int sum = 0; // 합계 초기화
//		for (int i = 1; i<=N/2+1; i++) {
//			
//			sum +=i;
//			if (sum == N) {
//				count +=1;
//				sum = 0;
//				continue;
//			}
//			if (sum > N) {
//				sum = 0;
//				continue;
//			}
//			System.out.println(i);
//			
//		}
//		System.out.println("횟수 : "+count);
		
	}

}
