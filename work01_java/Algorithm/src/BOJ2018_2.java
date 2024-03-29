import java.util.Arrays;
import java.util.Scanner;

public class BOJ2018_2 {

	static int N;
	static int[] sumArr;
	static int sum = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	//자연수
		
		sumArr = new int[N+1];	//0부터 시작하므로 사이즈는 하나 더 큼
		
		//합배열 만들기
		for (int i = 1; i <= N; i++) {
			sumArr[i] = sumArr[i-1]+i;
		}
		
		
		int count = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				sum = sumArr[j]-sumArr[i-1];
				if(sum == N) {
					count++;
				} else if (sum > N) {
					break;
				} else {
					continue;
				}
			}
		}
		
		System.out.println(count);
	}

}
