package com.kb.arr;

import java.lang.reflect.Array;


public class Test2 {

	public static void main(String[] args) {
		int[] su = {200,23,15,45,53,32,12,65,72,13,10};
		
		// 전체 데이터 읽기
		/*
		 * for(int data : su) { System.out.println(data); }
		 */
		
		// 총점 구하기
		System.out.println("총점 : " + total(su));
		// 평균 구하기
		System.out.println("평균 : " + avg(su));
		// 최댓값 구하기
		System.out.println("최대값 : " + max(su));
		// 편차가 가장 큰 값의 위치와 값 구하기
		std(su);

	}
	
	// 총점을 구하는 메서드
	public static int total(int[] arr) {
		int total = 0;
		for (int data : arr) {
			total+=data;
		}
		return total;
	}
	
	// 평균을 구하는 메서드
	public static double avg(int[] arr) {
		int sum = total(arr);
		int len = Array.getLength(arr) ;
		return sum/len;
	}
	
	// 최댓값을 구하는 메서드
	public static double max(int[] arr) {
		int maxValue = arr[0];
		for(int data : arr) {
			maxValue = maxValue > data ? maxValue:data;
		}
		return maxValue;
	}
	
	// 편차가 가장 큰 값의 위치와 값을 구하는 메서드
	public static void std(int[] arr) {
		int stdMaxValue = arr[0];
		int stdMaxIndex = 0;
		double meanValue = avg(arr);

		for (int i = 1; i< arr.length; i++) {
			if(Math.abs(stdMaxValue-meanValue) < Math.abs(arr[i]-meanValue)) {
				stdMaxValue = arr[i];
				stdMaxIndex = i;
			}
		}
		System.out.println("표준편차가 가장 큰 값은 : "+stdMaxValue);
		System.out.println("표준편차가 가장 큰 값의 위치는 : "+stdMaxIndex);
		
	}

}
