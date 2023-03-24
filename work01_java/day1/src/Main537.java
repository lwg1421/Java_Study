import java.util.Scanner;

public class Main537 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int startNum = 1;
		int sum = 0;
		while (startNum<num+1) {
			sum +=startNum;
			startNum++;
		}
		System.out.println(sum);

	}

}
