import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	static int length;
	static String[] str;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s;
		
		while((s = br.readLine()) != null && s.matches("-?\\d+")) {
			
			int n = Integer.parseInt(s);
			
			length = (int)Math.pow(3, n); // 총 길이
			str = new String[length];
			
	        for (int i = 0; i < length; i++) {
	            str[i] = "-";
	        }
			
			line(0, length);
			
	        for (int i = 0; i < length; i++) {
	            sb.append(str[i]);
	        }
	        sb.append("\n");
		}

	
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	public static void line(int start, int length) {
		
		if(length == 1) {
			return;
		}
		
		int tmpLength = length / 3;

		for(int i = start + tmpLength; i < start + (2 * tmpLength); i++) {
			str[i] = " ";
		};
		
		line(start, tmpLength);
		line(start + (2 * tmpLength), tmpLength);
	}
}