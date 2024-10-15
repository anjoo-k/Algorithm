import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] tmp = new int[n];
		
		for(int i = 0; i < n; i++) {
			tmp[i] = 1;
			
			for(int j = 0; j < i; j++) {
				if(arr[j] < arr[i] && tmp[i] < tmp[j] + 1) {
					tmp[i] = tmp[j] + 1;
		
				}
			}
		}
		
		int length = -1;
		for(int i = 0; i < n; i++) {
			length = tmp[i] > length ? tmp[i] : length;
		}
		
		System.out.println(length);	
	}
}