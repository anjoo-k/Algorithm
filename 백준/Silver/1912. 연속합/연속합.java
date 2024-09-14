import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int max;
	static int[] arr;
	static Integer[] dp;		// 메모이제이션 할 dp

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		arr = new int[n];
		dp = new Integer[n];
		
		for(int i = 0; i < n; i++) {		
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
		max = arr[0];
		
		recur(n - 1);
		
		bw.write(String.valueOf(max));
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static int recur(int n) {
		
		if(dp[n] == null) {
			dp[n] = Math.max(recur(n - 1) + arr[n], arr[n]);
			
			max = Math.max(dp[n], max);
		}

		return dp[n];
	}
}