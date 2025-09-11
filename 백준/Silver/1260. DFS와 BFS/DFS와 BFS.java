import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	// 인접 리스트 만들기 : dfs를 위한 이차 리스트 제작
	static List<List<Integer>> list = new ArrayList<>();
	// 방문 여부 판단
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();

	public static void dfs(int v) {
		visited[v] = true;
		sb.append(v).append(" ");
		
		for(int next : list.get(v)) {
			if(!visited[next])
				dfs(next);
		}
	}
	
	public static void bfs(int v) {
		Queue<Integer> que = new LinkedList<>();
		visited[v] = true;
		que.add(v);
		
		while(!que.isEmpty()) {
			int currnetNode = que.poll();
			sb.append(currnetNode).append(" ");
			
			for(int next : list.get(currnetNode)) {
				if(!visited[next]) {
					visited[next] = true;
					que.add(next);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		// 인접리스트 초기화(0은 없음)
		for (int i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
		}

		// 간선 입력(간선 수만큼)
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			// 무방향 그래프이므로 양쪽으로 추가
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		// 정점이 작은 순서대로 방문 위한 오름차순 정렬
		for(int i = 0; i <= n; i++) {
			Collections.sort(list.get(i));
		}
		
		visited = new boolean[n + 1];
		dfs(v);
		sb.append("\n");
		
		visited = new boolean[n + 1];
		bfs(v);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}
}