package day1.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BOJ2559_수열 {

	static int[] arr;	//주어진 배열
	static int[] sumArr;	//주어진 배열의 누적합
	static int[] nSum;	//연속적인 n일간의 합
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//입력받을 온도의 수
		int K = sc.nextInt();	//계산할 연속된 날짜 수
		
		arr = new int[N];	
		sumArr = new int[N+1];	//누적합 배열 크기 지정

		nSum = new int[N-K];	//연속된 K일간의 온도 합을 담을 배열 크기 지정
		for (int i = 0; i < N; i++) {	//각 날짜별 온도 입력받기
			arr[i] = sc.nextInt();	
		}
		
		if(N == K) {
			int sum = 0;
			for (int temp : arr) {
				sum += temp;
			}
			System.out.println(sum);
		} else {
//		System.out.println("기본배열 : " +Arrays.toString(arr));
			
			int sum = 0;
			for (int i = 1; i <= N; i++) {
				sum += arr[i-1];
				sumArr[i] = sum;	//누적합 배열에 값 담기
			}
//		System.out.println("누적합 : " + Arrays.toString(sumArr));
//		System.out.println(Arrays.toString(nSum));
			int temp = 0;
			for (int i = K; i < N; i++) {
				temp = sumArr[i]-sumArr[i-K];
				nSum[i-K] = temp;
			}
//		System.out.println(Arrays.toString(nSum));
			
			Arrays.sort(nSum);
//		System.out.println(Arrays.toString(nSum));
			System.out.println(nSum[N-K-1]);
		}
		
		
		
		
	}

}
