import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		// 3kg, 5kg
		
		// 3 * x + 5 * y 일 경우에만 가능 
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i <= (n / 5); i++) {
			for(int j = 0; j <= (n / 3); j++) {
				if(n == ((5 * i) + (3 * j))) {
					min = Math.min(min, (i + j));						
				}
			}
		}
		
		if(min == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(min);
		}
	}
}