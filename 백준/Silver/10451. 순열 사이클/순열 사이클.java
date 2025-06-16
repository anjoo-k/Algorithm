import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
/*
     사이클이 생기는 순열
     예) 1 -> 3 -> 5 -> 1
     DFS 쓰자
     -----------> 여기까진 혼자 구상완..
     
 */
public class Main {

    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());  // 테스트 케이스 수


        for(int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());  // 순열의 크기
            arr = new int[n + 1];
            visited = new boolean[n + 1];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            
            int count = 0;
            for(int z = 1; z <= n; z++) {
                if(!visited[z]) { //  1. visited[i]가 false일 때 = 방문하지 않았을 때
                    dfs(z);
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int num){
        visited[num]  = true;  //  2. 현재 위치 방문 처리
        int next = arr[num];  // 3. 다음 이동할 곳
        
        if(!visited[next]) {   // 아직 안가본 곳이면
            dfs(next);  // 다음 위치로 재귀적 이동
        }
    }
}