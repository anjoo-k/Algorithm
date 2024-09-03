import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer stn;
		StringTokenizer stm;
		
		int n = Integer.parseInt(br.readLine());
		stn = new StringTokenizer(br.readLine(), " ");
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(stn.nextToken());
		}
		
		Arrays.sort(arr); // 이분 탐색을 위해서는 배열이 반드시 정렬되어 있어야}
		
		
		int m = Integer.parseInt(br.readLine());
		stm = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < m; i++) {
			
			if(binarySearch(arr, Integer.parseInt(stm.nextToken())) >= 0) {
				sb.append(1).append("\n");
			} else {
				sb.append(0).append("\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	
	public static int binarySearch(int[] arr, int key) {
		
		int lo = 0; // 배열 왼쪽 끝 인덱스
		int hi = arr.length - 1; // 배열 오른쪽 끝 인덱스
		
		while(lo <= hi) { // 탐색 범위의 왼쪽 끝과 오른쪽 끝이 같은 경우까지 탐색
			
			int mid = (lo + hi) / 2; // 중간위치
			
			if(key < arr[mid]) { // lo ~ mid 사이에 key가 존재
				
				hi = mid - 1;
				
			} else if(key > arr[mid]) { // mid ~ hi 사이에 key가 존재
				
				lo = mid + 1;
				
			} else if(key == arr[mid]) { // key값과 중간값이 같음: 원하는 값을 찾은 것!
				 
				return 1;
				
			}			 
		}
		
		return -1; // 찾고 싶은 값이 없을 경우
		
	}

}