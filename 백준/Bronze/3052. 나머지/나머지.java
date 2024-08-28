import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		Set set = new HashSet();
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a.length; i++) {
			int b = a[i] % 42;
			set.add(b);
		}
		
		System.out.println(set.size());
	}
}