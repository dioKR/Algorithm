package DFS.BAEKJOON;

import java.util.Scanner;

// 욕심쟁이 판다
public class BJ1937 {

    public static int n;
    public static int[][] map;
    public static int[][] dp;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int DFS(int x, int y) {

        if(dp[x][y] != 0) {
            return dp[x][y];
        }

        dp[x][y] = 1;

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;

            if(map[x][y] < map[nx][ny]) {
                dp[x][y] = Math.max(dp[x][y], DFS(nx,ny) + 1);
            }
        }
        return dp[x][y];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        map = new int[n][n];
        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, DFS(i,j));
            }
        }

        System.out.println(ans);


    }
}
