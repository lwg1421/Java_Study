package day3.sort;

import java.util.Arrays;
import java.util.Scanner;

//버블정렬
public class BubbleSort {
	
	static int[] arr;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		arr = new int[arrSize];

		for (int i = 0; i<arrSize; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		bubbleSort();
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

	
	private static void bubbleSort() {
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					swap(j,j+1);
				}
			}
		}
	}
	
	private static void swap(int i, int j) {	//i,j번째 인덱스의 값 교환
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
