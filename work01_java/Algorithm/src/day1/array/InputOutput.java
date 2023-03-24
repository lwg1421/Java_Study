package day1.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class InputOutput {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(		//한 줄씩 입력받음
				new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		for (int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(N);
		System.out.println(M);
		System.out.println(Arrays.toString(arr));
		
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 5; i++) {
			sb.append(i+ " ");
			System.out.println(sb.toString());
		}
	}

}
