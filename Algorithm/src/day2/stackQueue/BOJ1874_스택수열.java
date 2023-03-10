package day2.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class BOJ1874_스택수열 {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int num = 1;
        boolean possible = true; 
        
        for (int i = 1; i <= N; i++) {
            int check = Integer.parseInt(br.readLine());
            if (check < num && check != stack.peek()) { // 수열 생성 불가능
                possible = false;
                break;
            }
            while (num <= check) {
                stack.push(num++);
                sb.append("+\n");
            }
            stack.pop();
            sb.append("-\n");
        }
        
        if (possible) System.out.println(sb.toString());
        else System.out.println("NO");

    }

}
		
		
		
		
//		for (int j = 0; j<=n; j++) {
//			int su = arr[j];
//			do {
//				if(i < su) {
//					stack.push(i);
//					System.out.println("+");
//					i++;
//				} else if (i == su) {
//					stack.push(i);
//					System.out.println("+");
//					stack.pop();
//					System.out.println("-");
//					i++;
//					break;
//				} else if (i > su) {
//					while(i != su){
//						stack.pop();
//						System.out.println("-");
//						i++;
//					}
//					break;
//					
//				}
//			} while (!stack.isEmpty());
//		}
		
		
		
		

//	}
//
//}
