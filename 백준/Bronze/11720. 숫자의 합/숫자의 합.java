import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
		int[] num = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
			sum += num[i];
		}
		
		System.out.println(sum);
	}
}