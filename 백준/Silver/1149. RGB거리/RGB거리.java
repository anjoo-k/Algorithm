import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] dp;
    static int[][] cost;
    static int n;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        cost = new int[n][3];
        dp = new int[n][3];

        // 각 집을 칠하는 비용 입력
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            cost[i][0] = Integer.parseInt(st.nextToken()); // 빨강
            cost[i][1] = Integer.parseInt(st.nextToken()); // 초록
            cost[i][2] = Integer.parseInt(st.nextToken()); // 파랑
        }

        // 첫 번째 집은 해당 색으로 칠하는 비용이 바로 dp 값이 됨
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        // 두 번째 집부터는 이전 집과 다른 색을 선택
        for (int i = 1; i < n; i++) {
            dp[i][0] = cost[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]); // 빨강으로 칠한 경우
            dp[i][1] = cost[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]); // 초록으로 칠한 경우
            dp[i][2] = cost[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]); // 파랑으로 칠한 경우
        }

        // 마지막 집에서 최소값 선택
        int result = Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));

        System.out.println(result);
    }
}