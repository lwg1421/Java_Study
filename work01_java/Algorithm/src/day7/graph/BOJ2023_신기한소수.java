package day7.graph;

import java.util.Scanner;

public class BOJ2023_신기한소수 {
	
	static StringBuilder sb = new StringBuilder();
	static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // N자리 신기한 소수 1 ~ 8
		searchPrime("", 0); // 초기 숫자, 자리수
		System.out.println(sb.toString());
	}
	
	private static void searchPrime(String num, int length) {
		if (length == N) {
			sb.append(num + "\n");
			return;
		}
		for (int i = 1; i <= 9; i++) {
			String newNum = num + i;
			if (isPrime(Integer.parseInt(newNum))) searchPrime(newNum, length+1);
		}
	}
	
	private static boolean isPrime(int num) {
		if (num == 1) return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}

}
