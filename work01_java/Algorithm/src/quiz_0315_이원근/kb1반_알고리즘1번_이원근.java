package quiz_0315_이원근;

import java.util.Scanner;

public class kb1반_알고리즘1번_이원근 {

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
			int maxIndex = i;	//i번째 값을 maxIndex로 둠
			for(int j = i+1; j<arr.length; j++) {	//i다음번쨰 값부터 끝까지 살핌
				if(arr[maxIndex] < arr[j]) {	//가장 작은값의 인덱스를 maxIndex에 담음
					maxIndex = j;
				}
			}
			swap(maxIndex, i);	//가장 큰 값의 위치를 i의 위치와 변경
		}
	}
	
	static void swap(int maxIndex, int changeIndex) {
		int num = arr[changeIndex];
		arr[changeIndex] = arr[maxIndex];
		arr[maxIndex] = num;
	}

}
