import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		LinkedList list = new LinkedList();
		
		for(int i = 1; i <= n; i++) {
			list.add(i);
			
		}
		
		while(list.size() > 1) {	
			list.remove();
			list.add(list.remove());
		}
		
		bw.write(list.peek().toString());		
		bw.flush();
		bw.close();
		br.close();

	}
}