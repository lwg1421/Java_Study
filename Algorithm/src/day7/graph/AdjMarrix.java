package day7.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
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


public class AdjMarrix {
	static int[][] adjMatrix;	//행렬 생성
	static int N, E;	//정점의 수, 간선의 수
	static boolean[] isVisited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	//정점 수
		E = sc.nextInt();	//간선 수
		adjMatrix = new int[N][N];
		isVisited = new boolean[N];
		
		for (int i = 0; i < E; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			adjMatrix[from][to] = 1;	//방향 그래프
		}
		
		for (int j = 0; j < adjMatrix.length; j++) {
			System.out.println(Arrays.toString(adjMatrix[j]));
		}
		
		BFS(0);
		
		isVisited = new boolean[N];
		isVisited[0] = true;
		System.out.println();
		DFS(0);
		
	}
	
	private static void DFS(int curr) {
		System.out.print(curr);	//방문
		for (int i = 0; i < N; i++) {
			if(!isVisited[i] && adjMatrix[curr][i] != 0) {	//간선으로 연결이 되어있는지 확인
				isVisited[i] = true;
				DFS(i);
				
			}
		}
	}
	
	//내 주변 노드부터 찾아봄
	private static void BFS(int start) {
		Queue<Integer> queue = new LinkedList<>();
		
		//시작 노드 En-quque
		queue.offer(start);
		isVisited[start] = true;
		
		while(!queue.isEmpty()) {	//큐가 빌 때 까지 반복
			//De-queue
			int curr = queue.poll();
			System.out.print(curr);
			
			//En-queue : curr의 주변 정점 추가
			for (int i = 0; i < N; i++) {
				if (adjMatrix[curr][i] != 0 && !isVisited[i]) {
					isVisited[i] = true;
					queue.offer(i);
				}
			}
			
		}
	}

}