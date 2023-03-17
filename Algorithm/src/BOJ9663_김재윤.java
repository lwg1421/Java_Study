import java.util.Scanner;

public class BOJ9663_김재윤 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] temperatures = new int[n];

        for (int i = 0; i < n; i++) {
            temperatures[i] = sc.nextInt();
        }

        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            max_sum += temperatures[i];
        }

        int sum = max_sum;
        for (int i = k; i < n; i++) {
            sum += temperatures[i] - temperatures[i - k];
            if (sum > max_sum) {
                max_sum = sum;
            }
        }
        System.out.println(max_sum);
    }
}
