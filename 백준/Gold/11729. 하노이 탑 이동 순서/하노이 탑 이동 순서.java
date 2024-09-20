import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		sb.append((int) (Math.pow(2, n) - 1)).append('\n');
		
		plate(n, 1, 2, 3);
		System.out.println(sb);
		
	}
	
	public static void plate(int n, int start, int mid, int to) {
		
		if (n == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		
		plate(n - 1, start, to, mid);
		sb.append(start + " " + to + "\n");
		plate(n - 1, mid, start, to);
	}
	
	
	// 원판이 1개면 1번
	// 원판이 2개면 3번
	// 원판이 3개면 7번
	// 원판이 4개면 15번? 
}