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
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			Stack<Character> stack = new Stack();
			
			st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			
			boolean isValid = true;
			
			for(int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				
				if(ch == '(') {
					stack.push(ch);
				} else if(ch == ')') {
					if(stack.isEmpty() || stack.peek() != '(') {
						//논리 OR (||) 연산자는 왼쪽 조건이 true이면 오른쪽을 평가하지 않음
						isValid = false;
						break;
					}
					stack.pop();
				}
			}
			
			if(!stack.isEmpty()) {
				isValid = false;
			}
			
			if(isValid) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}
		}
		
		bw.flush();
		br.close();
		bw.close();

	}
}