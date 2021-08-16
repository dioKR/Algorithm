package DFS;

import java.util.Scanner;

// 백트랙킹 개념 공부가 필요할듯

// DFS
// 알파벳
// 골드 4
public class BJ1987 {
    static int R, C;
    static int[][] map;
    static boolean[] visited = new boolean[26];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int cnt = 0;

    public static void dfs(int x, int y, int count) {
        if(visited[map[x][y]]) {
            cnt = Math.max(cnt, count);
        } else {
            visited[map[x][y]] = true;
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && nx < R && ny >= 0 && ny < C) {
                    dfs(nx, ny, count + 1);
                }
            }
            visited[map[x][y]] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        sc.nextLine();

        map = new int[R][C];

        for(int i=0; i<R; i++) {
            String str = sc.nextLine();
            for(int j=0; j<C; j++) {
                map[i][j] = str.charAt(j) - 'A';
            }
        }

        dfs(0,0,0);
        System.out.println(cnt);
    }

}