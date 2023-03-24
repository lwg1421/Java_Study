package day4.exhaustiveSearch;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_15650_My {

	static int N, M, totalCnt;
	static int[] numbers, arr; // numbers : 선택한 숫자, arr : 1~N까지의 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		numbers = new int[M];
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		combination(0, 0);
	}
	
	private static void combination(int cnt, int startIdx) {
		if (cnt == M) {
			totalCnt++;
			for (int i = 0; i < numbers.length; i++) {
				System.out.print(numbers[i] + " ");		
			}
			System.out.println();
			return;
		}
		for (int i = startIdx; i < N; i++) {
			numbers[cnt] = arr[i]; // cnt번째 숫자를 arr 배열의 i번째 숫자로 지정
			
			combination(cnt + 1, i + 1);
		}
	}

}
