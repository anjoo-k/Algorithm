import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	int count = n;
    	
    	for(int i = 0; i < n; i++) {
    		Map<Character, Integer> map = new HashMap<>();
    		String str = br.readLine();
    		char[] ch = str.toCharArray();
    		for(int j = 1; j < ch.length; j++) {
    			map.put(ch[0], j);
    			if(map.get(ch[j]) == null || map.get(ch[j - 1]) == map.get(ch[j])) {
    				map.put(ch[j], j);
    			}else if(map.get(ch[j]) != null || map.get(ch[j - 1]) != map.get(ch[j])) {
    				count--;
    				break;
    			}
    		}
    	}
    	
    	System.out.println(count);
        br.close();
    }
}