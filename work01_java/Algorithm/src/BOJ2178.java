
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178 {
    
    static int row, col;
    static int[][] board;
    static boolean[][] visited;
    // 상하좌우 탐색을 위한 방향 배열
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        board = new int[row][col];
        visited = new boolean[row][col];
        
        for (int i = 0; i < row; i++) {
            String line = br.readLine();
            for (int j = 0; j < col; j++) {
                board[i][j] = line.charAt(j) - '0';
            }
        }
        
        BFS();
        
        // 탐색 후 board 출력
//        for (int[] line : board) System.out.println(Arrays.toString(line));
        
        System.out.println(board[row-1][col-1]);
    }
    
    private static void BFS() {
        Queue<int[]> queue = new LinkedList();
        
        // 시작 좌표 : {0, 0}
        queue.offer(new int[] {0,0});
        visited[0][0] = true;
        
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
                    board[nextRow][nextCol] = board[currRow][currCol] + 1; // 직전 이동거리 + 1
                    queue.offer(new int[] {nextRow, nextCol}); // 다음 좌표 En-queue
                }
            }
        }
        
    }

}
/*
4 6
101111
101010
101011
111011
*/