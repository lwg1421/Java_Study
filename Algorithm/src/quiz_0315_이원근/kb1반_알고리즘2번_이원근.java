package quiz_0315_이원근;

import java.util.ArrayList;
import java.util.Scanner;

public class kb1반_알고리즘2번_이원근 {

	static int N, R, M, totalCnt;
	static int[] numbers, arr; // numbers : 선택한 숫자, arr : 사용자 입력 배열
	static ArrayList<Integer> combSumList = new ArrayList<>();	//각 조합의 합을 담을 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	//주어질 숫자 개수
		R = 3;	//뽑을 숫자 개수 : 3개로 고정
		M = sc.nextInt(); //유재석이 불러줄 숫자
		numbers = new int[R];	//조합을 담을 배열
		arr = new int[N];	//주어진 숫자를 담을 배열
		
		
		for (int i = 0; i < N; i++) {	//주어진 숫자를 배열에 담는다
			arr[i] = sc.nextInt();
		}
		
		combination(0, 0);
		
		combSumList.sort(null);	//조합의 합이 담긴 배열을 오름차순 정렬
		System.out.println(combSumList.get(combSumList.size()-1));	//오름차순 정렬된 조합의 합 배열의 가장 큰 값 출력
		
		
	}
	
	// cnt : cnt 번째 카드 뽑기
	// startIdx : arr에서 startIndex부터 카드 뽑기
	private static void combination(int cnt, int startIdx) {
		if (cnt == R) {
			totalCnt++;
			if (calSum(numbers) <= M) {	//조합의 합이 유재석이 불러준 숫자보다 작다면
				combSumList.add(calSum(numbers));	//조합의 합을 배열에 담음
			}
			
			return;
		}
		for (int i = startIdx; i < N; i++) {
			numbers[cnt] = arr[i]; // cnt번째 숫자를 arr 배열의 i번째 숫자로 지정
			
			combination(cnt + 1, i + 1);
		}
	}
	
	//각 조합의 합계를 구하는 메서드
	private static int calSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
