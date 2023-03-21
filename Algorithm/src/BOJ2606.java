import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ2606 {

	static int N, M;	//컴퓨터의 수, 연결된 쌍의 수(입력받을 쌍의 수)
	static boolean[] visited;	//DFS에서 해당 노드를 방문했는지 확인
	static ArrayList<Integer>[] adjArr;	//각 노드별로 연결된 노드 정보를 담을 배열
	static int count;	//방문한 노드의 개수를 셀 것임
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		adjArr = new ArrayList[N+1];	//편의상 0번 노드도 담을 것이므로 사이즈 +1
		visited = new boolean[N+1];	//방문 했는지 안했는지 담음 0번 노드부터 담을 것이므로 사이즈 +1
		
		for (int i = 0; i < N+1; i++) {
			adjArr[i] = new ArrayList();
		}

		for (int i = 0; i < M; i++) {	//각 노드에 해당하는 인덱스에 연결된 노드 값 담기
			int startNode = sc.nextInt();
			int endNode = sc.nextInt();
			adjArr[startNode].add(endNode);
			adjArr[endNode].add(startNode);
		}
		
		// 인덱스별로 연결 노드 값이 잘 담겼는지 확인
//		System.out.println(Arrays.toString(adjArr));
		
		count = -1; //1번 노드는 count에서 제외해야 하므로 -1부터 시작
		
		
		System.out.println(DFS(1));
	}

	private static int DFS(int x) {
		visited[x] = true;	//방문한 노드에는 true 체크
		count++; 
		
		for(int node : adjArr[x]) { //방문한 노드별로 인접 노드 DFS 재귀 탐색
			if(!visited[node]) {	//인접 노드가 방문한 노드가 아니라면
				DFS(node);
			}
		}
		return count;
	}
}
