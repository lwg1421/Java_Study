package day1;

public class DataTypeTest {

	public static void main(String[] args) {
		int i = 300;
		
		long a = 30L; //30l이라고 소문자로 long형 지정해줘도 됨 
		
		// 자동형변환 : 큰사이즈에다가 작은 사이즈를 넣을 때 자동형변환이 됨
		a = i;
		
		// 실수는 기본형이 double이므로 float의 경우 선언 시에 f 또는 F를 명시적으로 붙여줘야함.
		float b = 3.4f;
		
		b = i;
		
		double d = 3.4;
		// 명시적 형변환 : 작은사이즈에다가 큰사이즈를 넣을 때 명시적으로 형변환을 해줘야함.
		i = (int)d;
		
		System.out.println(a+" "+b+" "+i);

	}

}
