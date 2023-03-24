package quiz_0322_이원근;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//짱구 친구

public class kb1반_알고리즘1번_이원근 {
	
	static int N, M;	//N : 마을 사람 수	 //M : 관계의 수
	static boolean[] visited;	//DFS탐색 시 방문 여부를 확인하기 위한 배열
	static ArrayList<Integer>[] adjList;	//각 노드별 연결 노드를 담기 위한 배열
	static int count;	//친구 수를 세기 위한 변수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	//정점 개수
		M = sc.nextInt();	//간선 개수
		
		visited = new boolean[N+1];	//편의상 0번 노드를 만들기 위해 사이즈는 간선개수+1
		adjList = new ArrayList[N+1]; //편의상 0번 노드를 만들기 위해 사이즈는 간선개수+1
		
		for (int i = 0; i <= N; i++) {
			adjList[i] = new ArrayList();
		}
		
		//간선 입력 받기
		//입력 받으면서 asjList에 각 인덱스별 연결 노드를 담는다.
		for (int i = 0; i < M; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			adjList[from].add(to);	//무방향 간선이므로 각각 관계를 추가해줌
			adjList[to].add(from);	//무방향 간선이므로 각각 관계를 추가해줌
		}
		
		//각 노드별 인접 노드 리스트가 잘 담겼는지 확인
//		System.out.println(Arrays.toString(adjList));

		count = -1;	//철수는 사귄 친구에서 제외할 것이므로 -1부터 시작하도록.
		DFS(1);	//짱구친구 철수는 1번
		System.out.println(count);
		
	}
	
	static void DFS(int x) {
		visited[x] = true;	//방문한 노드에는 true 표시를 해둠
		count++;	//새로운 노드를 지날 때마다 사귄 친구수 +1
		
		for(int node : adjList[x]) {
			if(!visited[node])	{	//만약 방문하지 않은 노드라면 DFS 실시
				DFS(node);
			}
		}
		
	}

}
