import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int i, j, x = 0;
		int[] result = new int[n];
		
		for(int z = 0; z < n; z++) {
			result[z] = z + 1;
		}
		
		for(int a = 0; a < m; a++) {
			
			i = sc.nextInt() - 1;
			j = sc.nextInt() - 1;
			
			x = result[i];
			result[i] = result[j];
			result[j] = x;
		}
		
		for(int results : result) {
			System.out.print(results + " ");
		}
	}
}