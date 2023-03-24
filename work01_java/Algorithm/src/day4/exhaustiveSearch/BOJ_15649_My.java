package day4.exhaustiveSearch;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_15649_My {
	
	static int N, M, totalCnt;
	static int[] numbers;
	static boolean[] isSelected;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		numbers = new int[M];
		isSelected = new boolean[N + 1];
		
		permutation(0);
	}

	private static void permutation(int cnt) {
		if (cnt == M) {
			totalCnt++;
			for (int i = 0; i < numbers.length; i++) {
				
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int card = 1; card <= N; card++) {
			if (isSelected[card]) continue;
			numbers[cnt] = card;
			isSelected[card] = true;
			permutation(cnt + 1);
			isSelected[card] = false;
		}
	}
}
