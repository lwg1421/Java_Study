package day3.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2751_수정렬하기3 {

	static int[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList();
		int N = sc.nextInt();	//입력받을 값의 개수
		
		for (int i = 0; i < N; i++) {
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr);
		
		System.out.println(arr);

		
	}

}
