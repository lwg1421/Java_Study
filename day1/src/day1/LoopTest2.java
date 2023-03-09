package day1;

public class LoopTest2 {

	public static void main(String[] args) {
		// 1부터 100까지 짝수의 합 구하기
		int sum = 0;
		for (int i =1; i<=100; i++) {
			if (i % 2 == 0) {
				sum+=i;
			} else {
				continue;
			}
		}
		System.out.println(sum);
		
		// 1부터 100까지 3의 배수의 합을 구하라. 단, 3의 배수가 5의 배수가 될 때 종료한다.
		int sum2 = 0;
		for(int i = 0; i<100; i=i+3) {

			if(i%5 ==0 && i!=0) {
				break;
			} else {
				sum2 += i;
			}
			
		}
		System.out.println(sum2);

		// 1부터 100까지 3의 배수의 합을 구하라. 
		// 단, 3의 배수가 5의 배수가 될 때는 합계에서 제외한다.
		int sum3 = 0;
		for(int i = 0; i<100; i=i+3) {

			if(i%5 ==0 && i!=0) {
				continue;
			} else {
				sum3 += i;
			}
			
		}
		System.out.println(sum3);
	}

}
