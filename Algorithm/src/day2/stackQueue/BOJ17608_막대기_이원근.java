package day2.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ17608_막대기_이원근 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	//막대기의 개수 N
		
		Stack<Integer> stack = new Stack();
		for (int i = 0; i < N; i++) {
			stack.push(Integer.parseInt(br.readLine()));	//스택에 N개의 값을 담음
		}
		
		int count = 1 ;
		int top = stack.pop();// 맨 오른쪽의 값 top
		
		while (!stack.isEmpty()) {
			int topLeft = stack.pop();
			if (topLeft > top) {
				top = topLeft;
				count ++;
			}
		}
		
		System.out.println(count);
	}

}
