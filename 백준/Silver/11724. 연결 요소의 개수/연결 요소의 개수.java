import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int count;
    
    public static void dfs(int a) {
        visited[a] = true;
        
        for(int next : graph.get(a)) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점의 갯수
        int m = Integer.parseInt(st.nextToken()); // 간선의 갯수
        
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        visited = new boolean[n + 1];
        for(int i = 1; i <= n; i++) {
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}