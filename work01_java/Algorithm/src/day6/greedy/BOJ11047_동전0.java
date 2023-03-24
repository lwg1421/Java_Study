package day6.greedy;

import java.util.Scanner;

public class BOJ11047_동전0 {

	static int[] coinCategory;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//입력받을 동전의 종류 개수
		int K = sc.nextInt();	//동전을 조합하여 만들 금액
		
		coinCategory = new int[N];
		
		for (int i = 0; i < N; i++) {	//동전 종류 입력 받기
			coinCategory[i] = sc.nextInt();
		}
		
		int count = 0;	// 사용한 동전의 수
		for (int i = coinCategory.length-1; i >= 0 ; i--) {
			int useCoin = K/coinCategory[i];
			count += useCoin;
			K -= coinCategory[i]*useCoin;
		}
		
		System.out.println(count);
	}

}
