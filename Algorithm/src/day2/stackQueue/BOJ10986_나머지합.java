package day2.stackQueue;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10986_나머지합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] S = new long[N];
		long[] C = new long[M];
		S[0] = sc.nextInt();
		
		for (int i = 1; i < N; i++) {
			S[i] = S[i-1] + sc.nextInt();
		}
		
//		System.out.println(Arrays.toString(S));
		
		long count = 0;
		
		for (int i = 0; i < N; i++) {
			int r = (int) (S[i] % M);
			if (r == 0) count++;
			C[r]++;
		}
		
//		System.out.println(Arrays.toString(C));
//		System.out.println(count);
		
		for (int i = 0; i < M; i++) {
			if (C[i] > 1) count += (C[i] * (C[i]-1))/2;
		}
		System.out.println(count);

	}

}
