import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	static int[] arr;
	static boolean[] checked;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		checked = new boolean[n];
		
		dfs(n, m, 0);
		
		bw.write(sb.toString());
		bw.close();
		br.close();
		
		
	}
	
	public static void dfs(int n, int m, int depth) {

		if (depth == m) {
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}

		for(int i = 0; i < n; i++) {
			if (!checked[i]) {
				arr[depth] = i + 1;
				dfs(n, m, depth + 1);
			}
		}
	}
}