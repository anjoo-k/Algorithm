import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nNumbers = new int [10];
		int[] remainders = new int [10];
		
		
		
		for(int i = 0; i < 10; i++) {
			nNumbers[i] = sc.nextInt();
			remainders[i] = nNumbers[i] % 42;
		}
		
		int count = 0;
		
		for(int i = 0; i < nNumbers.length; i++) {
			boolean compare = true;
			for(int j = 0; j < i; j++) { // 자기 자신과의 비교
				if(remainders[i] == remainders[j]) {
					compare = false;
					break;
				}
			}
			
			if(compare) count++;
		}
		System.out.println(count);		
	}
}