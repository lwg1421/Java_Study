package day3.sort;

import java.util.Scanner;

public class BOJ_2751_수정렬하기2 {

	static int[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//입력받을 값의 개수
		
		arr = new int[N];	//배열 크기 지정하여 선언
		
		for (int i = 0; i < N; i++) {	//배열에 값 담기
			arr[i] = sc.nextInt();
		}
		selectionSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;	//i번째 값을 minIndex로 둠
			for(int j = i+1; j<arr.length; j++) {	//i다음번쨰 값부터 끝까지 살핌
				if(arr[minIndex] > arr[j]) {	//가장 작은값의 인덱스를 minIndex에 담음
					minIndex = j;
				}
			}
			swap(minIndex, i);	//가장 작은 값의 위치를 i의 위치와 변경
		}
	}
	
	static void swap(int minIndex, int changeIndex) {
		int num = arr[changeIndex];
		arr[changeIndex] = arr[minIndex];
		arr[minIndex] = num;
	}

}
