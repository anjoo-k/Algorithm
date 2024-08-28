import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 바구니갯수
		int m = sc.nextInt(); // 몇번 바꿀건가
		
		int[] arr = new int[n];
		for(int a = 0; a < n; a++) {
			arr[a] = a + 1;
		}
		
		int i, j;
		for(int a = 0; a < m; a++) {
			int z = 0;
			i = sc.nextInt();
			j = sc.nextInt();
			
			int q = i;
			int w = j;
			
			for(int b = 0; b < ((w - q) / 2 + 1); b++) {
				z = arr[i - 1];
				arr[i - 1] = arr[j - 1];
				arr[j - 1] = z;
				i++;
				j--;
			}
		}
		
		for(int a = 0; a < n; a++) {
			System.out.print(arr[a] + " ");
		}
			
	}
}