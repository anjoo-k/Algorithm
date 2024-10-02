import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
			switch(st.nextToken()) {
			case "add":
				set.add(Integer.parseInt(st.nextToken()));
				break;
				
			case "remove":
				set.remove(Integer.parseInt(st.nextToken()));
				break;
				
			case "check":
				if(set.contains(Integer.parseInt(st.nextToken()))) {
					sb.append("1").append("\n");
				} else sb.append("0").append("\n");
				
				break;
				
			case "toggle":
				int a = Integer.parseInt(st.nextToken());
				if(set.contains(a)) {
					set.remove(a);
				}else {
					set.add(a);
				}
				break;
				
			case "all":
				set.clear();
				for(int j = 0; j < 20; j++) {
					set.add(j + 1);
				}
				break;
				
			case "empty":
				set.clear();
				break;
				
			}
		}
		
		System.out.println(sb.toString());
	}
}