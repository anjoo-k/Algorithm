import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st1;
		StringTokenizer st2;
		StringTokenizer st3;
		
		int n = Integer.parseInt(br.readLine()); // 자료 구조의 갯수
		st1 = new StringTokenizer(br.readLine(), " "); // 수열 A
		st2 = new StringTokenizer(br.readLine(), " "); // 수열 B
		
		Deque<String> q = new LinkedList();
		for(int i = 0; i < n; i++) {
			if(st1.nextToken().contains("0")) {
				q.add(st2.nextToken());
			} else {
				st2.nextToken();
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		st1 = new StringTokenizer(br.readLine(), " ");
		 //queuestack에 삽입할 원소 담고 있는 수열 C
		
		for(int i = 0; i < m; i++) {
			q.addFirst(st1.nextToken());	
			sb.append(q.pollLast()).append(" ");
		}
		
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}