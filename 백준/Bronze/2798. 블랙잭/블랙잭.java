import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int result = 0;
		for(int i = n - 1; i >= 2; i--) {
			for(int j = i - 1; j >= 1; j--) {
				for(int z = j - 1; z >= 0; z--) {
					int a = arr[i] + arr[j] + arr[z];
					if(a <= m) {
						result = Math.max(result, a);
					}
				}
			}
		}

		System.out.println(result);
	
	}
}