package day6.greedy;

import java.util.Scanner;

public class BOJ2839_설탕배달_이원근 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean b = true;
		//5의 배수인 경우 바로 출력
		if (N % 5 == 0) {
			System.out.println(N/5);
			b = false;
		}
	
		if (b) {
			int count = 0;
			//5의 배수가 될 때 까지 3을 빼줌
			while (N%5 != 0) {
				if (N >= 3) {
					N -= 3;
					count++;
					if (N == 0) break;
				} else break;
			
			}
			
			if (N%5 == 0) {
				count += N/5;
				System.out.println(count);
			} else {
				System.out.println(-1);
			}
		}
		
		
		
		
	}

}
