package DFS.BAEKJOON;

import java.util.Scanner;

// 내리막길
// DP 적용해야함 --> 공부필요
// 다시 한번 볼 것
public class BJ1520 {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int m, n;
    static int[][] map, dp;


    public static int DFS(int x, int y) {
        if(x == m-1 && y == n-1) return 1;

        if(dp[x][y] != -1) {
            return dp[x][y];
        }

        dp[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx >= m || ny >= n) continue;

            if(map[x][y] > map[nx][ny]) {
                dp[x][y] += DFS(nx, ny);
            }
        }
        return dp[x][y];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        map = new int[m][n];
        dp = new int[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                dp[i][j] = -1;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        System.out.println(DFS(0, 0));

    }
}
