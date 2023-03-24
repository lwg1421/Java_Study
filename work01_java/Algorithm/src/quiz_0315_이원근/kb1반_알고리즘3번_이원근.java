package quiz_0315_이원근;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// 검은 바둑알 : 1
// 흰 바둑알 : 2
// 빈자리 : 0

public class kb1반_알고리즘3번_이원근 {

	static int[][] goTable = new int[19][19];	//바둑판 생성	
			
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 19; i++) {	//바둑알 값 입력 받기
			for (int j = 0; j < 19; j++) {
				goTable[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("바둑판 배열이라도 출력해보았습니다......ㅠㅠ");
		System.out.println(Arrays.deepToString(goTable));
		



	}

}
