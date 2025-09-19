import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static private StringBuilder sb = new StringBuilder();
	static private int n;
	static private int[][] map;
	static private boolean[][] visited;
	static private int[] dy = {-1, 1, 0, 0};
	static private int[] dx = {0, 0, 1, -1}; 
	static private int count;
	
	public static void dfs(int y, int x) {
		visited[y][x] = true;
		count++;
		
		for(int i = 0; i < 4; i++) {
			// 변경된 상하좌우 좌표
			int ny = y + dy[i];
			int nx = x + dx[i];
			if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
			if(map[ny][nx] == 1 && !visited[ny][nx]) {
				dfs(ny, nx);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 지도 크기 입력
		
		map = new int[n][n];
		for(int i = 0; i < n; i++) {
			String line = br.readLine();
			String[] arr = line.split("");
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		visited = new boolean[n][n];		
		List<Integer> result = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					count = 0;
					dfs(i, j);
					result.add(count);
				}
			}
		}

		Collections.sort(result);
		sb.append(result.size()).append("\n");
		
		for(int a : result)
			sb.append(a).append("\n");
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}
}