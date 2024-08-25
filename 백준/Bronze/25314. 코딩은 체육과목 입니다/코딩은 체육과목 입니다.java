import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < (t/4); i++) {
			st = new StringTokenizer("long");
			bw.write(st.nextToken() + " ");
		}
		
		bw.write("int");
		bw.flush();		
		br.close();
		bw.close();
	}

}
