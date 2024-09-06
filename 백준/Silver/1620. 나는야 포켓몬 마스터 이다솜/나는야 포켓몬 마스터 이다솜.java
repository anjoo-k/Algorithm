import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashMap<String, String> map1 = new HashMap();
		HashMap<String, String> map2 = new HashMap();
		for(int i = 1; i <= n; i++) {
			String name = br.readLine();
			map1.put(name, String.valueOf(i));
			map2.put(String.valueOf(i), name);
		}
		
		for(int i = 0; i < m; i++) {
			String pick = br.readLine();
			
			if(map1.containsKey(pick)) {
				sb.append(map1.get(pick)).append("\n");
				
			} else if(map2.containsKey(pick)) {
				sb.append(map2.get(pick)).append("\n");
				
			}
		}
		
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}