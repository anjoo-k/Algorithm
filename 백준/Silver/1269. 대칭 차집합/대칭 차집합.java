import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= a; i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= b; i++) {
			setB.add(Integer.parseInt(st.nextToken()));
		}
		
		HashSet setC = new HashSet(setA);
		setC.removeAll(setB);
		
		int temp = setC.size();
		
		setC = new HashSet(setB);
		setC.removeAll(setA);
		
		sb.append(temp + setC.size());
		
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}