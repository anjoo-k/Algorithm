import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		while (true) {

			Stack<Character> stack = new Stack();
			String str = br.readLine();

			if (str.equals(".")) {
				break;
			}

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (ch == '[' || ch == '(') {
					stack.push(ch);

				} else if (ch == ']') {
					if (stack.isEmpty() || stack.peek() != '[') {
						stack.push(ch);
					} else {
						stack.pop();
					}

				} else if (ch == ')') {
					if (stack.isEmpty() || stack.peek() != '(') {
						stack.push(ch);
					} else {
						stack.pop();
					}
				}
			}
			
			if (stack.isEmpty()) {
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}