package day4.exhaustiveSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Combination {

	static int N, R, totalCnt;
	static int[] numbers, arr; // numbers : 선택한 숫자, arr : 사용자 입력 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
		numbers = new int[R];
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		combination(0, 0);
	}
	
	// cnt : cnt 번째 카드 뽑기
	// startIdx : arr에서 startIndex부터 카드 뽑기
	private static void combination(int cnt, int startIdx) {
		if (cnt == R) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		for (int i = startIdx; i < N; i++) {
			numbers[cnt] = arr[i]; // cnt번째 숫자를 arr 배열의 i번째 숫자로 지정
			
			combination(cnt + 1, i + 1);
		}
	}

}
