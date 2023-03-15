package day4.exhaustiveSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2961 {
	/*
	 * 신맛은 곱 쓴맛은 합 
	 * 신맛과 쓴맛의 차이를 작게 재료는 적어도 하나
	 */
	static int N;
	static ArrayList<Integer> result = new ArrayList<>();
	static boolean[] isSelected;
	static int[][] taste;// N * (신맛, 쓴맛)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	//재료의 개수 N을 입력받음
		taste = new int[N][2];	//신맛과 쓴맛의 한 쌍을 담을 배열

		for (int i = 0; i < N; i++) {	//재료의 개수 N만큼 신맛과 쓴맛의 쌍을 입력받음
			taste[i][0] = sc.nextInt();
			taste[i][1] = sc.nextInt();
		}
		isSelected = new boolean[N];	//해당 쌍의 선택여부를 담을 배열
		subset(0);	//subset메서드의 인자값을 0으로 초기화
		System.out.println(Collections.min(result));	//result에 담긴 값의 최소값 출력
	}

	public static void subset(int cnt) {// cnt:몇번째 값 뽑고 있는지
		if (cnt == N) {
			int S = 1;	//신맛은 곱해야하므로 초기값 1 설정
			int B = 0;	//쓴맛은 더해야하므로 초기값 0 설정
			for (int i = 0; i < N; i++) {
				if (isSelected[i]) {
					S *= taste[i][0];
					B += taste[i][1];
				}
			}
			if(S!=1 && B!=0)	//result에 신맛과 쓴맛의 차이값을 추가
				result.add(Math.abs(S-B));
			return;
		}
		isSelected[cnt] = true; // cnt번째 값 뽑음
		subset(cnt + 1);

		isSelected[cnt] = false;
		subset(cnt + 1);
	}
}
