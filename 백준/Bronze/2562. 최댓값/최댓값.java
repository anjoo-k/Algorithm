import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc= new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = Integer.MIN_VALUE;
		int index = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i < 9; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println(max + "\n" + (index + 1));
	}
}