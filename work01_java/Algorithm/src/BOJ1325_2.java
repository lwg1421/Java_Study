import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ1325_2 {
	
	static int N,M;	//정점 개수, 간선 개수
	static boolean[] visited;	//DFS에서 각 노드별 방문 여부 확인을 위해 필요
	static ArrayList<Integer>[] adjList;	//각 노드별 인접 노드를 담을 배열
	static int linkedCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	//정점 개수
		M = sc.nextInt();	//간선 개수
		visited = new boolean[N+1];	//각 노드별 방문 여부 체크
		adjList = new ArrayList[N+1];
		
		for (int i = 1; i <= N ; i++) {
			adjList[i] = new ArrayList();
		}
		
		for (int i = 1; i <= M; i++) {	//간선 입력 받아서 각 노드별 인접리스트에 담기
			int from = sc.nextInt();
			int to = sc.nextInt();
			
			adjList[to].add(from);
		}
		
		//노드별 인접 노드 리스트가 잘 담겼는지 확인
//		System.out.println(Arrays.toString(adjList));
		int[][] count = new int[N+1][2];	//각 노드별로 몇 개의 노드와 연결이 되어 있는 지 담을 배열	
		
		for (int i = 1; i < N+1; i++) {		//노드 번호와 연결된 노드 개수를 담음
			count[i][0] = i;
			linkedCount = 0;
			count[i][1] = DFS(i);
		}
		
		System.out.println(Arrays.deepToString(count));
	}
	
	static int DFS(int x) {
		
		visited[x] = true;
		linkedCount++;
		
		
		for (int node : adjList[x]) {
			if (!visited[node]) {
				DFS(node);				
			}
		}
		return linkedCount;
		
		
	}

}
