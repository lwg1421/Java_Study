package day5.tree;

//너비 우선 탐색
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeBFS {

	static char[] nodes;
	static int SIZE, lastIndex;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SIZE = sc.nextInt();	//트리의 사이즈를 입력받음
		lastIndex = SIZE;	//트리의 마지막 인덱스 값
		nodes = new char[SIZE+1];	//첫번쨰 값은 비워둠
		
		for (int i = 0; i < SIZE; i++) {
			nodes[i+1] = (char)('A'+i);
		}
		
		System.out.println(Arrays.toString(nodes));
		
		BFS();
	}
	
	private static void BFS() {
		Queue<Integer> que = new LinkedList<>();
		
		//시작 노드를 En-queue : 트리에서는 보통 루트 노드부터 탐색을 함
		que.offer(1);	//offer : 큐에 데이터 삽입
		
		while(! que.isEmpty()) {
			//De-queue (방문)
			int currIndex = que.poll();	//poll : 큐의 맨 앞 값 삭제하며 반환
			System.out.println(nodes[currIndex]);
			
			//En-queue
			if (currIndex*2 <= lastIndex) que.offer(currIndex * 2);	//마지막 인덱스보다 작다면 왼쪽 자식 노드 삽입
			if (currIndex*2+1 <= lastIndex) que.offer(currIndex * 2 + 1); //마지막 인덱스보다 작다면 오른쪽 자식 노드 삽입
		}
	}

}