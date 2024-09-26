import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new LinkedHashSet();
		
		for(int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		List<String> arr = new ArrayList<>(set);
		
		Collections.sort(arr, (o1, o2) -> {
			if(o1.length() != o2.length()) {
				return o1.length() - o2.length();
				
			} else {
		        // 길이가 같으면 알파벳 순으로 정렬
		        return o1.compareTo(o2);
		    }
		});

		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}