package DFS;

import java.util.Scanner;

// 이코테 DFS
public class TIC_DFS_3 {

    static int n;
    static int m;
    static int[][] map;
    static int count = 0;

    static boolean dfs(int x, int y) {
        if(x <= -1 || x >= n || y <= -1 || y >= m) return false;
        if(map[x][y] == 0) {
            map[x][y] = 1;
            dfs(x-1, y);
            dfs(x, y-1);
            dfs(x+1, y);
            dfs(x, y+1);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(dfs(i, j)) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
