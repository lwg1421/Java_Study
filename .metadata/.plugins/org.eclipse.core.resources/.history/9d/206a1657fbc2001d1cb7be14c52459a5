package day1.array;

import java.util.Scanner;

public class BOJ11720_숫자의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//입력받을 숫자의 개수
		
		String inputData = sc.next();	//공백없이 입력받은 값
		
		char[] splitData = inputData.toCharArray();	//입력받은 값을 한글자씩 쪼개어 문자형 배열에 담아줌
		
		int sum = 0;	//합계 값 초기화
		for (int i = 0; i < splitData.length; i++) {	//for문을 돌며 char형 배열에 담긴 값들을 정수형으로 변환하며 합계를 구함
			sum += (splitData[i]-'0');
		}
		
		System.out.println(sum);	//결과값 출력하기
	
	}

}
