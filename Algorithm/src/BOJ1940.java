import java.util.Scanner;

public class BOJ1940 {

	static int N,M;	//재료의 개수 //만들어야하는 수
	static int[] arr;	//값을 담을 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	//재료의 개수
		M = sc.nextInt();	//만들어야 하는 수
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {	//배열에 값 담기
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		int count = 0;
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				sum = arr[i]+arr[j];
				if(sum==M) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
