package day1.array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] arr = new int[] {100,200,300,400,500};	//1차원 배열 생성
		System.out.println(arr[2]);						//300 출력
		arr[3] = 999;									//3번 인덱스의 값을 999로 변환
		System.out.println(Arrays.toString(arr));		//변환된 배열 출력
		Arrays.sort(arr);								//배열을 오름차순 정렬
		System.out.println(Arrays.toString(arr));		//변환된 배열 출력	
		
		
		int[][] arr2 = new int[][] {
									{1,2,3},
									{4,5,6},
									{7,8,9}
									};					//2차원 배열 생성
		
		System.out.println(Arrays.deepToString(arr2));  //2차원 배열 출력
		arr2[1][1] = 999;								//2행2열의 값을 999로 변환
		System.out.println(Arrays.deepToString(arr2));	//2차원 배열 출력
	}

}
