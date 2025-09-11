import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    
    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static int count = 0;
    
    public static void dfs(int node, int n) {
        visited[node] = true;
        count++;
        for(int next : list.get(node)) {
            if(!visited[next]) {
                dfs(next, n);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine()); // 컴퓨터 수
        int m = Integer.parseInt(br.readLine()); // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수
        
        
        for(int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        
        for(int i = 1; i <= m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            list.get(a).add(b);
            list.get(b).add(a);
        }
        visited = new boolean[n + 1];
        dfs(1, n);
        sb.append(count - 1);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}