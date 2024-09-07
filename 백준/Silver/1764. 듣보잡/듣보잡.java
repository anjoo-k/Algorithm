import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		// a = 97
		
		HashSet<String> noHeard = new HashSet();
		ArrayList<String> result = new ArrayList();
	
		for(int i = 0; i < n; i++) { // 듣도 못한 사람
			noHeard.add(br.readLine());
		}
		
		for(int i = 0; i < m; i++) { // 듣도 보도 못한 사람
			String noSeen = br.readLine();
			if(noHeard.contains(noSeen)) {
				result.add(noSeen);
			}
		}
		
		Collections.sort(result);
		
		sb.append(result.size()).append("\n");
		
		for(String s : result) {
			sb.append(s).append("\n");
		}
		
		bw.write(sb.toString());
		bw.close();
		br.close();
		
	}
}