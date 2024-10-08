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
		
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> list = new LinkedList();
		
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		int index = 1;
		while(list.size() > 1) {
			
			for(int i = 0; i < k - 1; i++) {
				list.add(list.remove());
			}
			
			sb.append(list.remove().toString() + ", ");
		}
		
		sb.append(list.remove());
		bw.write("<" + sb.toString() + ">");
		bw.flush();
		bw.close();
		br.close();

	}
}