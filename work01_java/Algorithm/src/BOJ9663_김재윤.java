import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ9663_김재윤 {
	
	static int row, col;
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
				board[i][j] = line.charAt(j) - '0';
			}
		}
		
		for (int i = 0; i < row; i++) {
			System.out.println(Arrays.toString(board[i]));
			
		}
    	
    }
}
