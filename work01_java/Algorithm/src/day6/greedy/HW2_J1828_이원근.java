package day6.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HW2_J1828_이원근 {

	static int[][] arr;	//회의 시작, 종료시간을 담을 배열
	static int N;
	static ArrayList<int[]> result = new ArrayList<>();	//선택한 회의를 담을 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();	//회의의 수 N
		arr = new int[N][2];	//시작시간 배열 크기 지정
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();	//시작시간 배열에 값 담음
			arr[i][1] = sc.nextInt();	//종료시간 배열에 값 담음
		}
		
		//2차원 배열 시작시간 기준 오름차순 정렬 하기
		Arrays.sort(arr,(o1,o2) ->{
			return o1[0]-o2[0];
		});
		
		//2차원 배열 종료시간 기준 오름차순 정렬 하기
		Arrays.sort(arr,(o1,o2) ->{
			return o1[1]-o2[1];
		});
		
		System.out.println(Arrays.deepToString(arr));
		result.add(arr[0]);
		
		for (int i = 1; i < N; i++) {
			if(result.get(result.size()-1)[1] <= arr[i][0]) {
				result.add(arr[i]);
			}
		}
		
		System.out.println(result.size());
		
		
		
	}


}
