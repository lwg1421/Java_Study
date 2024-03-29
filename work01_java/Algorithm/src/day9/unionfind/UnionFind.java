package day9.unionfind;

import java.util.Arrays;

//7개 노드를 만들 것이고 간편하게 하기 위해 0부터 만들 것임.
public class UnionFind {

	static int N = 7;
	static int[] parents = new int[N];
	
	//우선 자기 자신이 부모인 서로소 집합을 만듦(크기가 N)
	static void make() {
		for (int i = 0; i < N; i++) {
			parents[i] = i;
		}
	}
	
	//x노드의 대표 노드 반환
	static int find(int x) {
		if(parents[x] == x) return x;
		return parents[x] = find(parents[x]);	//부모노드가 자기 자신이 될 때 까지 x노드의 부모를 계속 찾는다.			
		
	}
	
	static void union(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);
		if (xRoot == yRoot) return;	//x와 y가 같은 집합에 속한다면 따로 union을 안해줘도 된다.
		else parents[yRoot] = xRoot;
	}
	
	// x와 y 노드가 같은 집합인지 확인
	static boolean isSame(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);
		if (xRoot == yRoot) return true;
		else return false;
	}
	
	
	
	public static void main(String[] args) {
		make();	//부모가 자기 자신인 배열을 만듦 => [0,1,2,3,4,5,6,7]
		
		// {0} U {1}
		union(0, 1);
		System.out.println(Arrays.toString(parents));
		
		// {0, 1} U {2}
		union(1, 2);
		System.out.println(Arrays.toString(parents));
		
		// 0 노드와 2버 노드가 같은 집합인지 확인
		System.out.println(isSame(0, 2));
	}

}
