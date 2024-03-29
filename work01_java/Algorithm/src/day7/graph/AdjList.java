package day7.graph;

//인접 리스트 탐색
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AdjList {

	static ArrayList<Integer>[] adjList;	//인접 리스트
	static int N, E;	//정점 개수, 간선 개수
	
	static boolean[] visited;	//방문 여부
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		E = sc.nextInt();
		adjList = new ArrayList[N];	//0번 노드부터 시작
		visited = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			adjList[i] = new ArrayList();
		}
		
		for (int i = 0; i < E; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			adjList[from].add(to);
//			adjList[to].add(from); //무방향 그래프
		}
		
		BFS(0);
		
		System.out.println();
		visited = new boolean[N];
		DFS(0);	//시작 정점 : 0
	}
	
	private static void BFS(int startNode) {	//너비 우선 탐색 메서드 //큐를 사용함	//재귀 사용 안함
		Queue<Integer> queue = new LinkedList();
		
		//시작 정점 En-queue : 0
		queue.offer(startNode);
		visited[startNode] = true;
		
		while (!queue.isEmpty()) {
			//De-queue
			int currNode = queue.poll();
			System.out.print(currNode);
			//En-queue
			for (int node : adjList[currNode]) {
				if(!visited[node]) {	//방문하지 않았을 때만 En-queue
					queue.offer(node);
					visited[node] = true;
				}
			}
		}
	}
	
	private static void DFS(int currNode) {	//깊이 우선 탐색	//재귀 함수를 호출함
		System.out.print(currNode);
		for (int node : adjList[currNode]) {
			if(!visited[node]) {
				visited[node] = true;
				DFS(node);
			}
		}
	}

}


/* 입력 데이터
7
8
0 1
0 2
1 3
1 4
3 5
4 5
5 6
2 6
*/