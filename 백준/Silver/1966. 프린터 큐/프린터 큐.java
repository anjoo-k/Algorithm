import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine(), " ");
			LinkedList<int[]> list = new LinkedList();

			for (int j = 0; j < n; j++) {
				list.add(new int[] { j, Integer.parseInt(st.nextToken()) });
			}

			int count = 0;
			while (!list.isEmpty()) {
				int[] current = list.remove();
				boolean isMax = true;

				for (int[] doc : list) {
					if (doc[1] > current[1]) {
						isMax = false;
						break;
					}
				}

				if (isMax) {
					count++;
					if (current[0] == m) {
						sb.append(count).append("\n");
						break;
					}
				} else {
					list.add(current);
				}
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}
}