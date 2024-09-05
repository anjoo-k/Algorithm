import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		char[] ch = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		
		int lo = 0;
		int hi = str.length() - 1;
		while(lo < hi) {
			if(ch[lo] == ch[hi]) {
				lo = lo + 1;
				hi = hi - 1;
			} else {
				System.out.println(0);
				return;
			}
		}
		
		System.out.println(1);
	}
}