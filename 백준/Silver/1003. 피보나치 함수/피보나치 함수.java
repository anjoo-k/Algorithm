import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		
		int[] zero = new int[41];
		int[] one = new int[41];
		zero[0] = 1; one[0] = 0;
		zero[1] = 0; one[1] = 1;
		
		// zero[0] = 1, one[0] = 0 피보나치 수열에 0 넣었을 때
		// zero[1] = 0, one[1] = 1 피보나치 수열에 1 넣었을 때
		// zero[2] -> zero[1] + zero[0] 피보나치 수열에 2 넣었을 때
		
		for(int i = 2; i <= 40; i++) {
			zero[i] = zero[i - 1] + zero[i - 2];
			one[i] = one[i - 1] + one[i - 2];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(zero[n]).append(" ").append(one[n]).append("\n");
		}
		

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}