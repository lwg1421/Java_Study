package day7.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ13023_ABCDE {
	
	static int N, E;
	static ArrayList<Integer>[] adjList;
	static boolean[] visited;
	static boolean result = false;
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		adjList = new ArrayList[N];
		
		for (int i = 0; i < N; i++) {
			adjList[i] = new ArrayList();
		}
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			adjList[from].add(to);
			adjList[to].add(from);
		}
		
		for (int start = 0; start < N; start++) {
			if (result) break;
			visited = new boolean[N];
			visited[start] = true;
			dfs(start, 1);
		}
		
		if (result) System.out.println(1);
		else System.out.println(0);

	}
	
	private static void dfs(int currNode, int depth) {
//		System.out.println("현재 노드 : " + currNode + ", 현재 깊이 : " + depth);
//		System.out.println(Arrays.toString(visited));
		if (result || depth == 5) {
			result = true;
			return;
		}
		
		for (int next : adjList[currNode]) {
			if (!visited[next]) {
				visited[next] = true;
				dfs(next, depth+1);
			}
		}
		visited[currNode] = false;
	}

}

/*
5 5
0 1
1 2
2 3
3 0
1 4
 */
