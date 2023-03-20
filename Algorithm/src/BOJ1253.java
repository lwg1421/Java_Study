import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ1253 {

	static int N;	//입력 받을 수의 개수
	static int[] arr;	//수를 담을 배열
	static int start,end;	//첫 인덱스, 두번째 인덱스
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {	//배열에 값 담기
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);	//오름차순 정렬	
		
		int count = 0;	//좋은 수의 개수
		for (int i = 0; i < N; i++) {
			int find = arr[i];	//만들 값
			start = 0;
			end = N-1;
			while (start < end) {
				if(arr[start] + arr[end] == find) {	//찾는 값과 일치하면 다음 수로 넘어감
					if(start != i && end != i) {
						count++;
						break;						
					} else if (start == i) {
						start++;
					} else if (end == i) {
						end--;
					}
				} else if(arr[start] + arr[end] < find) {
					start++;
				} else if(arr[start] + arr[end] > find) {
					end--;
				}
			}
		}
		
		
		System.out.println(count);
		
	}

}
