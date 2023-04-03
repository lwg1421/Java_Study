import java.util.Arrays;
import java.util.Scanner;

public class BOJ20291 {

	public static void main(String[] args) {
		int N;	//파일 개수
		String[] fileArr;	//파일을 담을 배열
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		fileArr = new String[N];
		
		for (int i = 0; i < N; i++) {
			fileArr[i] = sc.next();
		}
		
		for(String fileName : fileArr) {
			String[] fileNameArr = fileName.split("\\.");
			System.out.println(Arrays.toString(fileNameArr));
 		}
		
		//잘 담겼는지 확인
//		System.out.println(Arrays.toString(fileArr));

	}

}
