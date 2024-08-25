import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		int v;
		int a = 0;
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		v = Integer.parseInt(br.readLine());
		
		for(int result : arr) {
			if(result == v){
				a++;
			}
		}
		
		bw.write(String.valueOf(a)); 
		bw.flush();
		
	}

}