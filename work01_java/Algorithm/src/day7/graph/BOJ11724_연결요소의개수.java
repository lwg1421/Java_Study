package day7.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ11724_연결요소의개수 {
	
	static int N, E, compCnt; // 정점, 간선 개수, 연결 요소의 개수
	static ArrayList<Integer>[] adjList; // 인접 리스트
	static boolean[] visited; // 정점 별 그룹 번호

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		adjList = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		// 인접 리스트 각 위치에 빈 리스트 추가
		for (int i = 1; i <= N; i++) {
			adjList[i] = new ArrayList();
		}
		
		// 인접 리스트에 노드 추가
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int to = Integer.parseInt(st.nextToken());
			int from = Integer.parseInt(st.nextToken());
			// Undirected Graph
			adjList[to].add(from);
			adjList[from].add(to);
		}
		
		// 정점을 순차적으로 탐색
		for (int start = 1; start <= N; start++) {
			if (!visited[start]) { // 방문 전
				compCnt++;
				// BFS
//				bfs(start);
				
				// DFS
				visited[start] = true;
				dfs(start);
			}
		}
		
//		System.out.println(Arrays.toString(group));
		
		System.out.println(compCnt);
	}
	
	private static void dfs(int currNode) {
		for (int next : adjList[currNode]) {
			if (!visited[next]) {
				visited[next] = true;
				dfs(next);
			}
		}
	}
	
	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList();
		
		// 시작 정점 : start
		visited[start] = true;
		queue.offer(start);
		
		while (!queue.isEmpty()) {
			// Dequeue
			int currNode = queue.poll();
			
			// Enqueue
			for (int next : adjList[currNode]) {
				if (!visited[next]) { // 방문 전
					visited[next] = true;
					queue.offer(next);
				}
			}
		}
		
	}

}
/*
6 5
1 2
2 5
5 1
3 4
4 6
 */