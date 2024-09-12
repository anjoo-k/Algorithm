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
		
		int n = Integer.parseInt(br.readLine());
		
		int six = 666;
		int count = 1;
		
		while(count < n) {
			
			six++;
			
			if(String.valueOf(six).contains("666")) {
				count++;
			}
		}
		
		bw.write(String.valueOf(six));
		bw.flush();
		bw.close();
		br.close();
	}
}