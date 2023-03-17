import java.util.Scanner;

public class JO9101 {

	static int N;
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		recursive();
		
	}
	
	private static void recursive() {
		System.out.println("recursive");	
		count++;
		if(count<N) {
			recursive();
		}
	}

}
