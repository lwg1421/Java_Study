package quiz_0322_이원근;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class kb1반_알고리즘3번_이원근 {

	static int col, row;	// col: 열 개수	//row : 행 개수
	static int[][] board;	//좌석배치도
	static boolean[][] visited;	//방문여부
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		col = Integer.parseInt(st.nextToken());	//열
		row = Integer.parseInt(st.nextToken());	//행
		
		board = new int[row][col];
		visited = new boolean[row][col];
		
		for (int i = 0; i < row; i++) {
			String line = br.readLine();
			for (int j = 0; j < col; j++) {
				board[i][j] = line.charAt(j)-'0';
			}
		}
		
		
		//잘 입력 되었는지 확인
		for (int i = 0; i < row; i++) {	//-2 : 지나갈 수 있음	//72 : 돌멩이
			System.out.println(Arrays.toString(board[i]));
			
		}
		
	}

}
