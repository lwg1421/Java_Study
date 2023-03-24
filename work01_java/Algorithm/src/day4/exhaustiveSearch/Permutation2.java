package day4.exhaustiveSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation2 {
	
	static int N, R, totalCnt;
	static int[] numbers; // 선택한 숫자를 담을 배열
	static boolean[] isSelected; // 카드 선택 여부를 관리하는 배열
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
	
		numbers = new int[R];
		isSelected = new boolean[N]; // [false, false, false, false]
		
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		permutation(0);
		
		System.out.println(N + "P" + R + " = " + totalCnt);
	}

	private static void permutation(int cnt) { // cnt : 현재 뽑아야 하는 카드 위치
		if (cnt == R) { // 기저 조건
			totalCnt++;
			System.out.println(Arrays.toString(numbers)); // 선택한 카드
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (isSelected[i]) continue; // i번째 카드가 이미 선택된 경우
			int card = arr[i];
			
			numbers[cnt] = card; // cnt번째 카드는 card 숫자 선택
			isSelected[i] = true;
			permutation(cnt + 1); // 다음 카드 선택
			isSelected[i] = false;
		}
	}
}
