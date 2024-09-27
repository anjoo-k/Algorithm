import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int[] arr;
	static int n;
	static int count = 0;

	public static void main(String[] args) throws IOException {
		//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		dfs(0);

		bw.write(String.valueOf(count));
		bw.close();
		br.close();
		
		
	}
	
	public static void dfs(int depth) {
		//
		if(depth == n) {
			count++;
			return;
		}
		
		for(int i = 0; i < n; i++) {
			arr[depth] = i;
			
			if(check(depth)) {
				dfs(depth + 1);
			}
		}
	}
	
	public static boolean check(int col) {
		//
		for(int i = 0; i < col; i++) {
			if(arr[col] == arr[i]) {
				return false;
				
			} else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		return true;		
	}
}