package day5.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeBFS2 {

	static char[] nodes;	//노드를 담을 배열
	static int SIZE, lastIndex;	//배열의 크기 //배열의 마지막 인덱스
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SIZE = sc.nextInt(); //트리의 사이즈 입력
		lastIndex = SIZE;	//트리의 마지막 인덱스 값은 트리의 사이즈와 같음
		nodes = new char[SIZE+1];	//배열의 첫 칸은 비워둘 것이므로 한칸 더 생성
		
		for (int i = 0; i < SIZE; i++) {
			nodes[i+1] = (char)('A'+i);	//배열의 첫 칸은 비워둠
		}
		
		System.out.println(Arrays.toString(nodes));
		
		//탐색 시작
		BFS();
		
	}
	
	private static void BFS() {
		Queue<Integer> que = new LinkedList();
		
		// En-queue // 루트 노드 값의 인덱스 삽입
		que.offer(1);	//트리의 루트 노드 인덱스 값을 입력
		
		while(! que.isEmpty()) {
			//De-queue
			int currIndex = que.poll();
			System.out.println(nodes[currIndex]);
			
			//En-queue
			if(currIndex * 2 <= SIZE) que.offer(currIndex * 2);	//왼쪽 자식 노드
			if(currIndex * 2+1 <= SIZE) que.offer(currIndex * 2 + 1);// 오른쪽 자식 노드
			
		}
		
		

	}
}
