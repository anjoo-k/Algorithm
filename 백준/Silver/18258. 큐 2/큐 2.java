import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
	
		LinkedList q = new LinkedList();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()){
			
				case "push":
					q.add(st.nextToken());
					break;
					
				case "pop":
					if(!q.isEmpty()) {
						sb.append(q.poll()).append("\n");
					} else {
						sb.append(-1).append("\n");
					}
					break;
					
				case "size":
					sb.append(q.size()).append("\n");
					break;
					
				case "empty":
					if(q.isEmpty()) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
					break;
					
				case "front":
					if(!q.isEmpty()) {
						sb.append(q.peek()).append("\n");
					} else {
						sb.append(-1).append("\n");
					}
					break;
					
				case "back":
					if(!q.isEmpty()) {
						sb.append(q.getLast()).append("\n");
					} else {
						sb.append(-1).append("\n");
					}
					break;
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();

	}
}