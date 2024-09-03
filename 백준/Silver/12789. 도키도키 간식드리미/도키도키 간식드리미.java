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

		Stack<Integer> stack = new Stack();

		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int rightRow = 1;

		for (int i = 0; i < n; i++) {
			if (arr[i] == rightRow) { // arr에  5 4 1 3 2
				rightRow++;			  // 1 나오면 2 됌

				while (!stack.isEmpty() && stack.peek() == rightRow) {
					stack.pop();
					rightRow++;
					
				}
			} else {
				stack.push(arr[i]); // 5 4 담고 3 담고 ...
			}
		}

		if (stack.isEmpty()) {
			bw.write("Nice");
		} else {
			bw.write("Sad");
		}

		bw.flush();
        bw.close();
        br.close();

	}
}