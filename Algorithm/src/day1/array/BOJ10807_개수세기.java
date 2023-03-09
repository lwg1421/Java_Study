package day1.array;

import java.util.Scanner;

public class BOJ10807_개수세기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		
		int sum = 0;
		for (int data : arr) {
			if (data == target) {
				sum+=1;
			}
		}
		System.out.println(sum);
	}

}
