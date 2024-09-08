import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visit = new boolean[n];
		dfs(n, m, 0);
		
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
	
	public static void dfs(int n, int m, int depth) {
		if(depth == m) { // 재귀 깊이가 m과 같아지면 담아둔 배열 출력
			for(int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!visit[i]) { // 만약 해당 노드(값)을 방문 x(false라면)
				visit[i] = true; // 방문 o 로 변경 후
				arr[depth] = i + 1; // 배열에 (나중에 출력할) 값 저장
				dfs(n, m, depth + 1); // 다음 노드 방문 위해 재귀호출
				visit[i] = false;
			}
		}
	}
}