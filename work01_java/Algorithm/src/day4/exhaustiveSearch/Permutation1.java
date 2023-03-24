package day4.exhaustiveSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation1 {
	
	static int N, R, totalCnt;
	static int[] numbers; // 선택한 숫자를 담을 배열
	static boolean[] isSelected; // 카드 선택 여부를 관리하는 배열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 4
		R = sc.nextInt(); // 3
		numbers = new int[R];
		isSelected = new boolean[N + 1]; // [__ , false, false, false, false] 0번 인덱스는 사용 X
		
		permutation(0);
		
		System.out.println(N + "P" + R + " = " + totalCnt);
	}

	private static void permutation(int cnt) { // cnt : 현재 뽑아야 하는 카드 위치
		if (cnt == R) { // 기저 조건
			totalCnt++;
			System.out.println(Arrays.toString(numbers)); // 선택한 카드
			System.out.println(Arrays.toString(isSelected));
			return;
		}
		
		for (int card = 1; card <= N; card++) {
			if (isSelected[card]) continue;
			numbers[cnt] = card; // cnt번째 카드는 card 숫자 선택
			isSelected[card] = true;
			permutation(cnt + 1);
			isSelected[card] = false;
		}
	}
}
