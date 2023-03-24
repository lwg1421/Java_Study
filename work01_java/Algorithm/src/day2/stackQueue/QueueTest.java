package day2.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer > que = new LinkedList();
		
		que.offer(100);
		que.offer(200);
		que.offer(300);
		que.offer(400);
		que.offer(500);
		System.out.println("큐에 담긴 값 출력 : " + que.toString());
		
		int front = que.poll();	//큐 맨 앞 값을 추출하며 삭제함과 동시에 front변수에 저장
		System.out.println("큐의 맨 앞 값 : "+front);
		
		System.out.println("큐의 맨 앞 값"+que.peek());	//큐의 맨 앞 값을 삭제하지 않고 조회만
		
		while(! que.isEmpty()) {	//큐가 비어있을 때 까지 반복
			System.out.println("큐 값 : " + que.poll());	// 큐의 값을 맨 앞부터 하나씩 삭제하며 추력
			System.out.println(que);
		}
		
		System.out.println(que);	//큐에 담긴 값들 출력
	}

}
