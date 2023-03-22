package day10.mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Edge {
	int from, to, weight;

	//생성자 생성
	public Edge(int from, int to, int weight) {
		super();
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
}

public class BOJ1197 {

	static int V,E;	//정점 개수, 간선 개수
	static Edge[] edgeList;	//간선리스트
	
	//유니온 파인드
	static int[] parents;
	
	//크기가 1인 서로소 집합
	static void make() {
		parents = new  int[V+1];
		for (int i = 1; i <= V; i++) {
			parents[i] = i;
		}
	}
	
	//대표 노드 반환
	static int find(int x) {
		if (parents[x] == x) return x;
		return parents[x] = find(parents[x]);
	}
 	
	// x U y
	static boolean union(int x, int y) {
		int xRoot = find(x);	//x의 대표 노드를 찾는다
		int yRoot = find(y);	//y의 대표 노드를 찾는다.
		if (xRoot == yRoot) {	//대표 노드가 같으면 같은 집합이라는 뜻임
			return false;		//union을 수행할 수 없으므로 false 반환
		}
		parents[yRoot] = xRoot;	//다른 집합이라면 union을 정상적으로 수행할 수 있으므로
		return true;			//true를 반환
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		edgeList = new Edge[E];
		
		for(int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to  = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			edgeList[i] = new Edge(from, to, weight);	//i번쨰 edgeList에 새로운 Edge클래스를 담는다.
		}
		
		//weight 기준으로 edgeList 정렬 (람다 함수 사용)
		Arrays.sort(edgeList,(e1, e2) -> e1.weight - e2.weight);
		
		make();
		
		int edgeCnt = 0;
		int totalWeight = 0;
		
		for(Edge e : edgeList) {
			if (union(e.from, e.to)) {
				edgeCnt++;
				totalWeight += e.weight;
				if(edgeCnt == V-1) break;
			}
		}
		System.out.println(totalWeight);
	}
	

}
