package DFS;

import java.util.Scanner;

// 깊이우선탐색(Depth First Search)
// 유기농 배추
// 실버2
public class BJ1012 {

    static int[][] map;
    static int t;
    static int m;
    static int n;
    static int k;
    static int cnt;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
            m = sc.nextInt();
            n = sc.nextInt();
            k = sc.nextInt();

            cnt = 0;
            map = new int[n][m];

            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[y][x] = 1;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                   if(dfs(i, j)) {
                       cnt++;
                   }
                }
            }

            System.out.println(cnt);

        }

    }

    public static boolean dfs(int y, int x) {
        if(x <= -1 || y >= n || y <= -1 || x >= m) return false;
        if(map[y][x] == 1) {
            map[y][x] = 0;
            dfs(y-1, x);
            dfs(y, x-1);
            dfs(y+1, x);
            dfs(y, x+1);
            return true;
        }
        return false;
    }

}
