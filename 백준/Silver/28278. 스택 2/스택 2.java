import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		Stack stack = new Stack();
		
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(Integer.parseInt(st.nextToken())) {
			
			case 1:
				stack.push(Integer.parseInt(st.nextToken()));
				break;
				
			case 2:
				if(!stack.isEmpty()) {
					sb.append(stack.pop()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
				break;
				
			case 3:
				sb.append(stack.size()).append("\n");
				break;
				
			case 4:
				if(stack.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
				
			case 5:
				if(!stack.isEmpty()) {
					sb.append(stack.peek()).append("\n");
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