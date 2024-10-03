import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int n;
	static int min = Integer.MAX_VALUE;
	static int[][] s;
	static boolean[] visit; // 불린 만들 생각을 못함
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		s = new int[n][n];
		visit = new boolean[n];
		
		for(int i = 0; i < s.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < s.length; j++) {
				s[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		capa(0, 0);
		
		System.out.println(min);
	}
	
	public static void capa(int index, int count) {
		
		if(count == n / 2) {
			
//			min = Math.max(min, (start - link)); 이걸 diff() 메소드로 구체적 구현
			
			diff();
			
			return;
		}
		
		for(int i = index; i < n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				capa(i + 1, count + 1);
				visit[i] = false;
			}
		}
	}
	
	public static void diff() {
		
		int start = 0;
		int link = 0;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(visit[i] == true && visit[j] == true) {
					start += s[i][j];
					start += s[j][i];
				} else if(visit[i] == false && visit[j] == false) {
					link += s[i][j];
					link += s[j][i];
				}
			}
		}
		
		int val = Math.abs(start - link);
		
		if(val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		
		min = Math.min(val, min);
	}
}