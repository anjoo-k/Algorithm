import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
	
		Deque d = new LinkedList();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()){
			
				case "1":
					d.addFirst(st.nextToken());
					break;
					
				case "2":
					d.addLast(st.nextToken());
					break;					
					
				case "3":
					if(!d.isEmpty()) {
						sb.append(d.removeFirst()).append("\n");
					} else {
						sb.append(-1).append("\n");
					}
					break;
					
				case "4":
					if(!d.isEmpty()) {
						sb.append(d.removeLast()).append("\n");
					} else {
						sb.append(-1).append("\n");
					}
					break;
					
				case "5":
					sb.append(d.size()).append("\n");
					break;
					
				case "6":
					if(d.isEmpty()) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
					break;
					
				case "7":
					if(!d.isEmpty()) {
						sb.append(d.getFirst()).append("\n");
					} else {
						sb.append(-1).append("\n");
					}
					break;
					
				case "8":
					if(!d.isEmpty()) {
						sb.append(d.getLast()).append("\n");
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