import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		List<Integer> list = new LinkedList();
		
		for(int i = 0; i < s.length(); i++) {
			list.add(Integer.parseInt(String.valueOf(s.charAt(i))));
		}
		
		
		Collections.sort(list);
		
		for(int i = 0; i < s.length(); i++) {
			sb.append(list.get(s.length() - 1 - i));
		}
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
}