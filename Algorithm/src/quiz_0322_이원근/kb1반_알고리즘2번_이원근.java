package quiz_0322_이원근;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//코로나 교육장
//일 수를 못 구하겠습니다...

public class kb1반_알고리즘2번_이원근 {
	
	static int col, row;	// col: 열 개수	//row : 행 개수
	static int[][] board;	//좌석배치도
	static boolean[][] visited;	//방문여부
	static int covidCol, covidRow;	//처음 코로나 학생좌표(열,행)
	static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int dayCount = 0;	//총 걸린 기간
    static int studentCnt = 0; //총 학생 수
    static int covidStdCnt = 0;	//코로나 최종 걸린 학생 수
    
    static int nextRow;
    static int nextCol;

	
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
		
		//처음 코로나가 걸린 학생의 좌표
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		covidCol = Integer.parseInt(st1.nextToken()); //열 
		covidRow = Integer.parseInt(st1.nextToken()); //행
		
		
		//총 학생 수 계산
		for (int i = 0; i < row; i++) {
//			System.out.println(Arrays.toString(board[i]));	
			for (int j = 0; j < col; j++) {
				if(board[i][j] == 1) {
					studentCnt++;
				}
			}
		}
		
		BFS();

//		System.out.println(board[row-1][col-1]);
		
		//최종 걸린 학생 수 세기
		for (int i = 0; i < visited.length; i++) {
//			System.out.println(Arrays.toString(visited[i]));
			for (int j = 0; j < col; j++) {
				if(visited[i][j] == true) {
					covidStdCnt++;
				}
			}
		}
		
		System.out.println(dayCount);
		System.out.println(studentCnt-covidStdCnt);
	}
	
	private static void BFS() {
        Queue<int[]> queue = new LinkedList();
        dayCount++;
        // 시작 학생 좌표 : {입력받은 행, 입력받은 열}
        queue.offer(new int[] {covidRow,covidCol});
        visited[covidRow][covidCol] = true;
        
        while (!queue.isEmpty()) {
            // De-queue
            int[] currLoc = queue.poll(); // {row, col} 형식
            int currRow = currLoc[0];
            int currCol = currLoc[1];
            
            
            // 상하좌우 좌표 En-queue
            for (int i = 0; i < 4; i++) {
                int nextRow = currRow + dy[i]; // 다음 행 (다음 y 좌표)
                int nextCol = currCol + dx[i]; // 다음 열 (다음 x 좌표)
                // 유효성 검사(다음 좌표가 범위 내에 있는지, 방문 전인지, 길인지)
                if (nextRow>=0 && nextRow<row && nextCol>=0 && nextCol<col && !visited[nextRow][nextCol] && board[nextRow][nextCol]==1) {
                    visited[nextRow][nextCol] = true;
//                    System.out.println("지나간 좌표 : " + nextRow + " " + nextCol);
                    board[nextRow][nextCol] = board[currRow][currCol] + 1; // 직전 이동거리 + 1
                    queue.offer(new int[] {nextRow, nextCol}); // 다음 좌표 En-queue
                }
            }
        }
//        System.out.println("지나간 좌표 : " + nextRow + " " + nextCol);
        
    }
}
