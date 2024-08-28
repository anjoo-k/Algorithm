import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[43];
		for(int i = 0; i < 43; i++) {
			if(i < 10) {
				num[i] = sc.nextInt() % 42;
				sc.nextLine();
			} else {
				num[i] = -1;
			}
		}

		boolean[] remainder = new boolean[43];
		for(int i = 0; i < 43; i++) {

			remainder[num[i] + 1] = true;
		}
		
		int count = 0;
		for(int i = 0; i < 43; i++) {
			if(remainder[i]) {
				 count++;
			}
		}
		
		System.out.println(count - 1);
	}
}