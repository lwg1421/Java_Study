import java.util.Scanner;

public class JO588 {

	static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		down();
		
	}
	
	private static void down() {
		if (N>0) {
			System.out.println(N);
			N--;
			down();
		}
		
	}

}
