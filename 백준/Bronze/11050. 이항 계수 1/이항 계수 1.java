import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int tempN = 1;
		int tempK = 1;
		int nk = 1;


		for(int i = 1; i <= n; i++) {
			tempN *= i;
		}
		
		for(int i = 1; i <= k; i++) {
			tempK *= i;
		}
		
		for(int i = 1; i <= (n - k); i++) {
			nk *= i;
		}
		
		int result = tempN/(nk * tempK);

		System.out.println(result);

	}
}