package day7.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ9663_NQueen {

	static int N;	//체스판의 크기
	static boolean[][] chess; //체스판 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	//체스판 크기 입력
		chess = new boolean[N][N];	//체스판 생성	//기본값 false
		for (int i = 0; i < chess.length; i++) {
			Arrays.fill(chess[i], true);	//체스판 기본값 true로 설정
		}
		
		
		System.out.println(Arrays.deepToString(chess));

	}
	
	private static void change() {
		
	}

}
