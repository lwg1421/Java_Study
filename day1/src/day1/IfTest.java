package day1;

public class IfTest {

	public static void main(String[] args) {
		
		//조건문
		int score = 77;
		
		// if문 첫번째
		if (score > 70) {
			//조건이 만족할 때 수행할 코드
			System.out.println("합격");
		} 
		
		// if문 두번째
		if (score > 70) {
			// 조건을 만족할 때 수행할 코드
			System.out.println("합격");
		} else {
			// 조건을 만족하지 않을 경우 수행할 코드
			System.out.println("불합격");
		}
		
		// if문 세번째
		if (score > 90) {
			System.out.println("A학점");
		} else if (score >80) {
			System.out.println("B학점");
		} else if (score > 70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}
		
		// switch문
		switch(score/10) {
		case 10 :
			System.out.println("A학점입니다.");
			break;
		case 9 :
			System.out.println("A학점입니다.");
			break;
		case 8 :
			System.out.println("B학점입니다.");
			break;
		case 7 :
			System.out.println("C학점입니다.");
			break;
		// 위에 해당하는 조건이 하나도 없을 경우 default에 지정한 코드 실행
		default : 
			System.out.println("F학점입니다.");
			break;
		}
	}
}
