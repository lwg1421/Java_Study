import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ11724 {

	static int N, M;
	static boolean[] visited;	//방문 여부를 확인할 배열
	static int[][] arr;	//입력 노드를 담을 배열
//	static int[][] adjArr;	
	static ArrayList<Integer>[] adjArr;	//각 노드별 인접 노드를 담을 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	//정점의 개수
		M = sc.nextInt();	//간선의 개수
		
		visited = new boolean[N+1];
		arr = new int[M][2];
		adjArr = new ArrayList[N+1];
		
		for (int i = 0; i < N+1; i++) {	//그래프의 각 노드에 담길 값도 ArrayList로 지정해줘야함
			adjArr[i] = new ArrayList();
		}
		
		for (int i = 0; i < M; i++) {	//노드 별 인접 노드 값 배열에 담기
			int firstNode = sc.nextInt();
			int secondNode = sc.nextInt();
			adjArr[firstNode].add(secondNode);
			adjArr[secondNode].add(firstNode);
			
		}
		
		//각 노드별 인접 노드 확인
//		System.out.println(Arrays.toString(adjArr));
		
		int count = 0;
		for (int i = 1; i < N+1; i++) {
			if(visited[i] == false) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
		
		
	}
	
	private static void DFS(int x) {
		visited[x] = true;	//방문한 노드는 true표시
//		System.out.print(x + "->");
		
		for(int node : adjArr[x]) {
			if(!visited[node]) {
				DFS(node);
			}
		}
	}

}
