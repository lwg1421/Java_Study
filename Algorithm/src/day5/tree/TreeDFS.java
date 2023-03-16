package day5.tree;

import java.util.Arrays;
import java.util.Scanner;

public class TreeDFS {

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
		
		System.out.println("트리 원소 확인");
		System.out.println(Arrays.toString(nodes));
		
		//탐색 시작
		System.out.println("전위 순회");
		DFSByPreOrder(1);	//루트 노드부터 탐색	//전위순회
		System.out.println("\n중위 순회");
		DFSByInOrder(1);	//루트 노드부터 탐색	//중위순회
		System.out.println("\n후위 순회");
		DFSByPostOrder(1);	//루트 노드부터 탐색	//후위ㅅㄴ회
	}
	
	//전위 순회 : 나 -> 왼 -> 오
	private static void DFSByPreOrder(int currIndex) {
		System.out.print(nodes[currIndex]);	//노드 방문
		
		//왼쪽 자식 노드 방문 : 방문할 노드 인덱스가 배열의 사이즈보다 크지 않을 때만 방문
		if (currIndex *2 <= lastIndex) DFSByPreOrder(currIndex *2);	//재귀호출 했으므로 왼쪽 노드의 끝까지 방문함
		
		//오른족 자식 노드 방문 : 방문할 노드 인덱스가 배열의 사이즈보다 크지 않을 때만 방문
		if (currIndex *2 + 1 <= lastIndex) DFSByPreOrder(currIndex *2 +1);	//왼쪽 노드 탐색이 끝나면 오른쪽 자식 노드도 탐색함
		
	}
	
	//중위 순회 : 왼 -> 나 -> 오
	private static void DFSByInOrder(int currIndex) { //
		//왼쪽 자식 노드 방문 : 방문할 노드 인덱스가 배열의 사이즈보다 크지 않을 때만 방문
		if (currIndex *2 <= lastIndex) DFSByInOrder(currIndex *2);	//재귀호출 했으므로 왼쪽 노드의 끝까지 방문함
		
		System.out.print(nodes[currIndex]);	//노드 방문
		
		//오른족 자식 노드 방문 : 방문할 노드 인덱스가 배열의 사이즈보다 크지 않을 때만 방문
		if (currIndex *2 + 1 <= lastIndex) DFSByInOrder(currIndex *2 +1);	//왼쪽 노드 탐색이 끝나면 오른쪽 자식 노드도 탐색함
		
	}
	
	//후위 순회 : 왼 -> 오 -> 나
	private static void DFSByPostOrder(int currIndex) { //
		//왼쪽 자식 노드 방문 : 방문할 노드 인덱스가 배열의 사이즈보다 크지 않을 때만 방문
		if (currIndex *2 <= lastIndex) DFSByPostOrder(currIndex *2);	//재귀호출 했으므로 왼쪽 노드의 끝까지 방문함
				
		//오른족 자식 노드 방문 : 방문할 노드 인덱스가 배열의 사이즈보다 크지 않을 때만 방문
		if (currIndex *2 + 1 <= lastIndex) DFSByPostOrder(currIndex *2 +1);	//왼쪽 노드 탐색이 끝나면 오른쪽 자식 노드도 탐색함
		
		System.out.print(nodes[currIndex]);	//노드 방문
	}
	
}
