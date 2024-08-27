import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		
		String a = st.nextToken();
		String b = st.nextToken();
		char[] ca = new char[3];
		char[] ba = new char[3];
		
		for(int i = 0; i < 3; i++) {
			ca[i] = a.charAt(2 - i);
			ba[i] = b.charAt(2 - i);
	
		}
		
		a = "";
		b = "";
		
		for(int i = 0; i < 3; i++) {
			a += ca[i];
			b += ba[i];
		}
		
		
		bw.write((Integer.parseInt(a) > Integer.parseInt(b)) ? a : b);
		
		bw.flush();
		br.close();
		bw.close();
		
	}
}