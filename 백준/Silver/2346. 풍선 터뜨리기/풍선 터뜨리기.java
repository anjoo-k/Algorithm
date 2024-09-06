import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		Deque<int[]> dq = new ArrayDeque();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i < n; i++) { // 처음 풍선은 안넣음
			dq.add(new int[] {(i + 1) , arr[i]});
		}
		
		
		int move = arr[0];
		sb.append("1").append(" ");
		while(!dq.isEmpty()) {
			
			if(move > 0) {
				
				for(int i = 1; i < move; i++) {
					dq.add(dq.poll());
				}
				
				int[] next = dq.poll();
				move = next[1];
				sb.append(next[0] + " ");
				
			} else {
				
				for(int i = 1; i < -move; i++) {
					dq.addFirst(dq.pollLast());
				}
				
				int[] next = dq.pollLast();
				move = next[1];
				sb.append(next[0] + " ");
			}

		}
		
		bw.write(sb.toString());
		bw.close();
		br.close();		

	}
}