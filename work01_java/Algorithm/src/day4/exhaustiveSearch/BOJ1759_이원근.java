package day4.exhaustiveSearch;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1759_이원근 {
	
	static int L, C;
	static char[] words, arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		L = sc.nextInt();
		C = sc.nextInt();
		words = new char[L];
		arr = new char[C];
		for (int i = 0; i < C; i++) {
			arr[i] = sc.next().charAt(0);
		}
		Arrays.sort(arr);
		combination(0, 0);
	}

	private static void combination(int cnt, int startIdx) {
		
		if (cnt == L) {
			int moeum = 0;
			int jaeum = 0;
			for (char ch : words) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					moeum++;
				else {
					jaeum++;
				}
			}
			if (moeum >= 1 && jaeum >= 2) {		
				for (int i = 0; i < words.length; i++) {				
					System.out.print(words[i]);
				}
				System.out.println();
			}
			return;
		}
		
		for (int i = startIdx; i < C; i++) {
			words[cnt] = arr[i];
			combination(cnt + 1, i + 1);
		}
	}
}
