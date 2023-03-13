package day3.sort;

import java.util.Arrays;

public class MergeSort {
	static int[] arr = {5, 2, 8, 6, 4, 7, 3, 1};	//주어진 배열
	static int[] temp = new int[arr.length];	//임시 배열
	public static void main(String[] args) {
		mergeSort(0, arr.length-1);
        System.out.println(Arrays.toString(arr));
	}
	
	//left부터 right까지 정렬
	public static void mergeSort(int left, int right) {
		if(left >= right) return;	//left가 right보다 크거나 같으면 종료
		
		int center = (left + right)/2;
		
		//Divide : center를 기준으로 왼쪽, 오른쪽 배열 정렬
		mergeSort(left, center);
		mergeSort(center + 1, right);
		
		//Conquer : 왼쪽, 오른쪽 배열을 하나의 배열로 병합
		//임시 배열에 복사
		for (int i = left; i <= right; i++) {
			temp[i] = arr[i];
		}
		
		int currIdx = left;
		int leftIdx = left;
		int rightIdx = center+1;
		
		while(leftIdx <= center && rightIdx <= right) {
			if (temp[leftIdx] < temp[rightIdx]) {
				arr[currIdx++] = temp[leftIdx++];
			} else {
				arr[currIdx++] = temp[rightIdx++];
			}
		}
		
		while(leftIdx <= center) {
			arr[currIdx++] = temp[leftIdx++];
		}
		while(rightIdx <= right) {
			arr[currIdx++] = temp[rightIdx++];
		}
	}

}
