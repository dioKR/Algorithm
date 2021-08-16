package DFS;

import java.util.Scanner;

// DFS
// 섬의 개수
// 실버2
public class BJ4963 {

    static int w;
    static int h;
    static int[][] map;
    static int cnt;

    public static boolean dfs(int x, int y) {
        if(x <= -1 || x >= h || y <= -1 || y >= w ) return false;
        if(map[x][y] == 1) {
            map[x][y] = 0;
            dfs(x-1, y);
            dfs(x, y+1);
            dfs(x+1, y);
            dfs(x, y-1);
            dfs(x+1, y+1);
            dfs(x+1, y-1);
            dfs(x-1, y-1);
            dfs( x-1, y+1);
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            cnt = 0;
            w = sc.nextInt(); h = sc.nextInt();
            map = new int[h][w];
            if(w == 0 && h == 0) break;

            for(int i=0; i<h; i++) {
                for(int j=0; j<w; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<h; i++) {
                for(int j=0; j<w; j++) {
                    if(dfs(i,j)) cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

}
