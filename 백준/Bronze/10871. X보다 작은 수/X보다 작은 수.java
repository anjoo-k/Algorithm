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
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] n = new int[Integer.parseInt(st.nextToken())];
		int x = Integer.parseInt(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(st2.nextToken());
			
			if(n[i] < x) {
				
				bw.write(n[i] + " ");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}